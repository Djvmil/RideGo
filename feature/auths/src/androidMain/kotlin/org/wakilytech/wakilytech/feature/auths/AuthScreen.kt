package org.wakilytech.wakilytech.feature.auths

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import org.wakilytech.core.designsystem.extension.applyRadius

@Composable
fun AuthScreen(onLogin: (String, String) -> Unit, onRegister: () -> Unit) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(3.dp)
                .applyRadius(2f)
                .background(MaterialTheme.colorScheme.background),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                "RideGo",
                modifier = Modifier
                    .align(Alignment.CenterVertically),
                fontSize = 20.sp,
                fontWeight = MaterialTheme.typography.headlineLarge.fontWeight,
                maxLines = 1,
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.headlineLarge
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(color = MaterialTheme.colorScheme.background)
                .applyRadius(),
            verticalArrangement = Arrangement.Center
        ) {
            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Enter your email") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Enter your password") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { onLogin(email, password) },
                modifier = Modifier
                    .fillMaxWidth()
                    .applyRadius()
            ) {
                Text("Login")
            }
            Spacer(modifier = Modifier.height(8.dp))
            TextButton(
                onClick = onRegister,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Register")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Don't have an account? ", color = MaterialTheme.colorScheme.onSecondary)
            Text("Sign Up", color = MaterialTheme.colorScheme.onSecondary)
        }
    }
}

@Composable
@Preview(showBackground = false, uiMode = Configuration.UI_MODE_NIGHT_YES)
fun AuthScreenPreview() {
    MaterialTheme {
        AuthScreen(
            onLogin = { _, _ -> },
            onRegister = {}
        )
    }
}