package com.controversial.bookofcrypto.domain.repository

import com.controversial.bookofcrypto.data.remote.dto.CoinDetailDto
import com.controversial.bookofcrypto.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins():List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}