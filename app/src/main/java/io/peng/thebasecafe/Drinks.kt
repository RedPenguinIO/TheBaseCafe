package io.peng.thebasecafe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import io.peng.thebasecafe.databinding.FragmentDrinksBinding
import io.peng.thebasecafe.databinding.FragmentMainBinding


class Drinks : Fragment() {   private var navController: NavController? = null

    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }
    private var _binding: FragmentDrinksBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDrinksBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding
    }

    companion object {

        fun newInstance(param1: String, param2: String) =
            Main().apply {
                arguments = Bundle().apply {

                }
            }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}