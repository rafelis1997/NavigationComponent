package com.rafelis1997.navigationcomponent.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.rafelis1997.navigationcomponent.R
import com.rafelis1997.navigationcomponent.model.PersonModel
import com.rafelis1997.navigationcomponent.databinding.FragmentPersonalDataBinding
import com.rafelis1997.navigationcomponent.extensions.text

class PersonalDataFragment: Fragment() {
    private var _binding: FragmentPersonalDataBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPersonalDataBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNext.setOnClickListener {
            val model = PersonModel(
                name = binding.tilName.text,
                age = binding.tilAge.text.toInt(),
            )
            val directions = PersonalDataFragmentDirections.goToAddressFragment(model)
            findNavController().navigate(directions)

        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}