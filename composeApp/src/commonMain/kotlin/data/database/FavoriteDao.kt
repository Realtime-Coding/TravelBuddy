package data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface FavoriteDao {

    @Query("SELECT * FROM favoriteentity")
    fun getAll(): Flow<List<FavoriteEntity>>

    @Insert
    suspend fun upsert(photo: FavoriteEntity)

    @Delete
    suspend fun delete(photo: FavoriteEntity)

}