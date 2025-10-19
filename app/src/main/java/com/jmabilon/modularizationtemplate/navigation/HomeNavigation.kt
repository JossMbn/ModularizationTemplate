package com.jmabilon.modularizationtemplate.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jmabilon.modularizationtemplate.HomeRoot
import kotlinx.serialization.Serializable

// ==================================================================================
//  Route
// ==================================================================================

@Serializable
data object HomeRoute

// ==================================================================================
//  Graph extension
// ==================================================================================

fun NavGraphBuilder.homePage() {
    composable<HomeRoute> {
        HomeRoot()
    }
}
