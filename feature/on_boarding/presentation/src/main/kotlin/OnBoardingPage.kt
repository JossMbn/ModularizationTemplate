import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import model.OnBoardingAction
import model.OnBoardingState
import org.koin.androidx.compose.koinViewModel

@Composable
fun OnBoardingRoot(
    viewModel: OnBoardingViewModel = koinViewModel(),
    navigator: OnBoardingNavigator
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    OnBoardingPage(
        state = state,
        onAction = viewModel::onAction,
        navigator = navigator
    )
}

@Composable
private fun OnBoardingPage(
    state: OnBoardingState,
    onAction: (OnBoardingAction) -> Unit,
    navigator: OnBoardingNavigator
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        OnBoardingPageContent(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            state = state,
            onAction = onAction,
            navigator = navigator
        )
    }
}

@Composable
private fun OnBoardingPageContent(
    modifier: Modifier = Modifier,
    state: OnBoardingState,
    onAction: (OnBoardingAction) -> Unit,
    navigator: OnBoardingNavigator
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Text(text = "OnBoarding Page")
    }
}

@Preview
@Composable
private fun OnBoardingPagePreview() {
    OnBoardingPage(
        state = OnBoardingState(),
        onAction = {},
        navigator = object : OnBoardingNavigator { /* no-op */ }
    )
}
