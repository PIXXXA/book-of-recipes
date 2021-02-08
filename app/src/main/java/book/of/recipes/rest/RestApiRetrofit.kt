package book.of.recipes.rest

import book.of.recipes.data.RecipesListModel
import retrofit2.Call
import retrofit2.http.GET

interface RestApiRetrofit {
    @GET("marvel")
    fun getMovieList(): Call<MutableList<RecipesListModel>>
}