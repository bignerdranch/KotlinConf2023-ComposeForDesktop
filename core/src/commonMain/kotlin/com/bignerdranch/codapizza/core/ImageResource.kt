package com.bignerdranch.codapizza.core

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter

enum class ImageResource {
    PizzaCrust,
    ToppingBasil,
    ToppingMushroom,
    ToppingOlive,
    ToppingPepperoni,
    ToppingPeppers,
    ToppingPineapple
}

@Composable
expect fun getImageResource(imageResource: ImageResource): Painter