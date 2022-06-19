package com.metehanbolat.daggerhiltguidecompose.data.repository

import android.app.Application
import com.metehanbolat.daggerhiltguidecompose.R
import com.metehanbolat.daggerhiltguidecompose.data.remote.MyApi
import com.metehanbolat.daggerhiltguidecompose.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
    }

    override suspend fun doNetworkCall() {

    }
}