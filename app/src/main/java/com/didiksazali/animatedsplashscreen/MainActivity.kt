package com.didiksazali.animatedsplashscreen

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var animBottomUp: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animBottomUp = AnimationUtils.loadAnimation(this, R.anim.bottomtopanim)

        ivBackground.animate().translationY(-1550f).setDuration(800).startDelay = 300
        ivClover.animate().alpha(0f).setDuration(800).startDelay = 600
        tvWelcome.animate().translationY(140f).alpha(0f).setDuration(1200).startDelay = 300

        lvHome.startAnimation(animBottomUp)
        lvMenu.startAnimation(animBottomUp)
    }
}