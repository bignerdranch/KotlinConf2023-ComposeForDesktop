package com.bignerdranch.codapizza.core.model

import com.bignerdranch.codapizza.core.StringResource

enum class ToppingPlacement(
    val label: StringResource
) {
    Left(StringResource.PlacementLeft),
    Right(StringResource.PlacementRight),
    All(StringResource.PlacementAll)
}