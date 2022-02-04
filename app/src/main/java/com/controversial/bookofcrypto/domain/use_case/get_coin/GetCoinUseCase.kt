package com.controversial.bookofcrypto.domain.use_case.get_coin

import androidx.versionedparcelable.NonParcelField
import com.controversial.bookofcrypto.common.Resource
import com.controversial.bookofcrypto.data.remote.dto.toCoinDetail
import com.controversial.bookofcrypto.domain.model.Coin
import com.controversial.bookofcrypto.domain.model.CoinDetail
import com.controversial.bookofcrypto.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.annotation.Nonnull
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository,
) {
    operator fun invoke(coinId:String): Flow<Resource<CoinDetail>> = flow {
        try
        {
            emit(Resource.Loading())
            val coin=repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        }catch (e: HttpException)
        {
            emit(Resource.Error(e.localizedMessage?:"An unexpected error ocurred"))
        }catch (e: IOException)
        {
            emit(Resource.Error("Couldn't reach server.Check your internet connection"))
        }
    }
}
