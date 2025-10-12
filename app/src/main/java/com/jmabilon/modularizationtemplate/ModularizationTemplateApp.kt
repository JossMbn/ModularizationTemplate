package com.jmabilon.modularizationtemplate

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.jmabilon.modularizationtemplate.navigation.OnBoardingRoute
import com.jmabilon.modularizationtemplate.navigation.onBoardingPage

@Composable
fun ModularizationTemplateApp(
    modifier: Modifier = Modifier
) {
    val controller = rememberNavController()

    NavHost(
        modifier = modifier.fillMaxSize(),
        navController = controller,
        startDestination = OnBoardingRoute
    ) {
        onBoardingPage(controller = controller)
    }
}
