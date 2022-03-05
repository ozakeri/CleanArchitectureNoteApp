package com.example.cleanarchitecturenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.cleanarchitecturenoteapp.ui.theme.*

@Entity
data class Note(
     val title: String,
     val content: String,
     val timeStamp: Long,
     val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val notColor = listOf(DarkGray, LightBlue, LightGreen, BabyBlue, RedOrange, RedPink, Violet)
    }
}

class InvalidNoteException(message: String): Exception(message)