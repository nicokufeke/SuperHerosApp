package cl.eme.pruebasuperheroes.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import cl.eme.pruebasuperheroes.databinding.FragmentDetailSuperheroBinding
import coil.load

class SuperHeroDetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailSuperheroBinding

    private val viewModel: SuperHeroViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

    binding = FragmentDetailSuperheroBinding.inflate(layoutInflater)
    viewModel.selected().observe(viewLifecycleOwner, {
        binding.tvName.text = it.name
        binding.textView.text = it.slug
        binding.textView2.text = it.biography.firstAppearance
        binding.ivSuperHeros.load(it.images.md)

    } )



        return binding.root
    }

}