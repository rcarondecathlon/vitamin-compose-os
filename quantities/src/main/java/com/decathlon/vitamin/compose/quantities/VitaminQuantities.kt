package com.decathlon.vitamin.compose.quantities

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

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
        LazyRow(
            modifier = modifier
                .height(48.dp)
                .width(156.dp)
        ) {
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
                    ),
                    shape = RoundedCornerShape(
                        topStart = 4.dp,
                        topEnd = 0.dp,
                        bottomEnd = 0.dp,
                        bottomStart = 4.dp
                    ),
                    border = BorderStroke(
                        width = 1.dp,
                        color = colors.textBoxBorderColor
                    )
                ) {
                    Text(text = "-")
                }
            }
            item {
                Box(
                    modifier = Modifier
                        .width(60.dp)
                        .height(48.dp)
                        .background(
                            color = if (!addEnabled && !subtractEnabled) colors.textBoxBackgroundColor.copy(
                                alpha = 0.38f
                            ) else colors.textBoxBackgroundColor
                        )
                ) {
                    TextField(
                        value = value,
                        modifier = Modifier
                            .align(Alignment.Center)
                            .matchParentSize(),
                        onValueChange = onValueChange,
                        enabled = addEnabled || subtractEnabled,
                        textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Center),
                        colors = TextFieldDefaults.textFieldColors(
                            backgroundColor = if (!addEnabled && !subtractEnabled) colors.textBoxBackgroundColor.copy(
                                alpha = 0.38f
                            ) else colors.textBoxBackgroundColor,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent,
                            errorIndicatorColor = Color.Transparent
                        )
                    )
                }
            }
            item {
                Button(
                    onClick = onAddClicked,
                    modifier = Modifier
                        .height(48.dp)
                        .width(48.dp),
                    enabled = subtractEnabled,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colors.actionBackgroundColor,
                        contentColor = colors.actionTextColor,
                        disabledBackgroundColor = colors.actionBackgroundColor.copy(alpha = 0.38f),
                        disabledContentColor = colors.actionTextColor.copy(alpha = 0.38f)
                    ),
                    shape = RoundedCornerShape(
                        topStart = 0.dp,
                        topEnd = 4.dp,
                        bottomEnd = 4.dp,
                        bottomStart = 0.dp
                    ),
                    border = BorderStroke(
                        width = 1.dp,
                        color = colors.textBoxBorderColor
                    )
                ) {
                    Text(text = "+")
                }
            }
        }
    }

}

@Preview(
    showBackground = true,
    backgroundColor = 0xffffff00
)
@Composable
fun PreviewQuantities() {
    VitaminTheme {
        LazyColumn(
            contentPadding = PaddingValues(5.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
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