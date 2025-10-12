package com.jmabilon.modularizationtemplate.navigation

import OnBoardingNavigator
import OnBoardingRoot
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

// ==================================================================================
//  Route
// ==================================================================================

@Serializable
data object OnBoardingRoute

// ==================================================================================
//  Navigator
// ==================================================================================

class OnBoardingNavigatorImpl(
    private val controller: NavController? = null
) : OnBoardingNavigator {

    override fun navigateBack() {
        controller?.navigateUp()
    }
}

// ==================================================================================
//  Graph extension
// ==================================================================================

fun NavGraphBuilder.onBoardingPage(
    controller: NavController
) {
    composable<OnBoardingRoute> {
        OnBoardingRoot(navigator = OnBoardingNavigatorImpl(controller = controller))
    }
}
