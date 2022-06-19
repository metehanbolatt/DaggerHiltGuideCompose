package com.metehanbolat.daggerhiltguidecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.daggerhiltguidecompose.ui.theme.DaggerHiltGuideComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DaggerHiltGuideComposeTheme {

            }
        }
    }
}