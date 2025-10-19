package com.jmabilon.modularizationtemplate

import kotlinx.coroutines.flow.Flow

interface AppPreferencesRepository {

    val appData: Flow<AppData>

    suspend fun setOnboardingCompleted(completed: Boolean)
}
