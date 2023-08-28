package com.example.gitapicompose

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val dataRepository: DataRepository
): ViewModel() {
    private var _repositoriesListLiveData: MutableLiveData<ResultData<RepositoriesModel>> = MutableLiveData()
    val repositoriesListLiveData: LiveData<ResultData<RepositoriesModel>> get() = _repositoriesListLiveData

    private fun getRepositoriesList(since: String) {
        viewModelScope.launch(Dispatchers.IO) {
            dataRepository.getRepositoriesList(since = since) { result ->
                _repositoriesListLiveData.postValue(result)
            }
        }
    }

    init {
        getRepositoriesList("1")
    }
}