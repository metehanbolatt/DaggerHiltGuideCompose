package com.metehanbolat.daggerhiltguidecompose.di

import com.metehanbolat.daggerhiltguidecompose.data.repository.MyRepositoryImpl
import com.metehanbolat.daggerhiltguidecompose.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMyRepository(
        myRepositoryImpl: MyRepositoryImpl
    ): MyRepository
}