package cs.project.navapp.ui.notes

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID
import java.util.Date
@Entity
data class Note (
    @PrimaryKey val id:UUID,
    val title: String,
    val content: String,
    val date: Date

)