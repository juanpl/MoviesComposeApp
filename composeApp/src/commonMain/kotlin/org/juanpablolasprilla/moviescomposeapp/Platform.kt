package org.juanpablolasprilla.moviescomposeapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform