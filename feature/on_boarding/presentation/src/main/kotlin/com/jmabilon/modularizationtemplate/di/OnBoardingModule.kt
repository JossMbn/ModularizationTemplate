package com.jmabilon.modularizationtemplate.di

import com.jmabilon.modularizationtemplate.OnBoardingViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val onBoardingModule = module {
    viewModelOf(::OnBoardingViewModel)
}
