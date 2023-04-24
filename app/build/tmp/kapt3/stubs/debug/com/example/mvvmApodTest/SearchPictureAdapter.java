package com.example.mvvmApodTest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004\"#$%B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0011J\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005J\u0014\u0010\u001c\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001eJ\u001e\u0010\u001f\u001a\u00020\u00152\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0007j\b\u0012\u0004\u0012\u00020\n`\u000bJ\u000e\u0010 \u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010!\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/mvvmApodTest/SearchPictureAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/mvvmApodTest/SearchPictureAdapter$ViewHolder;", "()V", "addButtonListener", "Lcom/example/mvvmApodTest/SearchPictureAdapter$AddInDbClick;", "data", "Ljava/util/ArrayList;", "Lcom/example/mvvmApodTest/PictureOfDayModel;", "dateList", "", "Lkotlin/collections/ArrayList;", "delButtonListener", "Lcom/example/mvvmApodTest/SearchPictureAdapter$DelInDbClick;", "itemClickListener", "Lcom/example/mvvmApodTest/SearchPictureAdapter$ItemClick;", "getItemCount", "", "getItemViewPosition", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAddButtonClickListener", "setData", "list", "", "setDateList", "setDeleteButtonClickListener", "setItemClickListener", "AddInDbClick", "DelInDbClick", "ItemClick", "ViewHolder", "app_debug"})
public final class SearchPictureAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.mvvmApodTest.SearchPictureAdapter.ViewHolder> {
    private java.util.ArrayList<com.example.mvvmApodTest.PictureOfDayModel> data;
    private com.example.mvvmApodTest.SearchPictureAdapter.ItemClick itemClickListener;
    private com.example.mvvmApodTest.SearchPictureAdapter.AddInDbClick addButtonListener;
    private com.example.mvvmApodTest.SearchPictureAdapter.DelInDbClick delButtonListener;
    private java.util.ArrayList<java.lang.String> dateList;
    
    public SearchPictureAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.mvvmApodTest.SearchPictureAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.mvvmApodTest.SearchPictureAdapter.ViewHolder holder, int position) {
    }
    
    public final void setDateList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mvvmApodTest.PictureOfDayModel getItemViewPosition(int position) {
        return null;
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.NotNull()
    com.example.mvvmApodTest.SearchPictureAdapter.ItemClick itemClickListener) {
    }
    
    public final void setAddButtonClickListener(@org.jetbrains.annotations.NotNull()
    com.example.mvvmApodTest.SearchPictureAdapter.AddInDbClick addButtonListener) {
    }
    
    public final void setDeleteButtonClickListener(@org.jetbrains.annotations.NotNull()
    com.example.mvvmApodTest.SearchPictureAdapter.DelInDbClick delButtonListener) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.mvvmApodTest.PictureOfDayModel> list) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/mvvmApodTest/SearchPictureAdapter$ItemClick;", "", "onItemClick", "", "item", "Lcom/example/mvvmApodTest/PictureOfDayModel;", "app_debug"})
    public static abstract interface ItemClick {
        
        public abstract void onItemClick(@org.jetbrains.annotations.Nullable()
        com.example.mvvmApodTest.PictureOfDayModel item);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/mvvmApodTest/SearchPictureAdapter$AddInDbClick;", "", "onAddInDbClick", "", "item", "Lcom/example/mvvmApodTest/PictureOfDayModel;", "app_debug"})
    public static abstract interface AddInDbClick {
        
        public abstract void onAddInDbClick(@org.jetbrains.annotations.Nullable()
        com.example.mvvmApodTest.PictureOfDayModel item);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/mvvmApodTest/SearchPictureAdapter$DelInDbClick;", "", "onDelInDbClick", "", "item", "Lcom/example/mvvmApodTest/PictureOfDayModel;", "app_debug"})
    public static abstract interface DelInDbClick {
        
        public abstract void onDelInDbClick(@org.jetbrains.annotations.Nullable()
        com.example.mvvmApodTest.PictureOfDayModel item);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/mvvmApodTest/SearchPictureAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/mvvmApodTest/databinding/ItemViewPictureOfDayBinding;", "itemClick", "Lcom/example/mvvmApodTest/SearchPictureAdapter$ItemClick;", "addInDbClick", "Lcom/example/mvvmApodTest/SearchPictureAdapter$AddInDbClick;", "delInDbClick", "Lcom/example/mvvmApodTest/SearchPictureAdapter$DelInDbClick;", "(Lcom/example/mvvmApodTest/SearchPictureAdapter;Lcom/example/mvvmApodTest/databinding/ItemViewPictureOfDayBinding;Lcom/example/mvvmApodTest/SearchPictureAdapter$ItemClick;Lcom/example/mvvmApodTest/SearchPictureAdapter$AddInDbClick;Lcom/example/mvvmApodTest/SearchPictureAdapter$DelInDbClick;)V", "addButton", "Landroid/widget/ImageButton;", "date", "Landroid/widget/TextView;", "delButton", "imageView", "Landroid/widget/ImageView;", "responseModel", "Lcom/example/mvvmApodTest/PictureOfDayModel;", "title", "bind", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.mvvmApodTest.databinding.ItemViewPictureOfDayBinding binding = null;
        private final com.example.mvvmApodTest.SearchPictureAdapter.ItemClick itemClick = null;
        private final com.example.mvvmApodTest.SearchPictureAdapter.AddInDbClick addInDbClick = null;
        private final com.example.mvvmApodTest.SearchPictureAdapter.DelInDbClick delInDbClick = null;
        private final android.widget.TextView date = null;
        private final android.widget.TextView title = null;
        private final android.widget.ImageView imageView = null;
        private final android.widget.ImageButton addButton = null;
        private final android.widget.ImageButton delButton = null;
        private com.example.mvvmApodTest.PictureOfDayModel responseModel;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.mvvmApodTest.databinding.ItemViewPictureOfDayBinding binding, @org.jetbrains.annotations.Nullable()
        com.example.mvvmApodTest.SearchPictureAdapter.ItemClick itemClick, @org.jetbrains.annotations.Nullable()
        com.example.mvvmApodTest.SearchPictureAdapter.AddInDbClick addInDbClick, @org.jetbrains.annotations.Nullable()
        com.example.mvvmApodTest.SearchPictureAdapter.DelInDbClick delInDbClick) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.mvvmApodTest.PictureOfDayModel responseModel) {
        }
    }
}