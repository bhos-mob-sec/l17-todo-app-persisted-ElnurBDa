package az.edu.bhos.l14todoapp.data.dto

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todos")
data class TodoLocalDto(
    @PrimaryKey
    val id: String,
    val title: String,
    val description: String,
    val weekday: Int
)
