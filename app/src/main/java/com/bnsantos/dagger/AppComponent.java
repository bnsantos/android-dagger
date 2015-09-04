package com.bnsantos.dagger;

import com.bnsantos.dagger.components.MyComponent;
import com.bnsantos.dagger.modules.ProviderModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by bruno on 03/09/15.
 */
@Singleton
@Component(modules = {ProviderModule.class})
public interface AppComponent extends MyComponent {

}