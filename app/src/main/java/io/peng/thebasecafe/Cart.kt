package io.peng.thebasecafe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import io.peng.thebasecafe.databinding.FragmentCartBinding
import io.peng.thebasecafe.databinding.FragmentMainBinding

class Cart : Fragment(),View.OnClickListener {
    private var navController: NavController? = null

    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }
    private var _binding: FragmentCartBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCartBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding.checkoutBtn.setOnClickListener {
            onClick(it)
        }
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

    override fun onClick(v: View?) {
        when (v!!.id){
            binding.checkoutBtn.id -> navController!!.navigate(R.id.action_cart_to_pay)
        }
    }
}
