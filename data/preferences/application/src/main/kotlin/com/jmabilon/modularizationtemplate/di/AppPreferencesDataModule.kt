package com.jmabilon.modularizationtemplate.di

import com.jmabilon.modularizationtemplate.AppPreferencesRepository
import com.jmabilon.modularizationtemplate.repository.AppPreferencesRepositoryImpl
import com.jmabilon.modularizationtemplate.serializer.AppPreferencesSerializer
import com.jmabilon.modularizationtemplate.source.AppPreferencesDataSource
import com.jmabilon.modularizationtemplate.source.AppPreferencesDataSourceImpl
import extension.createDataStore
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

internal const val APP_PREFERENCES_DATA_STORE_FILE_NAME = "app_preferences.pb"

val appPreferencesDataModule = module {
    singleOf(::AppPreferencesRepositoryImpl).bind<AppPreferencesRepository>()
    singleOf(::AppPreferencesDataSourceImpl).bind<AppPreferencesDataSource>()

    single {
        androidContext().createDataStore(
            fileName = APP_PREFERENCES_DATA_STORE_FILE_NAME,
            serializer = AppPreferencesSerializer()
        )
    }
}
