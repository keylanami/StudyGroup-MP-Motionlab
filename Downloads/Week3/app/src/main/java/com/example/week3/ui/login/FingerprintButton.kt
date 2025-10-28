package com.example.week3.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.week3.ui.theme.ColorButtonRegister
import com.example.week3.R

@Composable
fun FingerPrintButton(
    onClick: () -> Unit
){
    Box(
        modifier = Modifier.size(50.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(ColorButtonRegister),
        contentAlignment = Alignment.Center

    ) {
        Icon(
            painter = painterResource(R.drawable.fingerprint_24dp_e8eaed_fill0_wght400_grad0_opsz24),
            contentDescription = "Icon Fingerprint",
            tint = Color.White,
            modifier = Modifier.size(48.dp)
        )

        Box(
            modifier = Modifier.size(20.dp)
                .clip(CircleShape)
                .background(ColorButtonRegister)
                .align(Alignment.TopEnd)
                .offset(x = (-6).dp, y = 6.dp)
        )
    }
}

@Composable
@Preview
private fun FingerPrintPreview(){
    FingerPrintButton(
        onClick = {}
    )
}