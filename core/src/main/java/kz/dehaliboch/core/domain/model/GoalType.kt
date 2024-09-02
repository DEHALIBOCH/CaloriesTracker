package kz.dehaliboch.core.domain.model

sealed class GoalType(val name: String) {

    object LoseWeight : GoalType(LOSE_WEIGHT_STR)
    object KeepWeight : GoalType(KEEP_WEIGHT_STR)
    object GainWeight : GoalType(GAIN_WEIGHT_STR)

    companion object {
        fun fromString(name: String?): GoalType {
            return when (name) {
                LOSE_WEIGHT_STR -> LoseWeight
                KEEP_WEIGHT_STR -> KeepWeight
                GAIN_WEIGHT_STR -> GainWeight
                else -> throw IllegalArgumentException("value \"$name\" not supported")
            }
        }

        private const val LOSE_WEIGHT_STR = "lose_weight"
        private const val KEEP_WEIGHT_STR = "keep_weighr"
        private const val GAIN_WEIGHT_STR = "gain_weight"
    }
}
