package com.advayrajhansa.employeeportal.ui.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.advayrajhansa.employeeportal.R
import com.advayrajhansa.employeeportal.model.ProfileDetails

class ProfileDetailsFragment : Fragment(R.layout.fragment_profile_details) {

    private lateinit var name: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        parentFragmentManager.setFragmentResultListener("requestKey", this) { _, bundle ->
            val result: ProfileDetails = bundle.getParcelable( "profileDetails") ?: ProfileDetails()
            updateDetails(result)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        name = view.findViewById(R.id.profileDetailsName)
    }

    private fun updateDetails(result: ProfileDetails) {
        name.text = result.name
    }

}
