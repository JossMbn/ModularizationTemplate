package com.jmabilon.modularizationtemplate.source

import androidx.datastore.core.DataStore
import com.jmabilon.modularizationtemplate.AppData
import com.jmabilon.modularizationtemplate.model.AppPreferences
import extension.safeUpdateData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class AppPreferencesDataSourceImpl(
    private val appPreferences: DataStore<AppPreferences>
) : AppPreferencesDataSource {

    override val appData: Flow<AppData> = appPreferences.data.map { preferences ->
        AppData(
            isOnboardingCompleted = preferences.isOnboardingCompleted
        )
    }

    override suspend fun setOnboardingCompleted(completed: Boolean) {
        appPreferences.safeUpdateData { data ->
            data.copy(isOnboardingCompleted = completed)
        }
    }
}
