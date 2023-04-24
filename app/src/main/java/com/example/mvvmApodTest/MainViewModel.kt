package com.example.mvvmApodTest


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow

class MainViewModel : ViewModel() {
    companion object {
        const val tag = " My Values Class"
        const val API_KEY = "biPKsmbnEKINusgDXcBz0GTCSNwVVQMNh8sGqjkJ"
        const val Translate_API_KEY =
            "trnsl.1.1.20200102T212837Z.c08d983f6579dd4a.873869cb2c743f4560e7c2f944d5780f16262c3b"
    }

    private val mutablePictureOfDayModel: MutableLiveData<PictureOfDayModel> =
        MutableLiveData(PictureOfDayModel("", "", "", "", "", "", "", ""))
    val pictureOfDayModel: LiveData<PictureOfDayModel> get() = mutablePictureOfDayModel

    private val mutablePictureOfDayWhoNeedAddInDB: MutableLiveData<PictureOfDayModel> =
        MutableLiveData(PictureOfDayModel("", "", "", "", "", "", "", ""))
    val pictureOfDayWhoNeedAddInDB: LiveData<PictureOfDayModel> get() = mutablePictureOfDayWhoNeedAddInDB

    private val mutableListWithDate: MutableLiveData<List<String>> = MutableLiveData()
    val listWithDate: MutableLiveData<List<String>> get() = mutableListWithDate
    fun setPictureOfDayModel(pictureOfDayModel: PictureOfDayModel) {
        mutablePictureOfDayModel.value = pictureOfDayModel
    }

    fun setPictureOfDayWhoNeedAddInDB(pictureOfDayWhoNeedAddInDB: PictureOfDayModel) {
        mutablePictureOfDayWhoNeedAddInDB.value = pictureOfDayWhoNeedAddInDB
    }
    fun setListWithDate(list: List<String>) {
        mutableListWithDate.value = list
    }

    //val listWithDate2: MutableSharedFlow<List<String>> = MutableSharedFlow(1, 0, BufferOverflow.DROP_OLDEST)

}