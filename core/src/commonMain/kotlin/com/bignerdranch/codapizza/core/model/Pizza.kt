package com.bignerdranch.codapizza.core.model

import com.bignerdranch.codapizza.core.Parcelable
import com.bignerdranch.codapizza.core.Parcelize
import com.bignerdranch.codapizza.core.model.ToppingPlacement.*

@Parcelize
data class Pizza(
    val toppings: Map<Topping, ToppingPlacement> = emptyMap()
) : Parcelable {
    val price: Double
        get() = 9.99 + toppings.asSequence()
            .sumOf { (_, toppingPlacement) ->
                when (toppingPlacement) {
                    Left, Right -> 0.5
                    All -> 1.0
                }
            }

    fun withTopping(topping: Topping, placement: ToppingPlacement?): Pizza {
        return copy(
            toppings = if (placement == null) {
                toppings - topping
            } else {
                toppings + (topping to placement)
            }
        )
    }
}
