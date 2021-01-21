package cl.eme.pruebasuperheroes.model

import androidx.room.TypeConverter

class Converters {
    @TypeConverter
    fun list2string(list: List<String>): String {
        return list.joinToString()
    }
    @TypeConverter
    fun string2list(string: String): List<String> {
        val mutableList = mutableListOf<String>()
        string.split(",").forEach{
            mutableList.add(it.trim())}
        return mutableList
    }




}
