package com.controversial.bookofcrypto.data.repository

import com.controversial.bookofcrypto.data.remote.CoinPaprikaApi
import com.controversial.bookofcrypto.data.remote.dto.CoinDetailDto
import com.controversial.bookofcrypto.data.remote.dto.CoinDto
import com.controversial.bookofcrypto.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}