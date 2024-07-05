package com.example.patronmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import com.example.patronmvvm.view.PaintingListScreen
import com.example.patronmvvm.view_model.PaintingViewModel

class MainActivity : ComponentActivity() {
    private val paintingViewModel: PaintingViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    PaintingListScreen(viewModel = paintingViewModel)
                }
            }
        }
    }
}
