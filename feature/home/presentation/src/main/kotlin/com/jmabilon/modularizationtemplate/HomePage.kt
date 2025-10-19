package com.jmabilon.modularizationtemplate

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeRoot() {
    HomePage()
}

@Composable
private fun HomePage() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        HomePageContent(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        )
    }
}

@Composable
private fun HomePageContent(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Home Page")
    }
}

@Preview
@Composable
private fun HomePagePreview() {
    HomePage()
}
