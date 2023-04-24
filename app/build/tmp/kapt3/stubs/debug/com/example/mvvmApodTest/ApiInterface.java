package com.example.mvvmApodTest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ2\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0006H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/mvvmApodTest/ApiInterface;", "", "getPictureOfDayAsync", "Lretrofit2/Response;", "Lcom/example/mvvmApodTest/PictureOfDayModel;", "date", "", "key", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "translateText", "Lio/reactivex/Single;", "Lcom/example/mvvmApodTest/TranslateResponceModel;", "text", "lang", "app_debug"})
public abstract interface ApiInterface {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "planetary/apod?")
    public abstract java.lang.Object getPictureOfDayAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "date")
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mvvmApodTest.PictureOfDayModel>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "tr.json/translate?")
    public abstract io.reactivex.Single<retrofit2.Response<com.example.mvvmApodTest.TranslateResponceModel>> translateText(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "text")
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lang")
    java.lang.String lang);
}