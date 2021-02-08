package book.of.recipes.fragments.mainmenu

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import book.of.recipes.ResourceProvider
import javax.inject.Inject

class MainMenuFactory @Inject constructor(
    private val resourceProvider: ResourceProvider
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(
            ResourceProvider::class.java
        ).newInstance(resourceProvider)
    }
}