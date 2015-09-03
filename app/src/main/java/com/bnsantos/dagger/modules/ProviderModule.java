package com.bnsantos.dagger.modules;

import com.bnsantos.dagger.provider.Provider;
import com.bnsantos.dagger.provider.ProviderImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by bruno on 03/09/15.
 */
@Module
public class ProviderModule {
    @Provides
    @Singleton
    Provider provideProvider(){
        return new ProviderImpl();
    }
}
