package com.example.kotlinfirstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.kotlinfirstproject.databinding.FragmentFirstBinding
import com.example.kotlinfirstproject.databinding.FragmentSecondkBinding

class SecondkFragment : Fragment() {



    private lateinit var textView2 : TextView

    val args : SecondkFragmentArgs by navArgs()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_secondk, container, false)

        val myNumber = args.number




        textView2 = view.findViewById(R.id.textView2)

        textView2.setText(myNumber.toString())

        textView2.setOnClickListener {


            Navigation.findNavController(view).navigate(R.id.navigateToFirstFragment) }

        return view
    }


}