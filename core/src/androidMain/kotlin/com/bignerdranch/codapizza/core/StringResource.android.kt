package com.bignerdranch.codapizza.core

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource as androidStringResource

@Composable
actual fun getStringResource(stringResource: StringResource): String {
    return androidStringResource(stringResource.resourceId)
}

@Composable
actual fun getStringResource(stringResource: StringResource, vararg formatArgs: Any): String {
    return androidStringResource(stringResource.resourceId, *formatArgs.toList().toTypedArray())
}

private val StringResource.resourceId: Int
    get() {
        return when (this) {
            StringResource.AppName -> R.string.app_name
            StringResource.PlaceOrderButton -> R.string.place_order_button
            StringResource.OrderPlacedToast -> R.string.order_placed_toast
            StringResource.PlacementPrompt -> R.string.placement_prompt
            StringResource.PlacementNone -> R.string.placement_none
            StringResource.PlacementLeft -> R.string.placement_left
            StringResource.PlacementRight -> R.string.placement_right
            StringResource.PlacementAll -> R.string.placement_all
            StringResource.ToppingBasil -> R.string.topping_basil
            StringResource.ToppingMushroom -> R.string.topping_mushroom
            StringResource.ToppingOlive -> R.string.topping_olive
            StringResource.ToppingPeppers -> R.string.topping_peppers
            StringResource.ToppingPepperoni -> R.string.topping_pepperoni
            StringResource.ToppingPineapple -> R.string.topping_pineapple
            StringResource.PizzaPreview -> R.string.pizza_preview
        }
    }