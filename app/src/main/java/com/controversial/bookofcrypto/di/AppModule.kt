package com.controversial.bookofcrypto.di

import com.controversial.bookofcrypto.common.Constants
import com.controversial.bookofcrypto.data.remote.CoinPaprikaApi
import com.controversial.bookofcrypto.data.repository.CoinRepositoryImpl
import com.controversial.bookofcrypto.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi():CoinPaprikaApi
    {
        return Retrofit.Builder()
            .baseUrl(Constants.URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinPaprikaApi): CoinRepository
    {
        return CoinRepositoryImpl(api)
    }
}