package com.metehanbolat.daggerhiltguidecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import com.metehanbolat.daggerhiltguidecompose.ui.theme.DaggerHiltGuideComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DaggerHiltGuideComposeTheme {
                val viewModel = hiltViewModel<MyViewModel>()
            }
        }
    }
}