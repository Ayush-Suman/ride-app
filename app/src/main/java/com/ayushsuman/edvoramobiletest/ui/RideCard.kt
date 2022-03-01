package com.ayushsuman.edvoramobiletest.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ayushsuman.edvoramobiletest.R
import com.ayushsuman.edvoramobiletest.ui.theme.CardBlack
import com.ayushsuman.edvoramobiletest.ui.theme.Shapes
import com.ayushsuman.edvoramobiletest.ui.theme.Transparent
import com.ayushsuman.edvoramobiletest.ui.theme.Typography


@Preview(showBackground = true)
@Composable
fun RideCard() {
    Card(
        shape = Shapes.large,
        backgroundColor = CardBlack,
        elevation = 0.dp
    ){
        Column(modifier = Modifier.padding(all = 30.dp), horizontalAlignment = Alignment.Start) {
            Image(painter = painterResource(id = R.drawable.map), contentDescription = "Map")
            Row(modifier = Modifier.padding(top = 16.dp, bottom = 16.dp).fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Name("City")
                Name("State")
            }
        }
    }
}

@Composable
fun Name(text:String){
    Card(
        elevation = 0.dp,
        backgroundColor = Transparent,
        shape = Shapes.medium,
        modifier = Modifier.height(30.dp)) {
        Text(modifier = Modifier.padding(horizontal = 10.dp), text = text, style = Typography.body1, textAlign = TextAlign.Center)
    }
}