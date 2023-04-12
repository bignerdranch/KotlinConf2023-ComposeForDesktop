package com.bignerdranch.codapizza.core

expect interface Parcelable

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
expect annotation class Parcelize()