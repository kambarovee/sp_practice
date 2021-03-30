package com.example.mvvmpractice.repository

class Repository() {
    fun getRandomString(): String {
        return listOfString.random()
    }

    val listOfString =
        listOf<String>(
            "Google",
            "Android",
            "Kotlin",
            "MVVM",
            "Huawei",
            "Xiaomi",
            "Samsung",
            "Pixel"
        )
}
