package com.bnsantos.dagger.test.dagger;

import com.bnsantos.dagger.AppComponent;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by bruno on 03/09/15.
 */
@Singleton
@Component(modules = TestModule.class)
public interface TestComponent extends AppComponent{
}
