package com.bignerdranch.codapizza.core.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Dialog
import com.bignerdranch.codapizza.core.getStringResource
import com.bignerdranch.codapizza.core.model.Topping
import com.bignerdranch.codapizza.core.model.ToppingPlacement

@Composable
actual fun ToppingPlacementDialog(
    topping: Topping,
    onSetToppingPlacement: (placement: ToppingPlacement?) -> Unit,
    onDismissRequest: () -> Unit
) {
    Dialog(
        title = "Adding topping - ${getStringResource(topping.toppingName)}",
        onCloseRequest = onDismissRequest
    ) {
        ToppingPlacementDialogContent(
            topping = topping,
            onSetToppingPlacement = onSetToppingPlacement,
            onDismissRequest = onDismissRequest
        )
    }
}