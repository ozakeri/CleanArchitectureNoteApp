package com.example.cleanarchitecturenoteapp.feature_note.domain.usecase

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: Getnote
)
