package com.example.mvvmApodTest



import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object DependencyModule {
    val mainActivityModule = module{

    }
    val searchPictureModule = module{
        single { ApiClient.getApiRetrofitClient()?.create(ApiInterface::class.java) }
        factory { SearchPictureRepositoryImpl(get()) as SearchPictureRepository }
        factory { SearchPictureInteractorImpl() as SearchPictureInteractor }
        viewModel { SearchPictureViewModel() }
        viewModel {CurrentPictureFragmentViewModel()}
        factory { SearchPictureAdapter() }
    }
}