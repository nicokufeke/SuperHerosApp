package cl.eme.pruebasuperheroes

import androidx.room.Entity
import androidx.room.PrimaryKey


// POJOs
@Entity(tableName = "superheros")

data class SuperHeros(
    @PrimaryKey val id: Int,
    val name: String,
    val slug: String,
    val powerStats: List<Int>,
    val appearance: List<String>,
    val biography: List<String>,
    val work: List<String>,
    val connections: List<String>,
    val images: List<String>,)


data class MinSuperHeroesCharacter(val id: Int, val name: String, val slug: String, val appearance: List<String>, val images: List<String>)











