package com.tugas.questbasiccomposable_043

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tugas.questbasiccomposable_043.ui.theme.QuestBasicComposable_043Theme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_043Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        modifier = Modifier,
                    )

                }
            }
        }
    }
}
@preview(showBackground = true)
@Composable
fun BasicCompose(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Indonesia",
            modifier = modifier.padding(bottom = 8.dp),
            fontSize = 70.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "The Great Country",
            modifier = modifier,
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        Image(painter = painterResource(id = R.drawable.indo),
            contentDescription = null,
            modifier = Modifier.size(170.dp),
        )
        Text(
            text = "Nama",
            modifier = modifier,
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = "Muhammad Fauzan",
            modifier = modifier.padding(bottom = 4.dp),
            fontSize = 19.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = "202201400043",
            modifier = modifier,
            fontSize = 17.sp,
            color = Color.Cyan,
            fontWeight = FontWeight.Bold,
        )
        Image(
            painter = painterResource(id = R.drawable.ojan),
            contentDescription = null,
            modifier = Modifier
                .size(400.dp)
                .clip(CircleShape),
        )
    }
}



annotation class preview(val showBackground: Boolean)

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
    QuestBasicComposable_043Theme {
        Greeting("Android")
    }
}