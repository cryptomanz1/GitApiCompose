package com.example.gitapicompose


import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET(NetworkingConstants.URL_REPOSITORIES)
    suspend fun getPublicRepositories(
        @Query("since") since: String
    ): RepositoriesModel
}