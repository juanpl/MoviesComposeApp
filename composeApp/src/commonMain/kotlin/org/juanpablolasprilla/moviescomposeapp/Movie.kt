package org.juanpablolasprilla.moviescomposeapp

data class Movie(
    val id: Int,
    val title: String,
    val poster: String
)

val movies = (1 until 100).map { number ->
    Movie(
        id = number,
        title = "Movie $number",
        poster = "https://picsum.photos/200/300?id=$number"
    )
}
