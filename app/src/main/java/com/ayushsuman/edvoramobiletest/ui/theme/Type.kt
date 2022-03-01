package com.ayushsuman.edvoramobiletest.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ayushsuman.edvoramobiletest.R
import java.util.concurrent.ForkJoinTask

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = FontFamily(Font(R.font.sfprodisplaybold)),
        fontSize = 32.sp
    ),
    h2 = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter)),
        fontWeight = FontWeight.W700,
        fontSize = 16.sp
    ),
    body1 = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter)),
        fontWeight = FontWeight.W500,
        fontSize = 12.sp
    ),
    body2 =  TextStyle(
        fontFamily = FontFamily(Font(R.font.inter)),
        fontWeight = FontWeight.W500,
        fontSize = 18.sp
    ),
    h3 = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter)),
        fontWeight = FontWeight.W400,
        fontSize = 12.sp
    ),
    h4 = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter)),
        fontWeight = FontWeight.W700,
        fontSize = 12.sp
    )
)