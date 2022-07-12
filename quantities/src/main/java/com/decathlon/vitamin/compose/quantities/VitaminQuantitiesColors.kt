package com.decathlon.vitamin.compose.quantities

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

class VitaminQuantitiesColors(
    val textBoxBorderColor: Color,
    val textBoxBorderFocusColor: Color,
    val textBoxBackgroundColor: Color,
    val actionBoxBorderColor: Color,
    val actionBackgroundColor: Color,
    val actionTextColor: Color
)

object VitaminQuantitiesState {
    @Composable
    fun normal(
        textBoxBorderColor: Color = VitaminTheme.colors.vtmnBorderInactive,
        textBoxBorderFocusColor: Color = VitaminTheme.colors.vtmnBorderActive,
        textBoxBackgroundColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        actionBoxBorderColor: Color = VitaminTheme.colors.vtmnBorderInactive,
        actionBackgroundColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        actionTextColor: Color = VitaminTheme.colors.vtmnContentAction
    ): VitaminQuantitiesColors = VitaminQuantitiesColors(
        textBoxBorderColor = textBoxBorderColor,
        textBoxBorderFocusColor = textBoxBorderFocusColor,
        textBoxBackgroundColor = textBoxBackgroundColor,
        actionBoxBorderColor = actionBoxBorderColor,
        actionBackgroundColor = actionBackgroundColor,
        actionTextColor = actionTextColor
    )
}