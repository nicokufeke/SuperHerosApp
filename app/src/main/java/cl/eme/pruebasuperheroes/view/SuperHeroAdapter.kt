package cl.eme.pruebasuperheroes.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import cl.eme.pruebasuperheroes.SuperHero
import cl.eme.pruebasuperheroes.databinding.SuperheroListBinding
import coil.load

class SuperHeroAdapter : RecyclerView.Adapter<SuperHeroAdapter.SuperHeroVH>() {

    private var items = listOf<SuperHero>()
    private val selectedItem = MutableLiveData<SuperHero>()

    fun selectedItem(): LiveData<SuperHero> = selectedItem

    fun update(minSuperHerosCharacter: List<SuperHero>) {
        items = minSuperHerosCharacter
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroVH {
        val binding = SuperheroListBinding.inflate(LayoutInflater.from(parent.context))
        return SuperHeroVH(binding)
    }

    override fun onBindViewHolder(holder: SuperHeroVH, position: Int) {
        val item = items[position]
        holder.bind(item)
        holder.itemView.setOnClickListener {
            selectedItem.value = item
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }


    class SuperHeroVH(val binding: SuperheroListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(superHero: SuperHero) {
            binding.nameView.text = superHero.name
            //binding.imageView.load(superHero.images.md)

        }

    }

}

