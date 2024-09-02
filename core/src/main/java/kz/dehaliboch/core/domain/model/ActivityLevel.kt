package kz.dehaliboch.core.domain.model

sealed class ActivityLevel(val name: String) {

    object Low : ActivityLevel(LOW_STR)
    object Medium : ActivityLevel(MEDIUM_STR)
    object High : ActivityLevel(HIGH_STR)

    companion object {
        fun fromString(name: String?): ActivityLevel {
            return when (name) {
                LOW_STR -> Low
                MEDIUM_STR -> Medium
                HIGH_STR -> High
                else -> throw IllegalArgumentException("value \"$name\" not supported")
            }
        }

        private const val LOW_STR = "low"
        private const val MEDIUM_STR = "medium"
        private const val HIGH_STR = "high"
    }
}
