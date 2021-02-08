package book.of.recipes.di

import book.of.recipes.IMAGE_URL
import book.of.recipes.rest.RestApiRetrofit
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {
    @Provides
    @Singleton
    fun httpRequest(): OkHttpClient {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder().addInterceptor(loggingInterceptor).build()
    }

    @Provides
    @Singleton
    fun retrofitBuild(client: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .baseUrl(IMAGE_URL).client(client).build()
    }

    @Provides
    @Singleton
    fun serviceCreate(retrofit: Retrofit): RestApiRetrofit {
        return retrofit.create(RestApiRetrofit::class.java)
    }
}