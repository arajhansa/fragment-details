package com.advayrajhansa.employeeportal.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import com.advayrajhansa.employeeportal.R
import com.advayrajhansa.employeeportal.model.ProfileDetails
import com.advayrajhansa.employeeportal.ui.activity.MainActivity

class ProfileFragment(private val mainActivity: MainActivity) : Fragment(R.layout.fragment_profile) {

    private lateinit var nameText: EditText

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nameText = view.findViewById(R.id.profileInputName)
        val saveButton: Button = view.findViewById(R.id.saveProfile)
        saveButton.setOnClickListener { saveProfile() }
    }

    private fun saveProfile() {
        val profileDetails = ProfileDetails(
            nameText.text.toString()
        )
        parentFragmentManager.setFragmentResult("requestKey", bundleOf("profileDetails" to profileDetails))
        mainActivity.saveProfile()
    }

}
