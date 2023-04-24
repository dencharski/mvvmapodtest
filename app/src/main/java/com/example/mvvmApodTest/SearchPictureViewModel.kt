package com.example.mvvmApodTest

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.core.component.KoinComponent
import org.koin.core.component.get

import java.lang.Exception


class SearchPictureViewModel : ViewModel(), KoinComponent {

    private val searchPictureInteractor: SearchPictureInteractor = get()

    private val teg = "SearchPictureViewModel"
    private var currentViewState = ViewState(
        choseYear = "1995",
        choseMonth = "06",
        choseDay = "20",
        choseDataDataBase = "",
        pictureOfDay = PictureOfDayModel("", "", "", "", "", "", "", ""),
        isLoading = false,
        errorMessage = "",
        listWithDate = arrayListOf(""),
        itemClick = false
    )
    // private val _viewState = MutableLiveData<ViewState>()
    // val viewState: LiveData<ViewState> = _viewState

    private val _viewState = MutableStateFlow(currentViewState)
    val viewState: StateFlow<ViewState> = _viewState
    private var arrayListWithDate = ArrayList<String>()


    private fun submitViewState(viewState: ViewState) {
        currentViewState = viewState
        _viewState.value = currentViewState
    }

    fun onInteraction(interaction: Interaction) {
        when (interaction) {
            is Interaction.YearChange -> setYear(interaction.year)
            is Interaction.MonthChange -> setMonth(interaction.month)
            is Interaction.DayChange -> setDay(interaction.day)
            is Interaction.ErrorMessageChanged -> setErrorValue(interaction.errorMessage)
            is Interaction.DataDataBaseChange -> setDataDataBase(interaction.dataDataBase)
            is Interaction.AddListWithDate -> setListWithDate(interaction.list)
            is Interaction.SearchPictureClick -> searchPicture()
            is Interaction.AddPictureOfDayInDataBaseClick -> addPictureOfDayInDataBase(interaction.date)
            is Interaction.DeleteItemInDBClick -> deleteItemInDB()
            is Interaction.ItemClick -> itemWasClick(interaction.itemClick)
            else -> {
                Log.d(this.javaClass.name, " onInteraction smth. wrong")
            }
        }
    }

    private fun itemWasClick(value: Boolean) {
        submitViewState(currentViewState.copy(itemClick = value))
    }

    private fun searchPicture() {
        submitViewState(currentViewState.copy(isLoading = true))

        viewModelScope.launch(Dispatchers.IO) {
            try {
                val result =
                    searchPictureInteractor.searchPictureOfDay("${currentViewState.choseYear}-${currentViewState.choseMonth}-${currentViewState.choseDay}")
                withContext(Dispatchers.Main) {
                    if (result.isSuccessful) {
                        submitViewState(currentViewState.copy(pictureOfDay = result.body()))
                        submitViewState(currentViewState.copy(isLoading = false))
                        Log.d(this.javaClass.name, "it = ${result.body()}")
                        Log.d(this.javaClass.name, "viewState = ${viewState.value.pictureOfDay}")
                    } else {
                        submitViewState(
                            currentViewState.copy(
                                errorMessage = result.errorBody().toString()
                            )
                        )
                        submitViewState(currentViewState.copy(isLoading = false))
                    }
                }
            } catch (e: Exception) {
                submitViewState(currentViewState.copy(isLoading = false))
                Log.d(teg, e.message.toString())
            }
        }
    }

    private fun setErrorValue(value: String?) {
        if (value != null) {
            submitViewState(currentViewState.copy(errorMessage = value))
        }
    }

    private fun setYear(year: String) {
        submitViewState(currentViewState.copy(choseYear = year))
        Log.d(this.javaClass.name, "currentViewState = ${currentViewState.choseYear}")
        Log.d(this.javaClass.name, "_viewState = ${_viewState.value?.choseYear}")
        Log.d(this.javaClass.name, "viewState = ${viewState.value?.choseYear}")
    }

    private fun setMonth(month: String) {
        submitViewState(currentViewState.copy(choseMonth = month))
    }

    private fun setDay(day: String) {
        submitViewState(currentViewState.copy(choseDay = day))
    }

    private fun setDataDataBase(dataDataBase: String) {
        submitViewState(currentViewState.copy(choseDataDataBase = dataDataBase))
    }

    private fun setListWithDate(list:List<String>){
        arrayListWithDate = list as ArrayList<String>
        submitViewState(currentViewState.copy(listWithDate = arrayListWithDate))
    }

    private fun addPictureOfDayInDataBase(date: String) {
        if (!arrayListWithDate.contains(currentViewState.choseDataDataBase)) {
            Log.d(this.javaClass.name, " add value in Values.listWithDate")

            viewModelScope.launch(Dispatchers.IO) {
                try {
                    val result = searchPictureInteractor.addPictureOfDayInDataBase(date)
                    withContext(Dispatchers.Main) {
                        arrayListWithDate = result as ArrayList<String>

                        submitViewState(currentViewState.copy(listWithDate = arrayListWithDate))
                    }
                } catch (e: Exception) {
                    Log.d(teg, e.message.toString())
                }
            }

        }
        Log.d(
            this.javaClass.name, """Values.listWithDate2 =${arrayListWithDate},
            | currentViewState.choseDataDataBase = ${currentViewState.choseDataDataBase}
        """.trimMargin()
        )
    }

    private fun deleteItemInDB() {

        viewModelScope.launch(Dispatchers.IO) {
            try {
                val result =
                    searchPictureInteractor.deleteItemInDB(currentViewState.choseDataDataBase)
                withContext(Dispatchers.Main) {
                    arrayListWithDate = result as ArrayList<String>
                    submitViewState(currentViewState.copy(listWithDate = arrayListWithDate))
                }
            } catch (e: Exception) {
                Log.d(teg, e.message.toString())
            }
        }
    }
}