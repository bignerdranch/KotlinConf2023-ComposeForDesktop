package com.bignerdranch.codapizza.core.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.bignerdranch.codapizza.core.ImageResource
import com.bignerdranch.codapizza.core.StringResource
import com.bignerdranch.codapizza.core.getImageResource
import com.bignerdranch.codapizza.core.getStringResource
import com.bignerdranch.codapizza.core.model.Pizza
import com.bignerdranch.codapizza.core.model.ToppingPlacement.All
import com.bignerdranch.codapizza.core.model.ToppingPlacement.Left
import com.bignerdranch.codapizza.core.model.ToppingPlacement.Right

@Composable
fun PizzaHeroImage(
    pizza: Pizza,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .aspectRatio(1f)
    ) {
        Image(
            painter = getImageResource(ImageResource.PizzaCrust),
            contentDescription = getStringResource(StringResource.PizzaPreview),
            modifier = Modifier.fillMaxSize()
        )

        pizza.toppings.forEach { (topping, placement) ->
            Image(
                painter = getImageResource(topping.pizzaOverlayImage),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alignment = when (placement) {
                    Left -> Alignment.TopStart
                    Right -> Alignment.TopEnd
                    All -> Alignment.Center
                },
                modifier = Modifier.focusable(false)
                    .aspectRatio(when (placement) {
                        Left, Right -> 0.5f
                        All -> 1.0f
                    })
                    .align(when (placement) {
                        Left -> Alignment.CenterStart
                        Right -> Alignment.CenterEnd
                        All -> Alignment.Center
                    })
            )
        }
    }
}
