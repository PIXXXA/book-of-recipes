package book.of.recipes.di.component

import book.of.recipes.di.*
import book.of.recipes.fragments.mainmenu.MainMenuFragment
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AppModule::class, NetworkModule::class, UtilsModule::class, FactoryModule::class]
)
interface AppComponent {
    fun inject(mainMenuFragment: MainMenuFragment)
}