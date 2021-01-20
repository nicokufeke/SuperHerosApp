package cl.eme.pruebasuperheroes.view

import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class SuperheroAdapter : RecyclerView.Adapter<SuperheroAdapter.SuperheroVH>() {

    class SuperheroVH (itemView: ActionMenuItemView) : RecyclerView.ViewHolder (itemView.rootView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroVH {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: SuperheroVH, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}