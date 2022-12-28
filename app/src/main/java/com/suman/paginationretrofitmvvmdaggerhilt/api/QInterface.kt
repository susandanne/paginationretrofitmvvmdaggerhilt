package com.suman.paginationretrofitmvvmdaggerhilt.api

import com.suman.paginationretrofitmvvmdaggerhilt.model.ResponseRequests
import retrofit2.http.GET
import retrofit2.http.Query

interface QInterface {

    @GET("/movie")
   suspend fun getAllQuotes(@Query("popular") page: Int):ResponseRequests

}