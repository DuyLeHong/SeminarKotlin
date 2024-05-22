package com.duyle.seminarkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.duyle.seminarkotlin.ui.theme.SeminarKotlinTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                floatingActionButton = {
                    FloatingActionButton(onClick = { /* Handle
FAB click action here */ }) {
                        Icon(
                            Icons.Filled.Add,
                            contentDescription = "Add")
                    }
                }
            ) { innerPadding ->
                NoteApp(innerPadding)
            }
        }
    }

    @Preview
    @Composable
    fun NoteApp(paddingValues: PaddingValues? = null) {
//        val notes = listOf("Note 1", "Note 2", "Note 3", "Note 4",
//            "Note 5")

        val listSinhvien = mutableListOf<StudentModel>() // goi class java tu kotlin jetpack compose

        listSinhvien.add(StudentModel("PH11322", "Long Nguyen", 8.5f, false))
        listSinhvien.add(StudentModel("PH13542", "Tuan Le", 7.5f, false))
        listSinhvien.add(StudentModel("PH17731", "Duy Le", 8f, false))
        listSinhvien.add(StudentModel("PH11322", "Thao Tran", 9f, true))

        Column(modifier =
        Modifier
            .padding(paddingValues!!)
            .padding(8.dp)) {
            Text(text = "Quan ly Sinh vien",
                style = MaterialTheme.typography.titleLarge)
            listSinhvien.forEach { sinhvien ->
                NoteCard(sinhvien)
            }
        }
    }

    @Composable
    fun NoteCard(studentModel: StudentModel) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(
                    color = Color.LightGray, shape =
                    MaterialTheme.shapes.medium
                )
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Column (modifier = Modifier
                    .weight(1f)
                    .padding(16.dp)
                ) {
                    Text(
                        text = "${studentModel.mssv} - ${studentModel.hoten}",
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Text(
                        text = "Diem TB: ${studentModel.diemTB}",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }

                Icon(
                    imageVector = Icons.Filled.KeyboardArrowDown,
                    contentDescription = "Expand Note",
                    modifier =
                    Modifier
                        .padding(16.dp)
                        .align(Alignment.CenterVertically)
                )
            }
        }
    }
}

