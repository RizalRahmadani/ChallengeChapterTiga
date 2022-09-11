package com.example.challengechaptertiga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FragmentAbjad : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_abjad, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listKata = arrayListOf(
            ListKata("A"),
            ListKata("B"),
            ListKata("C"),
            ListKata("D"),
            ListKata("E"),
            ListKata("F"),
            ListKata("G"),
            ListKata("H"),
            ListKata("I"),
            ListKata("J"),
            ListKata("K"),
            ListKata("L"),
            ListKata("M"),
            ListKata("N"),
            ListKata("O"),
            ListKata("P"),
            ListKata("Q")

        )

        val adapter = AdapterKata(listKata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvAbjad)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter


    }


}