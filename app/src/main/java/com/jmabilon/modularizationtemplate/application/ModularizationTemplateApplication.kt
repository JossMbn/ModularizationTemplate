package com.jmabilon.modularizationtemplate.application

import android.app.Application
import com.jmabilon.modularizationtemplate.application.setup.di.DiSetup
import com.jmabilon.modularizationtemplate.application.setup.di.DiSetupImpl

class ModularizationTemplateApplication : Application(),
    DiSetup by DiSetupImpl() {

    override fun onCreate() {
        super.onCreate()

        initDi(context = this)
    }
}
