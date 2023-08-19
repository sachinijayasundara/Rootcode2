package com.example.rootcodeapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.rootcodeapplication.databinding.NavBarBinding

class Nav_bar : AppCompatActivity() {

    private lateinit var binding: NavBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = NavBarBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){

//             R.id.journey -> replaceFragment(Journey())
              R.id.home -> replaceFragment(Home())
                R.id.profile -> replaceFragment(Profile())
           R.id.bookings -> replaceFragment(Bookings())
                R.id.planets -> replaceFragment(Planets())

                else ->{

               }


            }
            true
       }
    }

   private fun replaceFragment(fragment : Fragment){

        val framentManager = supportFragmentManager
        val fragmentTransaction = framentManager.beginTransaction()
       fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}

