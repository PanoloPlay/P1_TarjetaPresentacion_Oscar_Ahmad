package com.example.p1_tarjetapresentacion_oscar_ahmad

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p1_tarjetapresentacion_oscar_ahmad.ui.theme.P1_TarjetaPresentacion_Oscar_AhmadTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P1_TarjetaPresentacion_Oscar_AhmadTheme {
                proyecto()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    P1_TarjetaPresentacion_Oscar_AhmadTheme {
        proyecto()
    }
}

@Composable
fun proyecto() {
    Column (
        modifier = Modifier.fillMaxHeight(1f)
            .fillMaxWidth(1f)
            .background(Color.Blue)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(3f)
                .fillMaxWidth(1f)
        ) {
            Column(
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.spr_b2w2_iris),
                        contentDescription = null,
                        modifier = Modifier.size(200.dp)
                    )
                }
            }
            Column(

            ) {
                Text(
                    text = stringResource(R.string.presentation_names),
                    fontSize = 25.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.Green
                )
            }
            Column(

            ) {
                Text(
                    text = stringResource(R.string.presentation_title),
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Cursive,
                    color = Color.White
                )
            }

            Column(

            ) {
                Text(
                    text = stringResource(R.string.presentation_creditos),
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.White
                )
            }
        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f)
                .fillMaxWidth(1f)
                .padding(0.dp, 15.dp)
        ) {
            Column(
            ) {
                Row(

                ) {
                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.weight(1f)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.hydreigon),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )
                    }

                    Row(
                        modifier = Modifier.weight(2f)
                    ) {
                        Text(
                            text = stringResource(R.string.presentation_hydreigon),
                            fontFamily = FontFamily.Cursive,
                            color = Color.White,
                            modifier = Modifier.padding(7.dp,0.dp)
                        )
                    }

                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.weight(1f)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.druddigon),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )
                    }

                    Row(
                        modifier = Modifier.weight(2f)
                    ) {
                        Text(
                            text = stringResource(R.string.presentation_druddigon),
                            fontFamily = FontFamily.Cursive,
                            color = Color.White,
                            modifier = Modifier.padding(7.dp,0.dp)
                        )
                    }
                }

            }
            Column(

            ) {
                Row(

                ) {
                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.weight(1f)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.aggron),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )
                    }

                    Row(
                        modifier = Modifier.weight(2f)
                    ) {
                        Text(
                            text = stringResource(R.string.presentation_aggron),
                            fontFamily = FontFamily.Cursive,
                            color = Color.White,
                            modifier = Modifier.padding(7.dp,0.dp)
                        )
                    }

                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.weight(1f)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.archeops),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )
                    }

                    Row(
                        modifier = Modifier.weight(2f)
                    ) {
                        Text(
                            text = stringResource(R.string.presentation_archeops),
                            fontFamily = FontFamily.Cursive,
                            color = Color.White,
                            modifier = Modifier.padding(7.dp,0.dp)
                        )
                    }
                }
            }
            Column(

            ) {
                Row(

                ) {
                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.weight(1f)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.lapras),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )
                    }

                    Row(
                        modifier = Modifier.weight(2f)
                    ) {
                        Text(
                            text = stringResource(R.string.presentation_lapras),
                            fontFamily = FontFamily.Cursive,
                            color = Color.White,
                            modifier = Modifier.padding(7.dp,0.dp)
                        )
                    }

                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.weight(1f)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.haxorus),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )
                    }

                    Row(
                        modifier = Modifier.weight(2f)
                    ) {
                        Text(
                            text = stringResource(R.string.presentation_haxorus),
                            fontFamily = FontFamily.Cursive,
                            color = Color.White,
                            modifier = Modifier.padding(7.dp,0.dp)
                        )
                    }
                }
            }
        }
    }
}