package data.database

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import model.Category

@Entity
data class FavoriteEntity(
    @PrimaryKey
    val id: Int,
    val thumbnail: String,
    val title: String,
    val description: String,
    val rating: Float,
    val location: String,
    val price: String,
    val type: String,
    val category: String,
    val image: String
)