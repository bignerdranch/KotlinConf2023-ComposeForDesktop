package com.bignerdranch.codapizza.core

actual interface Parcelable

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
actual annotation class Parcelize actual constructor()