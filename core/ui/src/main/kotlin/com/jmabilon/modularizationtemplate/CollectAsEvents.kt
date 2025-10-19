package com.jmabilon.modularizationtemplate

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.flow.Flow

/**
 * Collects values emitted by the given [source] flow when the lifecycle
 * is at least in the [Lifecycle.State.STARTED] state, and executes [block]
 * for each emitted item.
 *
 * Useful for collecting one-off events in a composable safely.
 */
@Composable
fun <T> CollectAsEvents(
    source: Flow<T>,
    block: (T) -> Unit
) {
    val lifecycleOwner = LocalLifecycleOwner.current

    LaunchedEffect(source, lifecycleOwner.lifecycle) {
        lifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
            source.collect(block)
        }
    }
}
