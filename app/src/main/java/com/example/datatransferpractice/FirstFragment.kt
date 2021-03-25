package com.example.datatransferpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var button : Button
    // activity 에 맞는 view model 객체 생성
//    val mainViewModel by activityViewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button = view.findViewById(R.id.button)

        button.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }


    }


}