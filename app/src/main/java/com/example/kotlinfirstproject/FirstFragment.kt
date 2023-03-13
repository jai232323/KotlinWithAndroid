package com.example.kotlinfirstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.kotlinfirstproject.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {


    private lateinit var textView1 : TextView

    private lateinit var binding: FragmentFirstBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentFirstBinding.inflate(inflater,container,false)
      //  val view = inflater.inflate(R.layout.fragment_first, container, false)



       // textView1 = findViewById(R.id.textView1)

        binding.textView1.setOnClickListener {

            //it.findNavController().navigate(R.id.navigateToSecondFragment)

            val action = FirstFragmentDirections.navigateToSecondFragment(2303)

            it.findNavController().navigate(action)

            //Navigation.findNavController(view).navigate(action)
        }
//            Navigation.findNavController(view).navigate(R.id.navigateToSecondFragment) }


        return binding.root
    }

}