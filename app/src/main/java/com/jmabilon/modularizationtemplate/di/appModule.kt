package com.jmabilon.modularizationtemplate.di

import com.jmabilon.modularizationtemplate.MainActivityViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    viewModelOf(::MainActivityViewModel)
}
