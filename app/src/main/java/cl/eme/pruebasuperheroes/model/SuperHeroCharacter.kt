package cl.eme.pruebasuperheroes

import android.telephony.CellSignalStrength
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey


// POJOs
@Entity(tableName = "superheros")

data class SuperHero(
        @PrimaryKey val id: Int,
        val name: String,
        val slug: String,
        @Embedded var powerstats: PowerStats,
    /*val appearance: List<String>,
    val biography: List<String>,
    val work: List<String>,
    val connections: List<String>,
    val images: List<String>,*/
    )

data class PowerStats(val intelligence: Int, val strength: Int, val speed: Int, val durability: Int, val power: Int, val combat: Int)


data class MinSuperHerosCharacter(val id: Int, val name: String, val slug: String)











