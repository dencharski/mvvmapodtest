package com.example.mvvmApodTest

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import org.koin.core.component.KoinComponent

class CurrentPictureFragmentViewModel : ViewModel(), KoinComponent {

    private val teg = "SecondFragmentViewModel"
    private var currentPictureOfDay = PictureOfDayModel("", "", "", "", "", "", "", "")

    private val _viewState = MutableStateFlow(currentPictureOfDay)
    val viewState: StateFlow<PictureOfDayModel> = _viewState

    private fun submitViewState(viewState: PictureOfDayModel) {
        currentPictureOfDay = viewState
        _viewState.value = currentPictureOfDay
    }

    fun setCurrentPictureOfDay(pictureOfDayModel: PictureOfDayModel) {
        submitViewState(
            currentPictureOfDay.copy(
                copyright = pictureOfDayModel.copyright,
                date = pictureOfDayModel.date,
                explanation = pictureOfDayModel.explanation,
                hdurl = pictureOfDayModel.hdurl,
                media_type = pictureOfDayModel.media_type,
                service_version = pictureOfDayModel.service_version,
                title = pictureOfDayModel.title,
                url = pictureOfDayModel.url
            )
        )
    }
}