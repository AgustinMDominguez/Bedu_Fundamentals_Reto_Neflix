
fun getMovies(): List<Movie> {
    val movie_0 = Movie("Titanic", 152f, 1995, "R", listOf<String>("Drama", "Romantic"), "A love story starring a sinking boat and Leo DiCaprio", listOf<String>("Leo DiCaprio", "Kate Winslet"), 0)
    val movie_1 = Movie("The GodFather", 150f, 1972, "+18", listOf("Crime"), null, listOf("Marlon Brando", "Al Pacino"), 1)
    val movie_2 = Movie("The Imitation Game", 113f, 2014, "+16", listOf("Drama"), null, listOf("Benedict Cumberbatch"), 2)
    var movie_3 = Movie("The Shining", 130f, 1980 , "+18", listOf("Crime", "Horror"), null, listOf("Jack Nicholson"), 3)
    var movie_4 = Movie("The Avengers",143f,2012,"+13",listOf("Action"),"Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.", listOf("Robert Downey Jr.","Chris Evans","Scarlett Johansson"), 4)
    val movie_5 = Movie("Mad Max: Fury Road", 120.2f, 2015, "+16", listOf("Action"), "In a post-apocalyptic wasteland, a woman rebels against a tyrannical ruler in search for her homeland with the aid of a group of female prisoners, a psychotic worshiper, and a drifter named Max.", listOf("Tom Hardy", "Charlize Theron"),5)
    val movie_6 = Movie("Jumanji", 194f, 1995, "R", listOf<String>("Comedy", "Drama"), "A table game that isn't just a game", listOf<String>("Robin Williams", "Kirsten Dunst", "Bebe Neuwirth"), 6)
    var movie_7 = Movie("Alice in Wonderland", 108f,2010,"ATP", listOf("Animation", "Fantasy", "Family"), "Nineteen-year-old Alice returns to the magical world from her childhood adventure, where she reunites with her old friends and learns of her true destiny: to end the Red Queen's reign of terror.", listOf("Mia Wasikowska", "Johnny Deep", "Helena Bonham Carter"), 7)
    //val m = Movie("Pirates of the Caribbean: The Curse of the Black Pearl", 143f, 2003, "+13", listOf("Action", "Fantasy"), "Blacksmith Will Turner teams up with eccentric pirate Captain Jack Sparrow to save Turner's love, Elizabeth Swann, from cursed pirates led by Jack's mutinous former first mate, Hector Barbossa. Jack wants revenge against Barbossa, who left him stranded on an island before stealing his ship, the Black Pearl, along with 882 pieces of cursed Aztec Gold.", listOf("Johnny Deep", "Orlando Bloom", "Keira Knightley"), )
    return listOf<Movie>(movie_0, movie_1, movie_2, movie_3, movie_4, movie_5, movie_6, movie_7)

    //return if (index in 0..7) movies[index] else null
}


