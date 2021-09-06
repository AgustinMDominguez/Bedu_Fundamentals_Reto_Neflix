

fun getIntNumber(callable: () -> Unit, range: IntRange): Int {
    while (true) {
        try{
            val option: Int = readLine()!!.toInt()
            if (option in range){
                return option
            } else
                throw Exception("Bad Input")
        }
        catch(e:Exception){
            println("Ingrese una opcion válida por favor...")
            callable()
        }
    }
}

/*
when(opcionInt){
    1 -> println("Add user")
    2 -> println("Delete user")
    3 -> println("Modify user")
    0-> System.exit(0);
}*/

fun showList() {
    val movies = getMovies()
    movies.forEach {
        println("(${it.getId()}) - Title: ${it.title}")
    }
}

fun addToFavorites(profile: Profile) {
    showList()
    fun printPrompt() {
        showList()
        println("Select a movie to add to favorites")
    }
    printPrompt()
    val range = IntRange(0, getMovies().size - 1)
    val movieId = getIntNumber(::printPrompt, range)
    profile.addFavoriteMovie(getMovies()[movieId])
}

fun MostrarPeliculas() {
    fun printPrompt() {
        println("Peliculas")
        println("----------------------")
        println("1-Show My movie list")
        println("2-Add Movie to List")
        println("3-Delete Movie from List")
    }
    printPrompt()
    val option = getIntNumber(::printPrompt, 0..3)
    val profile = Profile("Agustin")
    when(option){
        1 -> showList()
        2 -> addToFavorites(profile)
        3 -> println("Delete from List")
        0-> System.exit(0)
    }
}

fun MostrarUsuarios() {
    var opcionInt = 0;
    println("Users")
    println("----------------------")
    println("1-Add User") // val user = User(...) -> users.Add(user)
    println("2-Delete User") //User.removeProfile(id)
    println("3-Modify User") //User.modifyUser(id)
}

fun MostrarMenuPrincipal(){
    println("Netflix");

    fun printPrompt() {
        println("--------------------------------------------")
        println("1-Mostrar Películas")
        println("2-Cambiar Usuario")
        println("0-Salir")
    }

    printPrompt()
    val opcionInt: Int = getIntNumber(::printPrompt, 0..2)
    when(opcionInt){
        1 -> MostrarPeliculas()
        2-> MostrarUsuarios()
        0-> System.exit(0);
    }
}

fun main() {
    println("Netflix")
    while (true) {
        MostrarMenuPrincipal()
    }
}
