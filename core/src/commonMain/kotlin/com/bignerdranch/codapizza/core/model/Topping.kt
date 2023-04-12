package com.bignerdranch.codapizza.core.model

import com.bignerdranch.codapizza.core.ImageResource
import com.bignerdranch.codapizza.core.StringResource

enum class Topping(
    val toppingName: StringResource,
    val pizzaOverlayImage: ImageResource
) {
    Basil(
        toppingName = StringResource.ToppingBasil,
        pizzaOverlayImage = ImageResource.ToppingBasil
    ),

    Mushroom(
        toppingName = StringResource.ToppingMushroom,
        pizzaOverlayImage = ImageResource.ToppingMushroom
    ),

    Olive(
        toppingName = StringResource.ToppingOlive,
        pizzaOverlayImage = ImageResource.ToppingOlive
    ),

    Peppers(
        toppingName = StringResource.ToppingPeppers,
        pizzaOverlayImage = ImageResource.ToppingPeppers
    ),

    Pepperoni(
        toppingName = StringResource.ToppingPepperoni,
        pizzaOverlayImage = ImageResource.ToppingPepperoni
    ),

    Pineapple(
        toppingName = StringResource.ToppingPineapple,
        pizzaOverlayImage = ImageResource.ToppingPineapple
    )
}
