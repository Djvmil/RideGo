package org.wakilytech.ride_go.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import ridego.composeapp.generated.resources.Res
import ridego.composeapp.generated.resources.compose_multiplatform

@Composable
fun DashboardScreen(onRequestRide: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(Res.drawable.compose_multiplatform),
            contentDescription = null,
            modifier = Modifier.size(128.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text("Bienvenue sur Ride Go", style = MaterialTheme.typography.h4)
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = onRequestRide,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Demander une course")
        }
    }
}

@Preview
@Composable
fun homeScreenPreview() {
    MaterialTheme {
        DashboardScreen(onRequestRide = {})
    }
}