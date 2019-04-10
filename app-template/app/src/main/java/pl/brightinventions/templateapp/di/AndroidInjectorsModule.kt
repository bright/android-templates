package pl.brightinventions.templateapp.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pl.brightinventions.templateapp.MainActivity

@Module
abstract class AndroidInjectorsModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}