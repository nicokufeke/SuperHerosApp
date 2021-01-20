package cl.eme.pruebasuperheroes.model

import cl.eme.pruebasuperheroes.RetrofitClient
import cl.eme.pruebasuperheroes.SuperHeroApplication
import timber.log.Timber

class Repository {

    private val superHeroDao = SuperHeroApplication.superHerosDataBase!!.superHeroDao()
    val getMinSuperHerosCharacter = superHeroDao.getMinSuperHerosCharacter()

    suspend fun getSuperHeros() {
        Timber.d("getSuperHeros from API")
        val response = RetrofitClient.instance().getSuperHeros()

        when (response.isSuccessful) {
            true ->
                response.body()?.let {
                    superHeroDao.insert(it)
                }
            false -> Timber.e("${response.code()} - ${response.errorBody()}")
        }
    }
}
