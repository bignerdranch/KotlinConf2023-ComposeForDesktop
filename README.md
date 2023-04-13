# Compose for Desktop Codelab

This codelab was developed for KotlinConf 2023 and covers Kotlin Multiplatform and Compose for Desktop.
It uses the CodaPizza app that readers have developed in the Android Programming: A Big Nerd Ranch Guide up through the Themes chapter as a starting point, with a few small tweaks intended to speed up the codelab.
Both the starting point and the final solution are present in this repository, the starting point is here in the `main` git branch, while the solution (and all the work needed to get to the solution) lives in the `solution` git branch.

---

## Prerequistes

- A solid understanding of the following topics:
  - Kotlin
  - Jetpack Compose (a basic understanding of Android will do)
  - Gradle
- In order to work on the codelab, they need the following setup:
  - Android Studio
    - Android Studio Electric Eel 2022.1.1 is fine
    - IntelliJ would probably be passable
  - Android SDK
    - A device or emulator to run the Android app

---

## Goals

- Understand how to reuse existing Jetpack Compose code to make desktop applications
- Dip your toes into writing Kotlin Multiplatform code

---

## Running the app

- On Android, you can easily compile the app in Android Studio. If you want to compile the app from the command line, use:
```
./gradlew :app:assembleDebug
```
- On desktop, on the `solution` git branch, you can run the app using the following Gradle command:
```
./gradlew :desktop:run
```
