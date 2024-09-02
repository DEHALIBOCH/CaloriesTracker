package kz.dehaliboch.core.domain.preferencies

import kz.dehaliboch.core.domain.model.ActivityLevel
import kz.dehaliboch.core.domain.model.Gender
import kz.dehaliboch.core.domain.model.GoalType
import kz.dehaliboch.core.domain.model.UserInfo

interface Preferencies {

    fun saveGender(gender: Gender)

    fun saveAge(age: Int)

    fun saveWeight(weight: Float)

    fun saveHeight(height: Int)

    fun saveActivityLevel(activityLevel: ActivityLevel)

    fun saveGoalType(goalType: GoalType)

    fun saveCarbRatio(ratio: Float)

    fun saveProteinRatio(ratio: Float)

    fun saveFatRatio(ratio: Float)

    fun loadUserInfo(): UserInfo

    companion object {
        const val KEY_GENDER = "key_gender"
        const val KEY_AGE = "key_age"
        const val KEY_WEIGHT = "key_weight"
        const val KEY_HEIGHT = "key_height"
        const val KEY_ACTIVITY_LEVEL = "key_activity_level"
        const val KEY_GOAL_TYPE = "key_goal_type"
        const val KEY_CARB_RATIO = "key_carb_ratio"
        const val KEY_FAT_RATIO = "key_fat_ratio"
        const val KEY_PROTEIN_RATIO = "key_protein_ratio"
    }
}