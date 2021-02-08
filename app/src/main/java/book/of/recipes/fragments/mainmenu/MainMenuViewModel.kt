package book.of.recipes.fragments.mainmenu

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import book.of.recipes.ResourceProvider
import book.of.recipes.data.RecipesListModel

class MainMenuViewModel(private val resourceProvider: ResourceProvider) : ViewModel() {

    val recyclerList = MutableLiveData<ArrayList<RecipesListModel>>()
}