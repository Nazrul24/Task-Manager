package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskCompletion(
                        title = stringResource(id = R.string.title),
                        description = stringResource(id = R.string.description),
                        painter = painterResource(id = R.drawable.ic_task_completed)
                        )
                }
            }
        }
    }
}

@Composable
fun TaskCompletion(
    title: String,
    description: String,
    modifier: Modifier = Modifier,
    painter: Painter
) {

    Column {
        Image(
            painter = painter,
            contentDescription = null
        )
        Text(text = title)
        Text(text = description)
    };


}

@Preview(showBackground = true)
@Composable
fun TaskCompletionPreview() {
    TaskManagerTheme {
        TaskCompletion(
            title = stringResource(id = R.string.title),
            description = stringResource(id = R.string.description),
            painter = painterResource(id = R.drawable.ic_task_completed)
            )
    }
}