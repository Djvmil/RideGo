package org.wakilytech.ride_go

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.wakilytech.ride_go.home.DashboardScreen
import org.wakilytech.core.designsystem.extension.applyRadius

@Composable
fun App() {
    MaterialTheme {

        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Ride Go", color = MaterialTheme.colors.onPrimary) },
                    backgroundColor = MaterialTheme.colors.primary,
                    contentColor = MaterialTheme.colors.onPrimary,
                    elevation = 4.dp,
                    modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally)
                        .padding(3.dp)
                        .height(56.dp)
                        .applyRadius()
                )
            },
            bottomBar = {
                BottomAppBar(
                    backgroundColor = MaterialTheme.colors.primary,
                    contentColor = MaterialTheme.colors.onPrimary,
                    elevation = 4.dp,
                    modifier = Modifier.wrapContentWidth(Alignment.CenterHorizontally)
                        .padding(3.dp)
                        .height(56.dp)
                        .applyRadius()
                ) {
                    Text("Bottom App Bar")
                }
            }
        ) {
            var showContent by remember { mutableStateOf(false) }
            Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Button(onClick = { showContent = !showContent }) {
                    Text("Click me!")
                }
                AnimatedVisibility(showContent) {
                    DashboardScreen(onRequestRide = {})
                }
            }
        }
    }
}