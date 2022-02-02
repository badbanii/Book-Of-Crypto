package com.controversial.bookofcrypto.presentation.coin_list

import com.controversial.bookofcrypto.domain.model.Coin


data class CoinListState(
    val isLoading:Boolean=false,
    val coins:List<Coin> =emptyList(),
    val error:String=""
)
