package com.bignerdranch.codapizza.core.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.bignerdranch.codapizza.core.StringResource
import com.bignerdranch.codapizza.core.getStringResource
import com.bignerdranch.codapizza.core.model.Topping
import com.bignerdranch.codapizza.core.model.ToppingPlacement

@Composable
expect fun ToppingPlacementDialog(
    topping: Topping,
    onSetToppingPlacement: (placement: ToppingPlacement?) -> Unit,
    onDismissRequest: () -> Unit
)

@Composable
fun ToppingPlacementDialogContent(
    topping: Topping,
    onSetToppingPlacement: (placement: ToppingPlacement?) -> Unit,
    onDismissRequest: () -> Unit
) {
    Column {
        val toppingName = getStringResource(topping.toppingName)
        Text(
            text = getStringResource(StringResource.PlacementPrompt, toppingName),
            style = MaterialTheme.typography.subtitle1,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(24.dp)
        )

        ToppingPlacement.values().forEach { placement ->
            ToppingPlacementOption(
                placementName = placement.label,
                onClick = {
                    onSetToppingPlacement(placement)
                    onDismissRequest()
                }
            )
        }

        ToppingPlacementOption(
            placementName = StringResource.PlacementNone,
            onClick = {
                onSetToppingPlacement(null)
                onDismissRequest()
            }
        )
    }
}

@Composable
private fun ToppingPlacementOption(
    placementName: StringResource,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    TextButton(
        onClick = onClick,
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            text = getStringResource(placementName),
            modifier = Modifier.padding(8.dp)
        )
    }
}
