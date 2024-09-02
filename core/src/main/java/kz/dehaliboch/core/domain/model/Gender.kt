package kz.dehaliboch.core.domain.model

sealed class Gender(val name: String) {

    object Male : Gender(MALE_STR)

    object Female : Gender(FEMALE_STR)

    companion object {
        fun fromString(name: String?): Gender {
            return when (name) {
                MALE_STR -> Male
                FEMALE_STR -> Female
                else -> throw IllegalArgumentException("value \"$name\" not supported")
            }
        }

        private const val MALE_STR = "male"
        private const val FEMALE_STR = "female"
    }
}
