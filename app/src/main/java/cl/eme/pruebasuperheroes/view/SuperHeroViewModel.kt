package cl.eme.pruebasuperheroes.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.eme.pruebasuperheroes.SuperHero
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
    private val selected = MutableLiveData<SuperHero>()
    fun selected(): LiveData<SuperHero> = selected
    fun selected(superHeros: SuperHero){
        selected.value = superHeros
        }
    }



