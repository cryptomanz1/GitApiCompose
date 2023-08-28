package com.example.gitapicompose


import javax.inject.Inject

class DataRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getRepositoriesList(
        since: String,
        result: (ResultData<RepositoriesModel>) -> Unit
    ) {
        result(ResultData.Loading())
        val repositoriesModel = apiService.getPublicRepositories(since = since)

        val resultData = when (repositoriesModel.isNotEmpty()) {
            true -> {
                ResultData.Success(repositoriesModel)
            }

            else -> {
                ResultData.Failed()
            }
        }
        result(resultData)
    }
}