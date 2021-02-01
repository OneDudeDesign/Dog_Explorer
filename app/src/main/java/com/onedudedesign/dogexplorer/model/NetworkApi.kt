package com.onedudedesign.dogexplorer.model

import com.onedudedesign.dogexplorer.model.entities.Breed
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Header

interface NetworkApi {
    @GET("breeds")
    fun getBreeds(@Header("x-api-key") xApiKey: String): Deferred<List<Breed>>
}