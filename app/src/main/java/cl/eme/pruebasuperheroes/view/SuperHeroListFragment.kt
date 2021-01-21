package cl.eme.pruebasuperheroes.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import cl.eme.pruebasuperheroes.R
import cl.eme.pruebasuperheroes.databinding.FragmentListSuperheroBinding

class SuperHeroListFragment : Fragment() {
    private val viewModel: SuperHeroViewModel by activityViewModels()

    private lateinit var binding: FragmentListSuperheroBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentListSuperheroBinding.inflate(layoutInflater)

        val adapter = SuperHeroAdapter()

        binding.rvSuperHeros.layoutManager = LinearLayoutManager(context)
        binding.rvSuperHeros.adapter = adapter

        viewModel.minSuperHerosCharacter.observe(viewLifecycleOwner, {
            it?.let {
                adapter.update(it)
            }
        })

        adapter.selectedItem().observe(viewLifecycleOwner, {
            viewModel.selected(it)
            activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.main_container, SuperHeroDetailFragment())?.addToBackStack("Detail")?.commit()
        })

       return binding.root
    }

}


