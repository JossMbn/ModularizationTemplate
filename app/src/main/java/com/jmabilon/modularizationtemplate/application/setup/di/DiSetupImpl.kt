package com.jmabilon.modularizationtemplate.application.setup.di

import android.content.Context
import com.jmabilon.modularizationtemplate.di.appModule
import com.jmabilon.modularizationtemplate.di.appPreferencesDataModule
import com.jmabilon.modularizationtemplate.di.appPreferencesDomainModule
import com.jmabilon.modularizationtemplate.di.onBoardingModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DiSetupImpl : DiSetup {

    override fun initDi(context: Context) {
        startKoin {
            androidContext(androidContext = context)
            modules(
                appModule,
                onBoardingModule,
                appPreferencesDomainModule,
                appPreferencesDataModule
            )
        }
    }
}
