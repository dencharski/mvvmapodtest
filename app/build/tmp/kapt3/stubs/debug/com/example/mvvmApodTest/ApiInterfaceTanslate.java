package com.example.mvvmApodTest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H\'\u00a8\u0006\n"}, d2 = {"Lcom/example/mvvmApodTest/ApiInterfaceTanslate;", "", "translateText", "Lio/reactivex/Single;", "Lretrofit2/Response;", "Lcom/example/mvvmApodTest/TranslateResponceModel;", "key", "", "text", "lang", "app_debug"})
public abstract interface ApiInterfaceTanslate {
    
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