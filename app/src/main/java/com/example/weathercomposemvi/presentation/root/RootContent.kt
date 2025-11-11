package com.example.weathercomposemvi.presentation.root

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.extensions.compose.jetpack.stack.Children
import com.example.weathercomposemvi.presentation.details.DetailsContent
import com.example.weathercomposemvi.presentation.favourite.FavouriteContent
import com.example.weathercomposemvi.presentation.search.SearchContent
import com.example.weathercomposemvi.presentation.ui.theme.WeatherComposeMviTheme

@Composable
fun RootContent(component: RootComponent) {
    WeatherComposeMviTheme {
        Children(
            stack = component.stack
        ) {
            when(val instance = it.instance) {
                is RootComponent.Child.Details -> {
                    DetailsContent(component = instance.component)
                }
                is RootComponent.Child.Favourite -> {
                    FavouriteContent(component = instance.component)
                }
                is RootComponent.Child.Search -> {
                    SearchContent(component = instance.component)
                }
            }
        }
    }
}