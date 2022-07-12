package com.decathlon.vitamin.compose.quantities

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.textinputs.VitaminTextInputs

object VitaminQuantities {

    /**
     * Primary
     *
     * @param value
     * @param modifier
     * @param addEnabled
     * @param subtractEnabled
     * @param colors
     * @param onAddClicked
     * @param onSubtractClicked
     * @param onValueChange
     * @receiver
     * @receiver
     * @receiver
     */
    @Composable
    fun Primary(
        value: String,
        modifier: Modifier = Modifier,
        addEnabled: Boolean = true,
        subtractEnabled: Boolean = true,
        colors: VitaminQuantitiesColors = VitaminQuantitiesState.normal(),
        onAddClicked: () -> Unit,
        onSubtractClicked: () -> Unit,
        onValueChange: (String) -> Unit
    ) {
        LazyRow(modifier = modifier
            .height(48.dp)
            .width(154.dp)) {
            item {
                Button(
                    onClick = onSubtractClicked,
                    modifier = Modifier
                        .height(48.dp)
                        .width(48.dp),
                    enabled = subtractEnabled,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colors.actionBackgroundColor,
                        contentColor = colors.actionTextColor,
                        disabledBackgroundColor = colors.actionBackgroundColor.copy(alpha = 0.38f),
                        disabledContentColor = colors.actionTextColor.copy(alpha = 0.38f)
                    )
                    ) {
                    Text(text = "-")
                }
            }
            item {
                TextField(
                    value = value,
                    onValueChange = onValueChange,
                    enabled = addEnabled || subtractEnabled
                )
            }
            item {
                Button(
                    onClick = onAddClicked,
                    modifier = Modifier
                        .height(48.dp)
                        .width(48.dp),
                    enabled = addEnabled
                ) {
                    Text(text = "+")
                }
            }
        }
    }

}

@Preview(showBackground = true,
backgroundColor = 0xffffffff)
@Composable
fun PreviewQuantities() {
    VitaminTheme {
        LazyColumn() {
            item {
                VitaminQuantities.Primary(
                    value = "0",
                    subtractEnabled = true,
                    onAddClicked = {

                    },
                    onSubtractClicked = {

                    },
                    onValueChange = {

                    }
                )
            }
            item {
                VitaminQuantities.Primary(
                    value = "0",
                    subtractEnabled = false,
                    onAddClicked = {

                    },
                    onSubtractClicked = {

                    },
                    onValueChange = {

                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDarkQuantities() {
    VitaminTheme(darkTheme = true) {
        LazyColumn() {
            item {
                VitaminQuantities.Primary(
                    value = "0",
                    subtractEnabled = true,
                    onAddClicked = {

                    },
                    onSubtractClicked = {

                    },
                    onValueChange = {

                    }
                )
            }
            item {
                VitaminQuantities.Primary(
                    value = "0",
                    subtractEnabled = false,
                    onAddClicked = {

                    },
                    onSubtractClicked = {

                    },
                    onValueChange = {

                    }
                )
            }
        }

    }
}