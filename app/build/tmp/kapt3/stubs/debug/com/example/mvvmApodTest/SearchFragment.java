package com.example.mvvmApodTest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020>H\u0002J\b\u0010@\u001a\u00020>H\u0003J\u0010\u0010A\u001a\u00020\u00122\u0006\u0010B\u001a\u00020CH\u0003J\b\u0010D\u001a\u00020>H\u0002J\u0012\u0010E\u001a\u00020>2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J$\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010M2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0012\u0010P\u001a\u00020>2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010Q\u001a\u00020>H\u0016J\u0012\u0010R\u001a\u00020>2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\u0010\u0010S\u001a\u00020>2\u0006\u0010T\u001a\u00020UH\u0002J\b\u0010V\u001a\u00020>H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\r\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b4\u0010\r\u001a\u0004\b2\u00103R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00120\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006W"}, d2 = {"Lcom/example/mvvmApodTest/SearchFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/mvvmApodTest/SearchPictureAdapter$AddInDbClick;", "Lcom/example/mvvmApodTest/SearchPictureAdapter$ItemClick;", "Lcom/example/mvvmApodTest/SearchPictureAdapter$DelInDbClick;", "()V", "_binding", "Lcom/example/mvvmApodTest/databinding/FragmentSearchBinding;", "adapter", "Lcom/example/mvvmApodTest/SearchPictureAdapter;", "getAdapter", "()Lcom/example/mvvmApodTest/SearchPictureAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "getBinding", "()Lcom/example/mvvmApodTest/databinding/FragmentSearchBinding;", "choseDay", "", "getChoseDay", "()Ljava/lang/String;", "setChoseDay", "(Ljava/lang/String;)V", "choseMonth", "getChoseMonth", "setChoseMonth", "choseYear", "getChoseYear", "setChoseYear", "dayList", "Ljava/util/ArrayList;", "errorText", "Landroid/widget/TextView;", "frameLayout", "Landroid/widget/FrameLayout;", "mainViewModel", "Lcom/example/mvvmApodTest/MainViewModel;", "getMainViewModel", "()Lcom/example/mvvmApodTest/MainViewModel;", "mainViewModel$delegate", "monthList", "", "progressBarSearchPicture", "Landroid/widget/ProgressBar;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "searchButton", "Landroid/widget/Button;", "searchPictureViewModel", "Lcom/example/mvvmApodTest/SearchPictureViewModel;", "getSearchPictureViewModel", "()Lcom/example/mvvmApodTest/SearchPictureViewModel;", "searchPictureViewModel$delegate", "spinnerDay", "Landroid/widget/Spinner;", "spinnerMonth", "spinnerYear", "swipeContainer", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "teg", "yearList", "addDateSpinners", "", "addDayList", "addYearList", "getYears", "year", "", "observeViewState", "onAddInDbClick", "item", "Lcom/example/mvvmApodTest/PictureOfDayModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDelInDbClick", "onDestroyView", "onItemClick", "render", "viewState", "Lcom/example/mvvmApodTest/ViewState;", "setInteractions", "app_debug"})
public final class SearchFragment extends androidx.fragment.app.Fragment implements com.example.mvvmApodTest.SearchPictureAdapter.AddInDbClick, com.example.mvvmApodTest.SearchPictureAdapter.ItemClick, com.example.mvvmApodTest.SearchPictureAdapter.DelInDbClick {
    private com.example.mvvmApodTest.databinding.FragmentSearchBinding _binding;
    private final kotlin.Lazy searchPictureViewModel$delegate = null;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private final java.lang.String teg = "SearchPictureFragment";
    private final kotlin.Lazy adapter$delegate = null;
    private android.widget.TextView errorText;
    private android.widget.Spinner spinnerYear;
    private android.widget.Spinner spinnerMonth;
    private android.widget.Spinner spinnerDay;
    private android.widget.ProgressBar progressBarSearchPicture;
    private android.widget.FrameLayout frameLayout;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeContainer;
    private android.widget.Button searchButton;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private final java.util.ArrayList<java.lang.String> yearList = null;
    private final java.util.ArrayList<java.lang.String> dayList = null;
    private final java.util.List<java.lang.String> monthList = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String choseYear = "1995";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String choseMonth = "06";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String choseDay = "20";
    
    public SearchFragment() {
        super();
    }
    
    private final com.example.mvvmApodTest.databinding.FragmentSearchBinding getBinding() {
        return null;
    }
    
    private final com.example.mvvmApodTest.SearchPictureViewModel getSearchPictureViewModel() {
        return null;
    }
    
    private final com.example.mvvmApodTest.MainViewModel getMainViewModel() {
        return null;
    }
    
    private final com.example.mvvmApodTest.SearchPictureAdapter getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChoseYear() {
        return null;
    }
    
    public final void setChoseYear(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChoseMonth() {
        return null;
    }
    
    public final void setChoseMonth(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChoseDay() {
        return null;
    }
    
    public final void setChoseDay(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.Nullable()
    com.example.mvvmApodTest.PictureOfDayModel item) {
    }
    
    @java.lang.Override()
    public void onAddInDbClick(@org.jetbrains.annotations.Nullable()
    com.example.mvvmApodTest.PictureOfDayModel item) {
    }
    
    @java.lang.Override()
    public void onDelInDbClick(@org.jetbrains.annotations.Nullable()
    com.example.mvvmApodTest.PictureOfDayModel item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void observeViewState() {
    }
    
    private final void render(com.example.mvvmApodTest.ViewState viewState) {
    }
    
    private final void setInteractions() {
    }
    
    private final void addDateSpinners() {
    }
    
    private final void addDayList() {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat", "NewApi"})
    private final void addYearList() {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi", "SimpleDateFormat"})
    private final java.lang.String getYears(int year) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}