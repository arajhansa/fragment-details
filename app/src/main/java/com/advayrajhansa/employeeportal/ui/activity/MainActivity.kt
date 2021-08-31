package com.advayrajhansa.employeeportal.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.advayrajhansa.employeeportal.R
import com.advayrajhansa.employeeportal.model.ProfileDetails
import com.advayrajhansa.employeeportal.ui.fragment.BottomNavFragment
import com.advayrajhansa.employeeportal.ui.fragment.ProfileDetailsFragment
import com.advayrajhansa.employeeportal.ui.fragment.ProfileFragment

class MainActivity : AppCompatActivity() {

    private val profileFragment = ProfileFragment(this)
    private val profileDetailsFragment = ProfileDetailsFragment()
    private val bottomNavFragment = BottomNavFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.mainFragmentContainer, profileFragment)
            .add(R.id.bottomNavContainer, bottomNavFragment)
            .commit()
    }

    fun saveProfile() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.mainFragmentContainer, profileDetailsFragment)
            .addToBackStack(null)
            .commit()
    }

}