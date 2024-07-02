package data.database

import model.Category
import model.Destination
import kotlin.random.Random

object RoomMapper {

    fun toFavoriteEntity(destination: Destination): FavoriteEntity {
        return FavoriteEntity(
            id = destination.id,
            thumbnail = destination.thumbnail,
            title = destination.title,
            description = destination.description,
            rating = destination.rating,
            location = destination.location,
            price = destination.price,
            type = destination.type,
            category = destination.category.title,
            image = destination.image.joinToString("|")
        )
    }

    fun fromFavoriteEntity(favoriteEntity: FavoriteEntity): Destination {
        return Destination(
            id = favoriteEntity.id,
            thumbnail = favoriteEntity.thumbnail,
            title = favoriteEntity.title,
            description = favoriteEntity.description,
            rating = favoriteEntity.rating,
            location = favoriteEntity.location,
            price = favoriteEntity.price,
            type = favoriteEntity.type,
            category = Category(id = Random.nextInt(),favoriteEntity.category,null),
            image = favoriteEntity.image.split("|")
        )
    }

}