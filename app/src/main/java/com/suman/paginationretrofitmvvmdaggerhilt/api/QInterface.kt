package com.suman.paginationretrofitmvvmdaggerhilt.api

import com.suman.paginationretrofitmvvmdaggerhilt.model.ResponseRequests
import retrofit2.http.GET
import retrofit2.http.Query

interface QInterface {

    @GET("3/movie/popular?api_key=7451480045324e970e0a3702ed6ff942")
   suspend fun getAllQuotes(@Query("page") page: Int):ResponseRequests

}