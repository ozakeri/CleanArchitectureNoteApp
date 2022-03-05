package com.example.cleanarchitecturenoteapp.feature_note.domain.usecase

import com.example.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.example.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class Getnote(private val repository: NoteRepository) {

    suspend operator fun invoke(id: Int): Note {
        return repository.getNoteById(id)
    }
}