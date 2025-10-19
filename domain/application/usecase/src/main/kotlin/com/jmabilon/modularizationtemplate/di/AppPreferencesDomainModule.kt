package com.jmabilon.modularizationtemplate.di

import com.jmabilon.modularizationtemplate.ObserveAppDataUseCase
import com.jmabilon.modularizationtemplate.SetOnBoardingCompletionUseCase
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val appPreferencesDomainModule = module {
    singleOf(::ObserveAppDataUseCase)
    singleOf(::SetOnBoardingCompletionUseCase)
}
