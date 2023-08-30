package model

import enumuration.Theme
import org.intellij.lang.annotations.Language

//Singleton
//Enum
object Settings {
    var language: enumuration.Language = enumuration.Language.ARABIC
        private set
    var theme: Theme = Theme.DARK
        private set

    fun logOut(user: User) =
        println("User (${user.userName}) logout")

    fun changeThemeToLight() {
        theme = Theme.LIGHT
    }

    fun changeThemeToDark() {
        theme = Theme.DARK
    }

    fun changeLanguageToEnglish() {
        language = enumuration.Language.ENGLISH
    }

    fun changeLanguageToArabic() {
        language = enumuration.Language.ARABIC
    }
}