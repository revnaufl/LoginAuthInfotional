package com.example.loginauth.onBoarding.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginauth.login.LoginViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PreviousNextButton(
    pagerState: PagerState) {
    val scope = rememberCoroutineScope()
    if (pagerState.currentPage == 0) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom,
        ) {

            TextButton(onClick = {
                scope.launch {
                    pagerState.animateScrollToPage(pagerState.currentPage + 2)
                }
            }
            ) {
                Text(text = "Lewati",
                    fontSize = 18.sp,
                    color = Color(0xFF00548D))
            }
            Button(onClick = {
                scope.launch {
                    pagerState.animateScrollToPage(pagerState.currentPage + 1)
                }
            },
                colors = ButtonDefaults.run { buttonColors(Color(0xFF00548D)) }
            ) {
                Text(text = "Lanjut")
            }
        }
    }else if (pagerState.currentPage == 1){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Bottom,
        ) {

            Button(onClick = {
                scope.launch {
                    pagerState.animateScrollToPage(pagerState.currentPage + 1)
                }
            },
                colors = ButtonDefaults.run { buttonColors(Color(0xFF00548D)) }
            ) {
                Text(text = "Lanjut")
            }
        }
    }else if (pagerState.currentPage == 2){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Bottom,
        ) {

            Button(onClick = {
                scope.launch {// TODO:
                }
            },
                colors = ButtonDefaults.run { buttonColors(Color(0xFF00548D)) }
            ) {
                Text(text = "Mulai")
            }
        }
    }
    
}