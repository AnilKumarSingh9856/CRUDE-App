package com.example.myapplication.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BookEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String
)
