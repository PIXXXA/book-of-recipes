package book.of.recipes

import android.app.Application
import book.of.recipes.di.AppModule
import book.of.recipes.di.component.AppComponent
import book.of.recipes.di.component.DaggerAppComponent

class ApplicationConfigure : Application() {

    override fun onCreate() {
        super.onCreate()
        appComponent = buildComponent()
    }

    private fun buildComponent(): AppComponent {
        return DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    companion object {
        lateinit var appComponent: AppComponent
    }
}