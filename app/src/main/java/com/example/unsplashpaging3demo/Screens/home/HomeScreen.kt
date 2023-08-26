package com.example.unsplashpaging3demo.Screens.home

import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.LayoutDirection
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.paging.compose.collectAsLazyPagingItems
import coil.annotation.ExperimentalCoilApi
import com.example.unsplashpaging3demo.Screens.common.ListContent
import com.example.unsplashpaging3demo.navigation.Screen
import dagger.hilt.android.lifecycle.HiltViewModel

@OptIn(ExperimentalMaterial3Api::class, ExperimentalCoilApi::class)
@Composable
fun HomeScreen(
    navHostController: NavHostController
) {
    val homeViewModel: HomeViewModel = hiltViewModel()

    val getAllImages = homeViewModel.getAllImages.collectAsLazyPagingItems()

    Scaffold(topBar = {
        HomeTopBar {
            navHostController.navigate(Screen.Search.route)
        }
    },
        content = {
            it.calculateStartPadding(layoutDirection = LayoutDirection.Ltr)
            it.calculateEndPadding(layoutDirection = LayoutDirection.Ltr)
            it.calculateTopPadding()
            it.calculateBottomPadding()
            ListContent(items = getAllImages)
        }

    )

}