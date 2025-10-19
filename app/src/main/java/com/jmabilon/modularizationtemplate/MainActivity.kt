package com.jmabilon.modularizationtemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.jmabilon.modularizationtemplate.ui.ModularizationTemplateApp
import com.jmabilon.modularizationtemplate.ui.theme.ModularizationTemplateTheme
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {

    private val viewModel by inject<MainActivityViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val onBoardingCompleted by viewModel.onBoardingCompleted.collectAsStateWithLifecycle()

            ModularizationTemplateTheme {
                when (onBoardingCompleted) {
                    true -> ModularizationTemplateApp()
                    false -> OnBoardingRoot()
                    null -> {
                        /* no-op */
                    }
                }
            }
        }
    }
}
