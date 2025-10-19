package com.jmabilon.modularizationtemplate.model

sealed interface OnBoardingAction {
    data object OnValidateButtonClicked : OnBoardingAction
}
