package com.example.kotlinfirstproject.NavigationComponent

import android.graphics.drawable.ColorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.kotlinfirstproject.R
import com.example.kotlinfirstproject.databinding.ActivityNavigationComBinding
import com.google.android.material.navigation.NavigationView

class NavigationComActivity : AppCompatActivity()  {

    private lateinit var binding: ActivityNavigationComBinding

    //DrawerLayout
    private lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navigationView :NavigationView

    private lateinit var listener : NavController.OnDestinationChangedListener

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNavigationComBinding.inflate(layoutInflater)

        setContentView(binding.root)

        navController = findNavController(R.id.fragment)
        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.navigationView)
        appBarConfiguration = AppBarConfiguration(navController.graph,drawerLayout)

        navigationView.setupWithNavController(navController)
        setupActionBarWithNavController(navController,appBarConfiguration)

        listener = NavController.OnDestinationChangedListener { controller, destination, arguments ->


            if (destination.id == R.id.firstFragment)
            {
                supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.layout_background)))
            }else if (destination.id == R.id.secondkFragment)
            {
                supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.button_background)))
            }
        }


    }
//
    override fun onResume() {
        super.onResume()
        navController.addOnDestinationChangedListener(listener)
    }

    override fun onPause() {
        super.onPause()
        navController.addOnDestinationChangedListener(listener)
    }

    override fun onSupportNavigateUp(): Boolean {

        val navController = findNavController(R.id.fragment)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()

            // return super.onSupportNavigateUp()

    }
}