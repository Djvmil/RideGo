package org.wakilytech.core.designsystem.component

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "small font",
    group = "font scales",
    fontScale = 0.5f
)
@Preview(
    name = "large font",
    group = "font scales",
    fontScale = 1.5f
)
annotation class FontScalePreviews

@Preview(
    name = "English",
    group = "locale",
    locale = "en"
)
@FontScalePreviews
annotation class CombinedPreviews

//Sample
@CombinedPreviews
@Composable
fun HelloWorldPreview2() {
    MaterialTheme { Surface { Text("sampleText") } }
}