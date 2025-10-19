package com.jmabilon.modularizationtemplate

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jmabilon.modularizationtemplate.model.OnBoardingAction
import org.koin.androidx.compose.koinViewModel

@Composable
fun OnBoardingRoot(
    viewModel: OnBoardingViewModel = koinViewModel(),
) {
    OnBoardingPage(
        onAction = viewModel::onAction
    )
}

@Composable
private fun OnBoardingPage(
    onAction: (OnBoardingAction) -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        OnBoardingPageContent(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            onAction = onAction
        )
    }
}

@Composable
private fun OnBoardingPageContent(
    modifier: Modifier = Modifier,
    onAction: (OnBoardingAction) -> Unit
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = { onAction(OnBoardingAction.OnValidateButtonClicked) }) {
            Text(text = "Complete OnBoarding")
        }
    }
}

@Preview
@Composable
private fun OnBoardingPagePreview() {
    OnBoardingPage(
        onAction = {}
    )
}
