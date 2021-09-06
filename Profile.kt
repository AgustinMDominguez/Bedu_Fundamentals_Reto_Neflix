
class Profile(val name: String, val isKidsType: Boolean = false) {
    var currentMovie: Movie? = null
    val favoriteMovies: MutableSet<Int> = mutableSetOf()
    val seenMovies: MutableSet<Int> = mutableSetOf()
    /*
    init {
        val preferenceMap
        var subtitlesPreferenceLang: String
        var audioPreferenceLang: String
    }
    */

    fun addFavoriteMovie(movie: Movie) {
        favoriteMovies.add(movie.getId())
        println("Movie added to favorites")
    }

    fun removeFavoriteMovie(movie: Movie) {
        try {
            favoriteMovies.remove(movie.getId())
            println("Movie removed from favorites")
        }
        catch (e: Exception) {
            println("Movie not found in favorites")
        }
    }
}