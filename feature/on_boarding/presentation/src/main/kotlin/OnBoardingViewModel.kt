import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import model.OnBoardingAction
import model.OnBoardingEvent
import model.OnBoardingState

class OnBoardingViewModel : ViewModel() {

    private val _event = MutableSharedFlow<OnBoardingEvent>()
    val event = _event.asSharedFlow()

    private val _state = MutableStateFlow(OnBoardingState())
    val state = _state
        .onStart {
            // Load initial data here
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.Lazily,
            initialValue = OnBoardingState()
        )

    fun onAction(action: OnBoardingAction) {
        when (action) {
            else -> {
                // Handle actions
            }
        }
    }

    private fun loadData() {
        // ...
    }
}
