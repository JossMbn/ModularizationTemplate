package com.jmabilon.modularizationtemplate.model

import android.annotation.SuppressLint
import kotlinx.serialization.Serializable

@SuppressLint("UnsafeOptInUsageError")
@Serializable
data class AppPreferences(
    val isOnboardingCompleted: Boolean = false
)
