package com.jmabilon.modularizationtemplate

import kotlinx.coroutines.flow.Flow

class ObserveAppDataUseCase(
    private val appPreferencesRepository: AppPreferencesRepository
) {

    operator fun invoke(): Flow<AppData> = appPreferencesRepository.appData
}
