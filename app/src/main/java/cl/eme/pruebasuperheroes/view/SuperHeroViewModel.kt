package cl.eme.pruebasuperheroes.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.eme.pruebasuperheroes.MinSuperHerosCharacter
import cl.eme.pruebasuperheroes.model.Repository
import kotlinx.coroutines.launch
import timber.log.Timber

class SuperHeroViewModel: ViewModel() {

    private val repository = Repository()

    val minSuperHerosCharacter = repository.getMinSuperHerosCharacter


    init {
        Timber.d("Get SuperHeroes")
        viewModelScope.launch {
            repository.getSuperHeros()
        }
    }
    private lateinit var selectedSuperHero: MinSuperHerosCharacter

    fun selected(minSuperHerosCharacter: MinSuperHerosCharacter) {
        selectedSuperHero = minSuperHerosCharacter
    }

}