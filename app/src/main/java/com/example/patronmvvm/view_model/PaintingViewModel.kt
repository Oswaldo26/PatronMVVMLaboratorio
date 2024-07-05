package com.example.patronmvvm.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.patronmvvm.R
import com.example.patronmvvm.model.Painting
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PaintingViewModel : ViewModel() {
    private val _paintings = MutableStateFlow<List<Painting>>(emptyList())
    val paintings: StateFlow<List<Painting>> get() = _paintings

    private val _selectedPainting = MutableStateFlow<Painting?>(null)
    val selectedPainting: StateFlow<Painting?> get() = _selectedPainting

    init {
        loadPaintings()
    }

    fun loadPaintings() {
        viewModelScope.launch {
            _paintings.value = listOf(
                Painting(1, "Starry Night", "Vincent van Gogh", R.drawable.nocheestrellada),
                Painting(2, "Mona Lisa", "Leonardo da Vinci", R.drawable.monalisa)
                // Agrega más pinturas aquí
            )
        }
    }

    fun selectPainting(painting: Painting) {
        _selectedPainting.value = painting
    }
}