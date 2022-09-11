package com.example.challengechaptertiga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FragmentKata : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kata, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var huruf = arguments?.getString("kata")
        when (huruf){
            "A" -> listA()
            "B" -> listB()
            "C" -> listC()
            "D" -> listD()
            "E" -> listE()
            "F" -> listF()
            "G" -> listG()
            "H" -> listH()
            "I" -> listI()
            "J" -> listJ()
            "K" -> listK()
            "L" -> listL()
            "M" -> listM()
            "N" -> listN()
            "O" -> listO()
            "P" -> listP()
            "Q" -> listQ()


        }


    }
    fun listA(){

        val listKata = arrayListOf(
            ListKata("Ayam"),
            ListKata("Angsa"),
            ListKata("Anjing"),

            )
        val adapter = AdapterKata(listKata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listB(){

        val listKata = arrayListOf(
            ListKata("Bakso"),
            ListKata("Bakmi"),
            ListKata("Bubur"),

            )
        val adapter = AdapterKata(listKata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listC(){

        val listdata = arrayListOf(
            ListKata("Cacat"),
            ListKata("Cucu"),
            ListKata("Cinta"),

            )
        val adapter = AdapterKata(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter

    }
    fun listD(){
        val listdata = arrayListOf(
            ListKata("Dor"),
            ListKata("Diam"),
            ListKata("Duduk"),

            )
        val adapter = AdapterKata(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listE(){
        val listdata = arrayListOf(
            ListKata("Elang"),
            ListKata("Emas"),
            ListKata("Ember"),

            )
        val adapter = AdapterKata(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listF(){
        val listdata = arrayListOf(
            ListKata("Fifa"),
            ListKata("Futsal"),
            ListKata("Fana"),

            )
        val adapter = AdapterKata(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listG(){
        val listdata = arrayListOf(
            ListKata("Girang"),
            ListKata("Gendut"),
            ListKata("Gulat"),

            )
        val adapter = AdapterKata(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listH(){
        val listdata = arrayListOf(
            ListKata("Hari"),
            ListKata("Harus"),
            ListKata("Hebat"),

            )
        val adapter = AdapterKata(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter

    }
    fun listI(){
        val listdata = arrayListOf(
            ListKata("Ini"),
            ListKata("Inovasi"),
            ListKata("Indonesia"),

            )
        val adapter = AdapterKata(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listJ(){
        val listdata = arrayListOf(
            ListKata("Jabatan"),
            ListKata("Jeljar"),
            ListKata("Jenius"),

            )
        val adapter = AdapterKata(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listK(){
        val listdata = arrayListOf(
            ListKata("Karma"),
            ListKata("Keren"),
            ListKata("Keras"),

            )
        val adapter = AdapterKata(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listL(){
        val listdata = arrayListOf(
            ListKata("Lambat"),
            ListKata("Lembut"),
            ListKata("Leman"),

            )
        val adapter = AdapterKata(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listM(){
        val listdata = arrayListOf(
            ListKata("Malas"),
            ListKata("Menang"),
            ListKata("Masuk"),

            )
        val adapter = AdapterKata(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listN(){
        val listdata = arrayListOf(
            ListKata("Nasi"),
            ListKata("Neraka"),
            ListKata("Nanas"),

            )
        val adapter = AdapterKata(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listO(){
        val listdata = arrayListOf(
            ListKata("Orang"),
            ListKata("Ormas"),
            ListKata("Obat"),

            )
        val adapter = AdapterKata(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listP(){
        val listdata = arrayListOf(
            ListKata("Pintar"),
            ListKata("Penyayang"),
            ListKata("Pemaaf"),

            )
        val adapter = AdapterKata(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listQ(){
        val listdata = arrayListOf(
            ListKata("Qwerty"),
            ListKata("Quick"),
            ListKata("Quit"),

            )
        val adapter = AdapterKata(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.rvKata)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }



}