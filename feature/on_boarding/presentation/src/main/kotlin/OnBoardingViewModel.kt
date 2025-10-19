import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jmabilon.modularizationtemplate.ObserveAppDataUseCase
import com.jmabilon.modularizationtemplate.SetOnBoardingCompletionUseCase
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import model.OnBoardingAction
import model.OnBoardingEvent
import model.OnBoardingState

class OnBoardingViewModel(
    private val observeAppDataUseCase: ObserveAppDataUseCase,
    private val setOnBoardingCompletionUseCase: SetOnBoardingCompletionUseCase
) : ViewModel() {

    private val _event = MutableSharedFlow<OnBoardingEvent>()
    val event = _event.asSharedFlow()

    private val _state = MutableStateFlow(OnBoardingState())
    val state = _state
        .onStart {
            // Load initial data here
            setOnBoardingCompletionUseCase(completed = true)
            loadData()
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
        viewModelScope.launch {
            observeAppDataUseCase().collect { data ->
                Log.d("KOIN_TEST", "loadData: ${data.isOnboardingCompleted}")
            }
        }
    }
}
