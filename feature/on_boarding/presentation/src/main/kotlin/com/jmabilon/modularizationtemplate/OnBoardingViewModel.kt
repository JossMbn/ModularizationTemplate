package com.jmabilon.modularizationtemplate

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jmabilon.modularizationtemplate.model.OnBoardingAction
import kotlinx.coroutines.launch

class OnBoardingViewModel(
    private val setOnBoardingCompletionUseCase: SetOnBoardingCompletionUseCase
) : ViewModel() {

    fun onAction(action: OnBoardingAction) {
        when (action) {
            OnBoardingAction.OnValidateButtonClicked -> validateOnBoardingCompletion()
        }
    }

    private fun validateOnBoardingCompletion() {
        viewModelScope.launch {
            setOnBoardingCompletionUseCase(true)
        }
    }
}
