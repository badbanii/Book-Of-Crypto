package com.controversial.bookofcrypto.data.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

data class Tag(

    val coinCounter: Int,

    val icoCounter: Int,

    val id: String,

    val name: String
)