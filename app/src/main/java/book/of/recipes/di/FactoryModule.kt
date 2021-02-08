package book.of.recipes.di

import book.of.recipes.ResourceProvider
import book.of.recipes.fragments.mainmenu.MainMenuFactory
import dagger.Module
import dagger.Provides
import javax.inject.Scope
import javax.inject.Singleton

@Module
class FactoryModule {
    @Provides
    @Singleton
    fun mainMenuFactory(resourceProvider: ResourceProvider): MainMenuFactory {
        return MainMenuFactory(resourceProvider)
    }
}