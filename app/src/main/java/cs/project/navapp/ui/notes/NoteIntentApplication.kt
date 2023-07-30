package cs.project.ui.note

import android.app.Application
import cs.project.navapp.ui.notes.NoteRepository

class NoteIntentApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        NoteRepository.initialize(this)
    }
}