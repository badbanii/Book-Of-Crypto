package com.controversial.bookofcrypto.domain.model

import com.controversial.bookofcrypto.data.remote.dto.CoinDto
import com.google.gson.annotations.SerializedName

data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,

)
fun CoinDto.toCoin(): Coin
{
    return Coin(
        id=id,
        isActive = isActive,
        name=name,
        rank=rank,
        symbol=symbol
    )
}