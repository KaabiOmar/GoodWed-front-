package tn.esprit.wedding

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.animation.AccelerateInterpolator
import android.widget.ImageView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView


class HomeActivity : AppCompatActivity() {

    //lateinit var toggle: ActionBarDrawerToggle
    private lateinit var navController : NavController
    private lateinit var toolbar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        //setSupportActionBar(findViewById(R.id.toolbar))



        val navHostFragment = supportFragmentManager.findFragmentById(R.id.mainContainer) as NavHostFragment
        navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        NavigationUI.setupWithNavController(bottomNavigationView, navController)

        val navigationView =findViewById<NavigationView>(R.id.nav_view)
        NavigationUI.setupWithNavController(navigationView,navController)



       /* val animatorSet = AnimatorSet()
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(image, "translationY", -1000.0f, 0.0f),
            ObjectAnimator.ofFloat(image, "alpha", 0.0f, 1.0f),

        )

        animatorSet.duration = 2000
        animatorSet.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                val animatorSet2 = AnimatorSet()
                animatorSet2.playTogether(
                    ObjectAnimator.ofFloat(image, "scaleX", 1f, 0.5f, 1f),
                    ObjectAnimator.ofFloat(image, "scaleY", 1f, 0.5f, 1f)
                )
                animatorSet2.interpolator = AccelerateInterpolator()
                animatorSet2.duration = 1000
                animatorSet2.start()
            }
        })
        animatorSet.start()*/

    }


    //override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    //  menuInflater.inflate(R.menu.nav_menu,menu)
    //return true
    //}
}