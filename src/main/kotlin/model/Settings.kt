package model

object Settings {
    var language: String = "Arabic"
        private set
    var theme: String = "Dark"
        private set

    fun logOut(user: User) =
        println("User (${user.userName}) logout")

    fun changeThemeToLight() {
        theme = "Light"
    }

    fun changeThemeToDark() {
        theme = "Dark"
    }

    fun changeLanguageToEnglish() {
        language = "English"
    }

    fun changeLanguageToArabic() {
        language = "Arabic"
    }
}