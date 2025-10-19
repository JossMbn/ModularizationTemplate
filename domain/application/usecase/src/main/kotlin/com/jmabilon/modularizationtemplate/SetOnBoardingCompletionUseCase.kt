package com.jmabilon.modularizationtemplate

class SetOnBoardingCompletionUseCase(
    private val appPreferencesRepository: AppPreferencesRepository
) {

    suspend operator fun invoke(completed: Boolean) {
        appPreferencesRepository.setOnboardingCompleted(completed)
    }
}
