package com.example.lazycolumncompose

data class MarvelChar(
    var charName: String,
    var name: String,
    var imageRes: Int,
)

fun getMarvelChars(): List<MarvelChar>{
    return listOf(
        MarvelChar("Spiderman", "Peter Parker", R.drawable.spider),
        MarvelChar("Iron Man", "Tony Stark", R.drawable.iron),
        MarvelChar("Thanos", "Josh Brolin", R.drawable.thanos),
        MarvelChar("Captain America", "Steve Rogers", R.drawable.captain),
        MarvelChar("Ant-Man", "Scott Lang", R.drawable.antman),
        MarvelChar("Arrow", "Oliver Queen", R.drawable.arrow),
        MarvelChar("Spiderman", "Peter Parker", R.drawable.spider),
        MarvelChar("Iron Man", "Tony Stark", R.drawable.iron),
        MarvelChar("Thanos", "Josh Brolin", R.drawable.thanos),
        MarvelChar("Captain America", "Steve Rogers", R.drawable.thor),
        MarvelChar("Ant-Man", "Scott Lang", R.drawable.antman),
        MarvelChar("Arrow", "Oliver Queen", R.drawable.arrow),
        MarvelChar("Spiderman", "Peter Parker", R.drawable.spider),
        MarvelChar("Iron Man", "Tony Stark", R.drawable.iron),
        MarvelChar("Thanos", "Josh Brolin", R.drawable.thanos),
        MarvelChar("Captain America", "Steve Rogers", R.drawable.thor),
        MarvelChar("Ant-Man", "Scott Lang", R.drawable.antman),
        MarvelChar("Arrow", "Oliver Queen", R.drawable.arrow),
        )}

