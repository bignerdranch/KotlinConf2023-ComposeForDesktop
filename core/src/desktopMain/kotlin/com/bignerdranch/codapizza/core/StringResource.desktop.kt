package com.bignerdranch.codapizza.core

import androidx.compose.runtime.Composable

@Composable
actual fun getStringResource(stringResource: StringResource): String {
    return stringResource.text
}

@Composable
actual fun getStringResource(stringResource: StringResource, vararg formatArgs: Any): String {
    return stringResource.text.format(*formatArgs.toList().toTypedArray())
}

private val StringResource.text: String
    get() = when (this) {
        StringResource.AppName -> "Coda Pizza"
        StringResource.PlaceOrderButton -> "Place Order (%s)"
        StringResource.OrderPlacedToast -> "Order submitted!"
        StringResource.PlacementPrompt -> "Where do you want %s on your pizza?"
        StringResource.PlacementNone -> "None"
        StringResource.PlacementLeft -> "Left half"
        StringResource.PlacementRight -> "Right half"
        StringResource.PlacementAll -> "Whole pizza"
        StringResource.ToppingBasil -> "Basil"
        StringResource.ToppingMushroom -> "Mushrooms"
        StringResource.ToppingOlive -> "Olives"
        StringResource.ToppingPeppers -> "Peppers"
        StringResource.ToppingPepperoni -> "Pepperoni"
        StringResource.ToppingPineapple -> "Pineapple"
        StringResource.PizzaPreview -> "Pizza preview"
    }