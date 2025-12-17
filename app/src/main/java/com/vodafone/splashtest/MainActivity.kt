package com.vodafone.splashtest

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AnticipateInterpolator
import android.view.animation.DecelerateInterpolator
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.doOnEnd
import androidx.core.content.ContextCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
//        initSplashScreen()

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }





//    private fun initSplashScreen() {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
//            installSplashScreen().setOnExitAnimationListener { splashScreenView ->
//
//                val splashView = splashScreenView.view
//
//                // تغيير لون الخلفية تدريجيًا
//                val backgroundColorAnimator = ObjectAnimator.ofArgb(
//                    splashView,
//                    "backgroundColor",
//                    getColor(R.color.red), // لون splash
//                    getColor(R.color.white)     // لون شاشة الهوم
//                )
//
//                // Fade Out ناعم
//                val fadeOut = ObjectAnimator.ofFloat(
//                    splashView,
//                    View.ALPHA,
//                    1f,
//                    0f
//                )
//
//                // Scale خفيف جدًا
//                val scaleX = ObjectAnimator.ofFloat(
//                    splashView,
//                    View.SCALE_X,
//                    1f,
//                    1.05f
//                )
//                val scaleY = ObjectAnimator.ofFloat(
//                    splashView,
//                    View.SCALE_Y,
//                    1f,
//                    1.05f
//                )
//
//                AnimatorSet().apply {
//                    playTogether(
//                        backgroundColorAnimator,
//                        fadeOut,
//                        scaleX,
//                        scaleY
//                    )
//                    duration = 700L
//                    interpolator = AccelerateDecelerateInterpolator()
//                    doOnEnd {
//                        splashScreenView.remove()
//                    }
//                    start()
//                }
//            }
//        } else {
//            setTheme(R.style.Theme_MyApp_Splash)
//        }
//    }

//    private fun initSplashScreen() {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
//            installSplashScreen().setOnExitAnimationListener { splashScreenView ->
//
//                val splashView = splashScreenView.view
//
//                val scaleX = ObjectAnimator.ofFloat(
//                    splashView,
//                    View.SCALE_X,
//                    1f,
//                    1.3f
//                )
//
//                val scaleY = ObjectAnimator.ofFloat(
//                    splashView,
//                    View.SCALE_Y,
//                    1f,
//                    1.3f
//                )
//
//                val fadeOut = ObjectAnimator.ofFloat(
//                    splashView,
//                    View.ALPHA,
//                    1f,
//                    0f
//                )
//
//                AnimatorSet().apply {
//                    playTogether(scaleX, scaleY, fadeOut)
//                    duration = 1000L
//                    interpolator = DecelerateInterpolator()
//                    doOnEnd {
//                        splashScreenView.remove()
//                    }
//                    start()
//                }
//            }
//        } else {
//            setTheme(R.style.Theme_MyApp_Splash)
//        }
//    }

//    private fun initSplashScreen() {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
//
//            val splashScreen = installSplashScreen()
//
//            splashScreen.setOnExitAnimationListener { splashScreenView ->
//
//                val translateAnim = ObjectAnimator.ofFloat(
//                    splashScreenView.view,
//                    View.TRANSLATION_Y,
//                    0f,
//                    -splashScreenView.view.height * 0.15f
//                )
//
//                val alphaAnim = ObjectAnimator.ofFloat(
//                    splashScreenView.view,
//                    View.ALPHA,
//                    1f,
//                    0f
//                )
//
//                AnimatorSet().apply {
//                    playTogether(translateAnim, alphaAnim)
//                    duration = 900L
//                    interpolator = AccelerateDecelerateInterpolator()
//                    doOnEnd { splashScreenView.remove() }
//                    start()
//                }
//            }
//
//        } else {
//            setTheme(R.style.Theme_MyApp_Splash)
//        }
//    }



//    private fun initSplashScreen(){
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
//            installSplashScreen()
//            splashScreen.setOnExitAnimationListener { splashScreenView ->
//                val slideUp = ObjectAnimator.ofFloat(
//                    splashScreenView, View.TRANSLATION_Y, 0f, -splashScreenView.height.toFloat()
//                )
//                slideUp.interpolator = AnticipateInterpolator()
//                slideUp.duration = 1000L
//                slideUp.doOnEnd { splashScreenView.remove() }
//                slideUp.start()
//            }
//        }else{
//            setTheme(R.style.Theme_MyApp_Splash)
//        }
//    }
}