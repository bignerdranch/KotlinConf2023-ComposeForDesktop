package com.bignerdranch.codapizza.core.ui

import androidx.compose.runtime.Composable
import com.bignerdranch.codapizza.core.model.Topping
import com.bignerdranch.codapizza.core.model.ToppingPlacement

@Composable
actual fun ToppingPlacementDialog(
    topping: Topping,
    onSetToppingPlacement: (placement: ToppingPlacement?) -> Unit,
    onDismissRequest: () -> Unit
) {
}