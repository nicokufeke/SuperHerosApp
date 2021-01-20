package cl.eme.pruebasuperheroes

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface SuperHeroesAPI {
    @GET("all.json")
    suspend fun getSuperHeros(): Response<List<SuperHero>>
}

// Cliente Retrofit
const val BASE_URL = "https://akabab.github.io/superhero-api/api/"
class RetrofitClient {
    companion object {

        fun instance(): SuperHeroesAPI{
            val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(
                GsonConverterFactory.create()).build()

            return retrofit.create(SuperHeroesAPI::class.java)


        }
    }
}




