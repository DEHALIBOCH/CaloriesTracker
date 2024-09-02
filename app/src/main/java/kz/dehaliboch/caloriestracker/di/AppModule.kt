package kz.dehaliboch.caloriestracker.di

import android.app.Application
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kz.dehaliboch.core.data.preferencies.DefaultPreferencies
import kz.dehaliboch.core.domain.preferencies.Preferencies
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSharedPreferencies(app: Application): SharedPreferences {
        return app.getSharedPreferences("shared_prefs", MODE_PRIVATE)
    }

    @Provides
    @Singleton
    fun providePreferencies(sharedPreferences: SharedPreferences): Preferencies {
        return DefaultPreferencies(sharedPreferences)
    }
}