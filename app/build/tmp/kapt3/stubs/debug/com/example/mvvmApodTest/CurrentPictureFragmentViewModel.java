package com.example.mvvmApodTest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0006H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/example/mvvmApodTest/CurrentPictureFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "()V", "_viewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/mvvmApodTest/PictureOfDayModel;", "currentPictureOfDay", "teg", "", "viewState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "setCurrentPictureOfDay", "", "pictureOfDayModel", "submitViewState", "app_debug"})
public final class CurrentPictureFragmentViewModel extends androidx.lifecycle.ViewModel implements org.koin.core.component.KoinComponent {
    private final java.lang.String teg = "SecondFragmentViewModel";
    private com.example.mvvmApodTest.PictureOfDayModel currentPictureOfDay;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.mvvmApodTest.PictureOfDayModel> _viewState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.mvvmApodTest.PictureOfDayModel> viewState = null;
    
    public CurrentPictureFragmentViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.mvvmApodTest.PictureOfDayModel> getViewState() {
        return null;
    }
    
    private final void submitViewState(com.example.mvvmApodTest.PictureOfDayModel viewState) {
    }
    
    public final void setCurrentPictureOfDay(@org.jetbrains.annotations.NotNull()
    com.example.mvvmApodTest.PictureOfDayModel pictureOfDayModel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}