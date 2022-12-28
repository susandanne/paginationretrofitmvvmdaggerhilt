package com.suman.paginationretrofitmvvmdaggerhilt.di

import com.suman.paginationretrofitmvvmdaggerhilt.Constant
import com.suman.paginationretrofitmvvmdaggerhilt.api.QInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class networkmodel {
@Singleton
@Provides
fun retrofitbuilder():Retrofit.Builder{
    return Retrofit.Builder()
        .baseUrl(Constant.base_url)
        .addConverterFactory(GsonConverterFactory.create())

    }
@Singleton
@Provides
    fun getalldataQInterface(retrofit: Retrofit.Builder):QInterface{
        return retrofit.build().create(QInterface::class.java)
}

}