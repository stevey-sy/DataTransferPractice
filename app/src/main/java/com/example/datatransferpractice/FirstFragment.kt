package com.example.datatransferpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.*
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        button = view.findViewById(R.id.button)

        button.setOnClickListener {
            setFragmentResult("requestKey", bundleOf("data" to "Hello"))
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }


    }


}