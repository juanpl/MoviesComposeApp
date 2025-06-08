package org.juanpablolasprilla.moviescomposeapp

data class Movie(
    val id: Int,
    val title: String,
    val poster: String
)

val movies = (1 until 100).map { id ->
    Movie(
        id = id,
        title = "Movie $id",
        poster = "https://picsum.photos/200/300?random=$id"
    )
}
