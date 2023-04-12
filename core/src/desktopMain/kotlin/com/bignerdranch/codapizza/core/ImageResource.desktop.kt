package com.bignerdranch.codapizza.core

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

@Composable
actual fun getImageResource(imageResource: ImageResource): Painter {
    return painterResource(imageResource.desktopPath)
}

private val ImageResource.desktopPath: String
    get() = when (this) {
        ImageResource.PizzaCrust -> "pizza_crust.webp"
        ImageResource.ToppingBasil -> "topping_basil.webp"
        ImageResource.ToppingMushroom -> "topping_mushroom.webp"
        ImageResource.ToppingOlive -> "topping_olive.webp"
        ImageResource.ToppingPepperoni -> "topping_pepperoni.webp"
        ImageResource.ToppingPeppers -> "topping_peppers.webp"
        ImageResource.ToppingPineapple -> "topping_pineapple.webp"
    }