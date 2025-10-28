package com.example.week3.ui.login

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week3.R
import com.example.week3.ui.theme.ColorButtonRegister

@Composable
@Preview
fun LoginScreen() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf(" ") }
    val context = LocalContext.current

    val users = mapOf(
        "admin" to "admin",
        "member" to "member"
    )

    var isEmpty by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
            .systemBarsPadding()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Motion Laboratory",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(Modifier.height(64.dp))

        Image(
            painter = painterResource(R.drawable.logo_motion),
            contentDescription = "Logo Motion",
            modifier = Modifier.size(256.dp)
        )

        Spacer(Modifier.height(64.dp))

        TextField(
            value = username,
            onValueChange = { value ->
                isEmpty = username.isEmpty()
                username = value
            },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "masukkan username") },
            isError = isEmpty,
            supportingText = if (isEmpty) {
                {
                    Text("Username kosong")
                }
            } else {
                null
            }
        )

        Spacer(Modifier.height(24.dp))

        TextField(
            value = password,
            onValueChange = { value -> password = value },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("masukkan password") }
        )

        Spacer(Modifier.height(64.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    if (username in users && password == users[username]) {
                        Toast.makeText(
                            context,
                            "Welcome $username to MotionLab",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        Toast.makeText(context, "Failed to Login", Toast.LENGTH_SHORT).show()
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = ColorButtonRegister,
                    contentColor = Color.White
                ),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 6.dp),
                modifier = Modifier
                    .weight(1f)
                    .height(50.dp)
            ) {
                Text(
                    text = "Login",
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
                )
            }


            Spacer(modifier = Modifier.height(16.dp))

            FingerPrintButton(
                onClick = {
                    Toast.makeText(context, "Ini finger print", Toast.LENGTH_SHORT).show()
                }
            )

        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Apakah kamu sudah punya akun? Daftar",
            color = Color(0xFF007BFFF),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.clickable {
                Toast.makeText(context, "ini Daftar", Toast.LENGTH_SHORT).show()
            }
        )
    }

}

