package com.example.classwork

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class MyNetworkFragment: Fragment(R.layout.fragment_my_network) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ageEditText = view.findViewById<EditText>(R.id.ageEditText)
        val sendButton = view.findViewById<Button>(R.id.sendButton)

        val navController = Navigation.findNavController(view)

        sendButton.setOnClickListener {
            val amount = ageEditText.text.toString()

            if (amount.isEmpty()){
                return@setOnClickListener
            }

            val amount2 = amount.toInt()

            val action = MyNetworkFragmentDirections.actionMyNetworkFragmentToProfileFragment2(amount2)
            navController.navigate(action)

        }
    }

}