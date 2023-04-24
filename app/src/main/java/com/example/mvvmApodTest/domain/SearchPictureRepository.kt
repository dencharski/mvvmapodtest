package com.example.mvvmApodTest

import io.reactivex.Completable
import io.reactivex.Single
import retrofit2.Response

interface SearchPictureRepository {
    suspend fun searchPictureOfDayAsync(date: String):Response<PictureOfDayModel>
    suspend fun deleteItemInDB(date: String): List<String>
    suspend fun addPictureOfDayInDataBase(date: String): List<String>
}