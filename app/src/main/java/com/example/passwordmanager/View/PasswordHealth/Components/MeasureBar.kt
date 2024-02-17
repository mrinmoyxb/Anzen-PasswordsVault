package com.example.passwordmanager.View.PasswordHealth.Components

import androidx.compose.animation.Animatable
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.ContentAlpha
import androidx.wear.compose.material.MaterialTheme
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Text
import com.example.passwordmanager.ui.theme.inter

@Composable
fun ComplexityBar(
    canvasSize: Dp = 300.dp,
    indicatorValue: Float = 0.0f,
    maxIndicator: Int = 100,
    backgroundIndicatorColor: Color = Color.White,
    backgroundIndicatorStrokeWidth: Float = 100f,
    foregroundIndicatorColor: Color = Color.Blue,
    foregroundIndicatorStrokeWidth: Float = 100f
){

    var allowedIndicatorValue by remember{
        mutableStateOf(maxIndicator)
    }
    allowedIndicatorValue = if(indicatorValue <= maxIndicator){
        indicatorValue.toInt()
    }else{
        maxIndicator
    }


    var animatedIndicatorValue by remember{ mutableStateOf(0f) }
    LaunchedEffect(key1 =  allowedIndicatorValue){
        animatedIndicatorValue = allowedIndicatorValue.toFloat()
    }

    val percentage = (animatedIndicatorValue/maxIndicator)*100

    val sweepAngle by animateFloatAsState(targetValue = (2.4 * percentage).toFloat(),
        animationSpec = tween(1000), label = ""
    )



    Column(
        modifier = Modifier
            .size(canvasSize)
            .drawBehind {
                val componentSize = size / 1.25f
                backgroundIndicator(
                    componentSize = componentSize,
                    indicatorColor = backgroundIndicatorColor,
                    indicatorStrokeWidth = backgroundIndicatorStrokeWidth
                )
                foregroundIndicator(
                    sweepAngle = indicatorValue,
                    componentSize = componentSize,
                    indicatorColor = foregroundIndicatorColor,
                    indicatorStrokeWidth = foregroundIndicatorStrokeWidth
                )
            },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(150.dp))
        EmbeddedElements(
            bigText = 32,
            bigTextFontSize = 60,
            bigTextColor = Color.Black,
            bigTextSuffix = "%",
            smallText = "Complexity Score",
            smallTextColor = Color.Black,
            smallTextFontSize = 20
        )
    }
}

fun DrawScope.backgroundIndicator(
    componentSize: Size,
    indicatorColor: Color,
    indicatorStrokeWidth: Float
){
    drawArc(
        size = componentSize,
        color = indicatorColor,
        startAngle = 150f,
        sweepAngle = 240f,
        useCenter = false,
        style = Stroke(
            width = indicatorStrokeWidth,
            cap = StrokeCap.Round
        ),
        topLeft = Offset(
            x = (size.width-componentSize.width)/2f,
            y = (size.height-componentSize.width)/2f
        )
    )
}


fun DrawScope.foregroundIndicator(
    sweepAngle: Float,
    componentSize: Size,
    indicatorColor: Color,
    indicatorStrokeWidth: Float
){
    drawArc(
        size = componentSize,
        color = indicatorColor,
        startAngle = 150f,
        sweepAngle = sweepAngle,
        useCenter = false,
        style = Stroke(
            width = indicatorStrokeWidth,
            cap = StrokeCap.Round
        ),
        topLeft = Offset(
            x = (size.width-componentSize.width)/2f,
            y = (size.height-componentSize.width)/2f
        )
    )
}


@Composable
fun EmbeddedElements(
    bigText: Int,
    bigTextFontSize: Int,
    bigTextColor: Color,
    bigTextSuffix: String,
    smallText: String,
    smallTextColor: Color,
    smallTextFontSize: Int
){

    Text(text = "$bigText${bigTextSuffix.take(2)}", color = bigTextColor,
        fontFamily = inter, fontWeight = FontWeight.Bold,
        fontSize = bigTextFontSize.sp, textAlign = TextAlign.Center
        )

    Text(text = smallText, color = smallTextColor,
        fontFamily = inter, fontWeight = FontWeight.Medium,
        fontSize = smallTextFontSize.sp, textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun disp(){
    ComplexityBar( indicatorValue = 200.2f)
}