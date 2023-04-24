package com.example.mvvmApodTest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0013H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\tH\u0002J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\tH\u0002J\u0012\u0010!\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0002J\u0016\u0010\"\u001a\u00020\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0$H\u0002J\u0010\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\tH\u0002J\u0010\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\tH\u0002J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0006H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006*"}, d2 = {"Lcom/example/mvvmApodTest/SearchPictureViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "()V", "_viewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/mvvmApodTest/ViewState;", "arrayListWithDate", "Ljava/util/ArrayList;", "", "currentViewState", "searchPictureInteractor", "Lcom/example/mvvmApodTest/SearchPictureInteractor;", "teg", "viewState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "addPictureOfDayInDataBase", "", "date", "deleteItemInDB", "itemWasClick", "value", "", "onInteraction", "interaction", "Lcom/example/mvvmApodTest/Interaction;", "searchPicture", "setDataDataBase", "dataDataBase", "setDay", "day", "setErrorValue", "setListWithDate", "list", "", "setMonth", "month", "setYear", "year", "submitViewState", "app_debug"})
public final class SearchPictureViewModel extends androidx.lifecycle.ViewModel implements org.koin.core.component.KoinComponent {
    private final com.example.mvvmApodTest.SearchPictureInteractor searchPictureInteractor = null;
    private final java.lang.String teg = "SearchPictureViewModel";
    private com.example.mvvmApodTest.ViewState currentViewState;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.mvvmApodTest.ViewState> _viewState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.mvvmApodTest.ViewState> viewState = null;
    private java.util.ArrayList<java.lang.String> arrayListWithDate;
    
    public SearchPictureViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.mvvmApodTest.ViewState> getViewState() {
        return null;
    }
    
    private final void submitViewState(com.example.mvvmApodTest.ViewState viewState) {
    }
    
    public final void onInteraction(@org.jetbrains.annotations.NotNull()
    com.example.mvvmApodTest.Interaction interaction) {
    }
    
    private final void itemWasClick(boolean value) {
    }
    
    private final void searchPicture() {
    }
    
    private final void setErrorValue(java.lang.String value) {
    }
    
    private final void setYear(java.lang.String year) {
    }
    
    private final void setMonth(java.lang.String month) {
    }
    
    private final void setDay(java.lang.String day) {
    }
    
    private final void setDataDataBase(java.lang.String dataDataBase) {
    }
    
    private final void setListWithDate(java.util.List<java.lang.String> list) {
    }
    
    private final void addPictureOfDayInDataBase(java.lang.String date) {
    }
    
    private final void deleteItemInDB() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}