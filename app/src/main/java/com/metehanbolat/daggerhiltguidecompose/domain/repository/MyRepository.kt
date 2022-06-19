package com.metehanbolat.daggerhiltguidecompose.domain.repository

interface MyRepository {

    suspend fun doNetworkCall()
}