package eu.tutorials.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import eu.tutorials.calculator.ui.theme.CalculatorTheme
import eu.tutorials.calculator.ui.theme.Orange

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme{

                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val buttonSpacing = 8.dp
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black,

                ){
                    Calculator(
                        /*modifier = Modifier
                            .fillMaxSize()
                            .background(Orange)
                            .padding(16.dp),*/
                        state = state,
                        onAction = viewModel::onAction,
                        buttonSpacing = buttonSpacing
                    )
                }

            }
        }
    }
}

