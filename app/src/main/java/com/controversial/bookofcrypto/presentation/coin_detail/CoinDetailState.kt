package com.controversial.bookofcrypto.presentation.coin_detail

import com.controversial.bookofcrypto.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading:Boolean=false,
    val coin: CoinDetail?=null,
    val error:String=""
)
