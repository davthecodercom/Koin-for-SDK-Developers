package com.davthecoder.koininasdk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.davthecoder.demosdk.DataConsumer
import com.davthecoder.demosdk.di.DemoSdkApplication
import com.davthecoder.koininasdk.ui.theme.KoinInASDKTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        DemoSdkApplication.init(applicationContext)
        super.onCreate(savedInstanceState)
        setContent {
            KoinInASDKTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting(DataConsumer)
                }
            }
        }
    }

    // close Koin
//    override fun onResume() {
//        super.onResume()
//        DemoSdkApplication.init(applicationContext)
//    }

    // close Koin
//    override fun onPause() {
//        super.onPause()
//        DemoSdkApplication.close()
//    }

}

@Composable
fun Greeting(dataConsumer: DataConsumer) {
    Text(text = dataConsumer.greetingsFormatter.sayHiWithName())
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KoinInASDKTheme {
        Greeting(DataConsumer)
    }
}