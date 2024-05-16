package com.example.navigationandfragments.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.navigationandfragments.R
import com.example.navigationandfragments.databinding.FragmentFirstBinding
import com.example.navigationandfragments.databinding.FragmentSecondBinding
import com.example.navigationandfragments.databinding.FragmentThirdBinding



class third_Fragment : Fragment() {

   val args: third_FragmentArgs by navArgs()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
       return inflater.inflate(R.layout.fragment_third_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = args.data
    }
}