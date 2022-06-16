package com.example.coroutine

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroInstance {

    private var url = "https://jsonplaceholder.typicode.com/"
    private var postsApi: PostsApi? = null

    fun getInstance(): PostsApi {
        if (postsApi == null) {
            postsApi =
                Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create())
                    .build().create(PostsApi::class.java)
        }
        return postsApi!!

    }
}