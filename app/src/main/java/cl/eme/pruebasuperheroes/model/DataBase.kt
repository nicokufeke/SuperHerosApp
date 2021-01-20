package cl.eme.pruebasuperheroes

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface SuperHeroDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(superheros: List<SuperHeros>)

    @Query("SELECT id, name, slug, appearance, images FROM superheros")
    fun getMinSuperHeroCharacter(): LiveData<List<MinSuperHeroesCharacter>>

}







