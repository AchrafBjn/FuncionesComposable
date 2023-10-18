package com.example.funcionescomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.funcionescomposable.ui.theme.FuncionesComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FuncionesComposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FuncionesComposable()
                }
            }
        }
    }
}

@Composable
fun FuncionesComposable() {
    Column(
        Modifier.fillMaxWidth()
    ) {
        Row(
            Modifier.weight(1f)
        ) {
            EscribirTextos(
                titulo = stringResource(R.string.textComposableTitle),
                definicion = stringResource(R.string.textComposableDefinition),
                modifier = Modifier.weight(1f),
                backgroundColor = Color(0xFFEADDFF)
            )
            EscribirTextos(
                titulo = stringResource(R.string.imageComposableTitle),
                definicion = stringResource(R.string.imageComposableDefinition),
                modifier = Modifier.weight(1f),
                backgroundColor = Color(0xFFD0BCFF)
            )

        }
        Row(
            Modifier.weight(1f)
        ) {
            EscribirTextos(
                titulo = stringResource(R.string.rowComposableTitle),
                definicion = stringResource(R.string.rowComposableDefinition),
                modifier  = Modifier.weight(1f),
                backgroundColor = Color(0xFFB69DF8)
            )
            EscribirTextos(
                titulo = stringResource(R.string.columnComposableTitle),
                definicion = stringResource(R.string.columnComposableDefinition),
                modifier  = Modifier.weight(1f),
                backgroundColor = Color(0xFFF6EDFF)
            )
        }
    }
}

@Composable
fun EscribirTextos(
    titulo: String,
    definicion: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = definicion,
            textAlign = TextAlign.Justify,
        )
    }
}


@Preview(showBackground = true)
@Composable
fun FuncionesComposablePreview() {
    FuncionesComposableTheme {
        FuncionesComposable()
    }
}