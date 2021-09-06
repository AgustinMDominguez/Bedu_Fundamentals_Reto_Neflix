
class Movie(
    val title: String,
    val duration: Float,
    val releaseYear: Int,
    val clasification: String,
    val genre: List<String>? = null,
    val description: String? = null,
    val actors: List<String>? = null,
    private val id: Int
) {
    var playing: Boolean = false
    fun getId(): Int = id

    fun play() {
        playing = true
        println("Playing Movie...")
    }

    fun pause() {
        playing = false
        println("Movied paused")
    }
}