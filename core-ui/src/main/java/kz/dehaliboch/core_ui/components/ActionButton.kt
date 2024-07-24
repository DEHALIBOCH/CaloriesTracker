package kz.dehaliboch.core_ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kz.dehaliboch.core_ui.LocalSpasing

@Composable
fun ActionButton(
    modifier: Modifier = Modifier,
    text: String,
    isEnabled: Boolean = true,
    textStyle: TextStyle = MaterialTheme.typography.labelLarge,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = isEnabled,
        shape = RoundedCornerShape(100.dp)
    ) {
        Text(
            text = text,
            style = textStyle,
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier.padding(LocalSpasing.current.spaceSmall)
        )
    }
}


@Preview
@Composable
private fun ActionButtonPreview() {
    DefaultContainerForPreview {
        ActionButton(text = "Action button") {

        }
    }
}