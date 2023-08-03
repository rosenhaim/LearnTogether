package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LearnTogetherImage("Android")
                }
            }
        }
    }
}

@Composable
fun LearnTogetherImage(name: String, modifier: Modifier = Modifier) {
    val image  = painterResource(R.drawable.bg_compose_background)
    Column(modifier = Modifier) {
        Image(
            painter = image,
            contentDescription = null
        )
        LearnTogetherText(
            name
        )
    }

}


@Composable
fun LearnTogetherText(name : String){
    Text (
        text = stringResource(R.string.title_text),
        modifier = Modifier.padding(16.dp),
        fontSize = 24.sp
    )
    Text(
        text = stringResource(R.string.short_description),
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify

    )
    Text(
        text = stringResource(R.string.large_description),
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        textAlign = TextAlign.Justify

    )
}

@Preview(showBackground = true)
@Composable
fun LearnTogetherPreview() {
    LearnTogetherTheme {
        LearnTogetherImage("Android")
    }
}