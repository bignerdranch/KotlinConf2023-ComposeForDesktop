package com.bignerdranch.codapizza.core

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

@Composable
actual fun getImageResource(imageResource: ImageResource): Painter {
    return painterResource(id = imageResource.resourceId)
}

private val ImageResource.resourceId: Int
    get() = when (this) {
        ImageResource.PizzaCrust -> R.drawable.pizza_crust
        ImageResource.ToppingBasil -> R.drawable.topping_basil
        ImageResource.ToppingMushroom -> R.drawable.topping_mushroom
        ImageResource.ToppingOlive -> R.drawable.topping_olive
        ImageResource.ToppingPepperoni -> R.drawable.topping_pepperoni
        ImageResource.ToppingPeppers -> R.drawable.topping_peppers
        ImageResource.ToppingPineapple -> R.drawable.topping_pineapple
    }