package io.peng.thebasecafe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import io.peng.thebasecafe.databinding.FragmentHeaderBinding
import io.peng.thebasecafe.databinding.FragmentMainBinding

class Header : Fragment(),View.OnClickListener {

    private var navController: NavController? = null

    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }
    private var _binding: FragmentHeaderBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHeaderBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding.cartBtn.setOnClickListener {
            onClick(it)
        }
        binding.payBtn.setOnClickListener {
            onClick(it)
        }
        binding.trackOrderHeader.setOnClickListener {
            onClick(it)
        }
    }

    override fun onClick(v: View?){
        when (v!!.id){
            binding.cartBtn.id -> navController!!.navigate(R.id.action_main_to_cart)
            binding.payBtn.id -> navController!!.navigate(R.id.action_main_to_pay)
            binding.trackOrderHeader.id -> navController!!.navigate((R.id.action_main_to_track))
        }
    }
}