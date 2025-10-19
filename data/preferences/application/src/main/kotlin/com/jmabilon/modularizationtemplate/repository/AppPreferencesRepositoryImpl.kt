package com.jmabilon.modularizationtemplate.repository

import com.jmabilon.modularizationtemplate.AppData
import com.jmabilon.modularizationtemplate.AppPreferencesRepository
import com.jmabilon.modularizationtemplate.source.AppPreferencesDataSource
import kotlinx.coroutines.flow.Flow

class AppPreferencesRepositoryImpl(
    private val appPreferencesDataSource: AppPreferencesDataSource
) : AppPreferencesRepository {

    override val appData: Flow<AppData> = appPreferencesDataSource.appData

    override suspend fun setOnboardingCompleted(completed: Boolean) {
        appPreferencesDataSource.setOnboardingCompleted(completed = completed)
    }
}
