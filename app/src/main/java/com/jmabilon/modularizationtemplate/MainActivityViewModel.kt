package com.jmabilon.modularizationtemplate

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class MainActivityViewModel(
    observeAppDataUseCase: ObserveAppDataUseCase
) : ViewModel() {

    val onBoardingCompleted: StateFlow<Boolean?> =
        observeAppDataUseCase().map { it.isOnboardingCompleted }
            .stateIn(scope = viewModelScope, started = SharingStarted.Eagerly, initialValue = null)
}
