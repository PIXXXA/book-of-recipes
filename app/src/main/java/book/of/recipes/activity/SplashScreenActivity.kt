package book.of.recipes.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import book.of.recipes.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen_layout)
        supportActionBar?.hide()
        Handler().postDelayed({
            val intent = Intent(this, BookRecipesActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_DISPLAY_LENGTH)
    }

    companion object {
        const val SPLASH_DISPLAY_LENGTH: Long = 4000
    }
}