package com.example.mvvmApodTest

import io.reactivex.Completable
import io.reactivex.Single
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

import retrofit2.Response

interface SearchPictureInteractor {
    suspend fun addPictureOfDayInDataBase(date: String): List<String>
    suspend fun deleteItemInDB(date: String): List<String>
    suspend fun searchPictureOfDay(date: String): Response<PictureOfDayModel>
}
class SearchPictureInteractorImpl : SearchPictureInteractor, KoinComponent {
    private val searchPictureRepository:SearchPictureRepository by inject()

    override suspend fun addPictureOfDayInDataBase(date: String): List<String> {
        return searchPictureRepository.addPictureOfDayInDataBase(date)
    }

    override suspend fun deleteItemInDB(date: String): List<String> {
        return searchPictureRepository.deleteItemInDB(date)
    }

    override suspend fun searchPictureOfDay(date: String): Response<PictureOfDayModel> {
        return searchPictureRepository.searchPictureOfDayAsync(date)
    }

}