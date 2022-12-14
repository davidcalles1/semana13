package com.example.tabtoolbar_clase13

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class vista_Fragmento : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vista__fragmento, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.takeIf { it.containsKey(ARG_OBJECT)}?.apply {
            val tvMensaje:TextView = view.findViewById(R.id.tv_Mensaje)
            tvMensaje.text="Vista Fragmento " + getInt(ARG_OBJECT).toString()
        }

    }

    companion object {

        private const val ARG_OBJECT = "OBJECT"
    }
}