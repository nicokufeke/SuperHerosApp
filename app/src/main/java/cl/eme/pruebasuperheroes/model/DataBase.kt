package cl.eme.pruebasuperheroes

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.room.*
import cl.eme.pruebasuperheroes.model.Converters
import timber.log.Timber


@Dao
interface SuperHeroDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(superheros: List<SuperHero>)

    @Query("SELECT id, name, slug FROM superheros")
    fun getMinSuperHerosCharacter(): LiveData<List<MinSuperHerosCharacter>>
}

@Database(entities = [SuperHero::class], version = 1)
@TypeConverters(Converters::class)
abstract class SuperHerosDataBase : RoomDatabase() {
    abstract fun superHeroDao(): SuperHeroDao
}
    class SuperHeroApplication : Application() {
        companion object {
            var superHerosDataBase: SuperHerosDataBase? = null
        }
        override fun onCreate() {
            super.onCreate()
            Timber.d("onCreate de SuperHerosApplication")
            superHerosDataBase =
                Room.databaseBuilder(this, SuperHerosDataBase::class.java, "db_superheroes").build()
        }
    }














