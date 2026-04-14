package com.nimbus.stream

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.nimbus.stream.ui.screens.HomeScreen
import com.nimbus.stream.ui.theme.NimbusBackground

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Force RTL for Arabic Support
            CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                HomeScreen()
            }
        }
    }
}
