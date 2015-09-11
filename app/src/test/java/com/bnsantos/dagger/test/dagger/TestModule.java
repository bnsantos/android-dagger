package com.bnsantos.dagger.test.dagger;

import com.bnsantos.dagger.provider.Provider;
import com.bnsantos.dagger.test.provider.ProviderMock;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by bruno on 03/09/15.
 */
@Module
public class TestModule {
    @Provides
    @Singleton
    Provider provideProvider(){
        return new ProviderMock();
    }
}
