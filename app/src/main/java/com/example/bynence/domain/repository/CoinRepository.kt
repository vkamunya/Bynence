package com.example.bynence.domain.repository

import com.example.bynence.data.remote.dto.CoinDetailDto
import com.example.bynence.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto


}