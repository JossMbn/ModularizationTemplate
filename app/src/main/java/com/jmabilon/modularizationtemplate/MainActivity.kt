package com.jmabilon.modularizationtemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.jmabilon.modularizationtemplate.ui.theme.ModularizationTemplateTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ModularizationTemplateTheme {
                ModularizationTemplateApp()
            }
        }
    }
}
