package com.example.lazycolumncompose

data class MarvelChar(
    var charName: String,
    var name: String,
    var imageRes: Int,
)

fun getMarvelChars(): List<MarvelChar>{
    return listOf(
        MarvelChar("Spiderman", "Peter Parker", R.drawable.dn),
        MarvelChar("Iron Man", "Tony Stark", R.drawable.iron),
        MarvelChar("Captain America", "Steve Rogers", R.drawable.thanos),
        MarvelChar("Captain America", "Steve Rogers", R.drawable.thor),
        )}

