package kz.dehaliboch.core.data.preferencies

import android.content.SharedPreferences
import kz.dehaliboch.core.domain.model.ActivityLevel
import kz.dehaliboch.core.domain.model.Gender
import kz.dehaliboch.core.domain.model.GoalType
import kz.dehaliboch.core.domain.model.UserInfo
import kz.dehaliboch.core.domain.preferencies.Preferencies

class DefaultPreferencies(val sharedPrefs: SharedPreferences) : Preferencies {

    override fun saveGender(gender: Gender) {
        sharedPrefs.edit().putString(Preferencies.KEY_GENDER, gender.name).apply()
    }

    override fun saveAge(age: Int) {
        sharedPrefs.edit().putInt(Preferencies.KEY_AGE, age).apply()
    }

    override fun saveWeight(weight: Float) {
        sharedPrefs.edit().putFloat(Preferencies.KEY_WEIGHT, weight).apply()
    }

    override fun saveHeight(height: Int) {
        sharedPrefs.edit().putInt(Preferencies.KEY_HEIGHT, height).apply()
    }

    override fun saveActivityLevel(activityLevel: ActivityLevel) {
        sharedPrefs.edit().putString(Preferencies.KEY_ACTIVITY_LEVEL, activityLevel.name).apply()
    }

    override fun saveGoalType(goalType: GoalType) {
        sharedPrefs.edit().putString(Preferencies.KEY_GOAL_TYPE, goalType.name).apply()
    }

    override fun saveCarbRatio(ratio: Float) {
        sharedPrefs.edit().putFloat(Preferencies.KEY_CARB_RATIO, ratio).apply()
    }

    override fun saveProteinRatio(ratio: Float) {
        sharedPrefs.edit().putFloat(Preferencies.KEY_PROTEIN_RATIO, ratio).apply()
    }

    override fun saveFatRatio(ratio: Float) {
        sharedPrefs.edit().putFloat(Preferencies.KEY_FAT_RATIO, ratio).apply()
    }

    override fun loadUserInfo(): UserInfo {
        val age = sharedPrefs.getInt(Preferencies.KEY_AGE, -1)
        val height = sharedPrefs.getInt(Preferencies.KEY_HEIGHT, -1)
        val weight = sharedPrefs.getFloat(Preferencies.KEY_WEIGHT, -1f)
        val gender = Gender.fromString(sharedPrefs.getString(Preferencies.KEY_GENDER, ""))
        val activityLevel = ActivityLevel.fromString(sharedPrefs.getString(Preferencies.KEY_ACTIVITY_LEVEL, ""))
        val goalType = GoalType.fromString(sharedPrefs.getString(Preferencies.KEY_GOAL_TYPE, ""))
        val carbRatio = sharedPrefs.getFloat(Preferencies.KEY_CARB_RATIO, -1f)
        val proteinRatio = sharedPrefs.getFloat(Preferencies.KEY_PROTEIN_RATIO, -1f)
        val fatRatio = sharedPrefs.getFloat(Preferencies.KEY_FAT_RATIO, -1f)

        return UserInfo(
            gender = gender,
            age = age,
            weight = weight,
            height = height,
            activityLevel = activityLevel,
            goalType = goalType,
            carbRatio = carbRatio,
            proteinRatio = proteinRatio,
            fatRatio = fatRatio
        )
    }
}