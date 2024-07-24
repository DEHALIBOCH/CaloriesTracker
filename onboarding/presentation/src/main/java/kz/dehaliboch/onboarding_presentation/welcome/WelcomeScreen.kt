package kz.dehaliboch.onboarding_presentation.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import kz.dehaliboch.core.R
import kz.dehaliboch.core.navigation.Route
import kz.dehaliboch.core.util.UiEvent
import kz.dehaliboch.core_ui.LocalSpasing
import kz.dehaliboch.core_ui.components.ActionButton
import kz.dehaliboch.core_ui.components.DefaultContainerForPreview

@Composable
fun WelcomeScreen(
    onNavigate : (UiEvent.Navigate) -> Unit
) {
    val spacing = LocalSpasing.current
    Column(
        modifier = Modifier.fillMaxSize().padding(spacing.spaceMedium),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = stringResource(id = R.string.welcome_text),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.displayLarge
        )
        Spacer(modifier = Modifier.height(spacing.spaceMedium))
        ActionButton(
            text = stringResource(id = R.string.next),
            onClick = {
                onNavigate(UiEvent.Navigate(Route.AGE))
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}

@Preview
@Composable
private fun WelcomeScreenPreview() {
    DefaultContainerForPreview {
        WelcomeScreen {

        }
    }
}