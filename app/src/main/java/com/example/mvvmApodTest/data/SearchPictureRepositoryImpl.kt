package com.example.mvvmApodTest

import android.annotation.SuppressLint
import android.util.Log
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import retrofit2.Response
import java.lang.Exception

class SearchPictureRepositoryImpl(
    private val api: ApiInterface
) : SearchPictureRepository {
    private val tag = this.javaClass.name

    private var inDataBase=ArrayList<String>()

    override suspend fun searchPictureOfDayAsync(date: String): Response<PictureOfDayModel> {
        return api.getPictureOfDayAsync(date,MainViewModel.API_KEY)
    }


    @SuppressLint("CheckResult")
    override suspend fun deleteItemInDB(date: String): List<String> {
        Log.d(this.javaClass.name, " remove value in Values.listWithDate")
        inDataBase.remove(date)

        return inDataBase
    }

    override suspend fun addPictureOfDayInDataBase(date: String): List<String> {
        Log.d(this.javaClass.name, " add value in Values.listWithDate")
        inDataBase.add(date)

        return inDataBase

    }
}