package pl.brightinventions.templateapp.di

import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun providesTestString(): String = "test"
}