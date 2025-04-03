package org.wakilytech.ride_go

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

fun Modifier.applyRadius(value: Float = 0f): Modifier {
        return this.clip(
            RoundedCornerShape(if (value > 0) value.dp else 5.dp)
        )
}