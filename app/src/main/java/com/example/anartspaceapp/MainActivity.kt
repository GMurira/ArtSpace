package com.example.anartspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.anartspaceapp.ui.theme.AnArtSpaceAPPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnArtSpaceAPPTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//GreetingText(message = getString(R.string.lets_go_murira_text), from = getString(R.string.signature_text))//pass the parameter here "On create function" to run your function
                    GreetingWordsWithImages()
                }
            }
        }
    }
}
//Remove Greeting function and build your own function
@Composable
fun GreetingWordsWithImages(modifier: Modifier = Modifier) {
    var result by remember { mutableStateOf(1) }
    val imageResource = when (result) {
        1 -> R.drawable.philipp_katzenberger_tkumczk5zni_unsplash
        2 -> R.drawable.flavien_tmhw9yuafpw_unsplash
        3 -> R.drawable._82e771ec9c066b04f35139170b4f3d3
        4 -> R.drawable.bereczki_domokos_jsczq2cpnvi_unsplash
        5 -> R.drawable.haidong_liang_1kemi3ad1gg_unsplash
        else -> R.drawable.andre_tan_ewv5c19z6_w_unsplash

    }
    //Buttons
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = painterResource(R.drawable.andre_tan_ewv5c19z6_w_unsplash),
            contentDescription = null,
            modifier = Modifier.padding(16.dp)
        )
        Row() {
            Text(
                stringResource(R.string.Some_Text)
            )//painter.toString)
        }
//Buttons Start Here
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            //Button 1 Content
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.padding(8.dp)
            ) {
                Text(stringResource(R.string.button_Previous)
            }
            Spacer(modifier = Modifier.width(16.dp))
            //Button 2 Content
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.padding(8.dp)
            ) {
                Text(stringResource(R.string.button_Next))
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AnArtSpaceAPPTheme {
       //Delete the Greeting function call and call your new function to display in the UI
        GreetingWordsWithImages()
    }
}