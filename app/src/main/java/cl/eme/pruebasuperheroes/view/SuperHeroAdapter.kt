package cl.eme.pruebasuperheroes.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import cl.eme.pruebasuperheroes.MinSuperHerosCharacter
import cl.eme.pruebasuperheroes.databinding.SuperheroListBinding

class SuperHeroAdapter : RecyclerView.Adapter<SuperHeroVH>() {

    private var items = listOf<MinSuperHerosCharacter>()
    private val selectedItem = MutableLiveData<MinSuperHerosCharacter>()

    fun selectedItem(): LiveData<MinSuperHerosCharacter> = selectedItem

    fun update(minSuperHerosCharacter: List<MinSuperHerosCharacter>) {
        items = minSuperHerosCharacter
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroVH {
    return SuperHeroVH(SuperheroListBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: SuperHeroVH, position: Int) {
    val item = items[position]
    holder.bind(item)

    }

    override fun getItemCount()= items.size
    }


class SuperHeroVH(val binding: SuperheroListBinding) : RecyclerView.ViewHolder(binding.root){
    fun bind(superHero: MinSuperHerosCharacter) {

    }

}


