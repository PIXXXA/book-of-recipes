package book.of.recipes.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import book.of.recipes.R
import book.of.recipes.fragments.mainmenu.MainMenuFragment

class BookRecipesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_recipes)
        setFragmentContainer()
    }

    private fun setFragmentContainer() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container, MainMenuFragment())
            .commit()
    }
}