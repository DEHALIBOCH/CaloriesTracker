package kz.dehaliboch.caloriestracker.navigation

import androidx.navigation.NavController
import kz.dehaliboch.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}