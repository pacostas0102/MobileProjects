package com.sigmotoa.lifecycle

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.sigmotoa.lifecycle.databinding.FragmentNavBinding

class NavFragment : Fragment() {

    private var listener: OnFragmentActionsListener?=null
    private lateinit var binding: FragmentNavBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?



    ): View? {
        // Inflate the layout for this fragment
       binding= FragmentNavBinding.inflate(inflater,container,false)
        //return inflater.inflate(R.layout.fragment_nav, container, false)
       return binding.root
    }


/*

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //fragmenthome.setOnClickListener{listener?.onCLickFragmentButton()}
        binding.fabPlay.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
        }

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentActionsListener) {
            listener = context
        }
    }
    override fun onDetach() {
        super.onDetach()
        listener = null
    }*/


}