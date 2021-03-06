package com.example.rickandmorty.data.remote.apiservices

import com.example.rickandmorty.data.remote.models.Episodes
import com.example.rickandmorty.data.remote.models.RickAndMortyResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface EpisodeApi {

    @GET("api/episode")
    suspend fun getEpisode(
        @Query("page") page: Int
    ): RickAndMortyResponse<Episodes>


    @GET("api/episode/{id}")
    suspend fun getId(@Path("id") id: Int
    ): Episodes

}