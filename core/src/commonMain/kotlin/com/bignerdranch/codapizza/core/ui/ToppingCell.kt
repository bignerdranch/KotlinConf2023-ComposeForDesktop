package com.bignerdranch.codapizza.core.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bignerdranch.codapizza.core.getStringResource
import com.bignerdranch.codapizza.core.model.Topping
import com.bignerdranch.codapizza.core.model.ToppingPlacement

@Composable
fun ToppingCell(
    topping: Topping,
    placement: ToppingPlacement?,
    onClickTopping: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clickable { onClickTopping() }
            .padding(vertical = 4.dp, horizontal = 16.dp)
    ) {
        Checkbox(
            checked = (placement != null),
            onCheckedChange = { onClickTopping() }
        )

        Column(
            modifier = Modifier.weight(1f, fill = true)
                .padding(start = 4.dp)
        ) {
            Text(
                text = getStringResource(topping.toppingName),
                style = MaterialTheme.typography.body1
            )

            if (placement != null) {
                Text(
                    text = getStringResource(placement.label),
                    style = MaterialTheme.typography.body2
                )
            }
        }
    }
}
