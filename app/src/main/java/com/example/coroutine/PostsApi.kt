package com.example.coroutine

import retrofit2.Response
import retrofit2.http.GET

interface PostsApi {
    @GET("posts")
    suspend fun getdata () : Response<Posts>
}