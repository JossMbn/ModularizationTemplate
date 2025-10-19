package com.jmabilon.modularizationtemplate.source

import com.jmabilon.modularizationtemplate.AppData
import kotlinx.coroutines.flow.Flow

interface AppPreferencesDataSource {

    val appData: Flow<AppData>

    suspend fun setOnboardingCompleted(completed: Boolean)
}
