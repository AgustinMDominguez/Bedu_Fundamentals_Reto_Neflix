
class User(
    val email: String,
    val password: String,
    val name: String,
    val paymentType: String,
    val paymentInfo: Map<String, String>,
    val country: String,
    private val profiles: MutableList<Profile>,
) {
    private val PROFILE_LIMIT: Int = 5

    fun addProfile(profile: Profile) {
        if (profiles.size >= PROFILE_LIMIT) {
            println("Profile limit reached")
        } else {
            profiles.add(profile)
        }
    }

    fun removeProfile(profileIndex: Int) {
        if (profileIndex >= 0 && profileIndex < PROFILE_LIMIT) {
            val profile: Profile = profiles.removeAt(profileIndex)
            println("Profile ${profile.name} correctly deleted")
        } else {
            println("Inexistent profile. Try again")
        }
    }
}