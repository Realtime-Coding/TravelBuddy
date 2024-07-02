package data.database


import androidx.room.TypeConverter
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import model.Category

class Converters {

    @TypeConverter
    fun fromCategory(category: Category): String {
        return Json.encodeToString(category)
    }

    @TypeConverter
    fun toCategory(category: String): Category {
        return Json.decodeFromString(category)
    }

    @TypeConverter
    fun fromImages(images: List<String>): String {
        return Json.encodeToString(images)
    }

    @TypeConverter
    fun toImages(images: String): List<String> {
        return Json.decodeFromString(images)
    }
}