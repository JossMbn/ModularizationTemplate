package model

enum class OnBoardingContentView {
    Loading, Content
}

data class OnBoardingState(
    val contentView: OnBoardingContentView = OnBoardingContentView.Loading
)
