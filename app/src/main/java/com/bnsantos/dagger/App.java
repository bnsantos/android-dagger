package com.bnsantos.dagger;

import android.app.Application;

import com.bnsantos.dagger.components.MyComponent;
import com.bnsantos.dagger.modules.ProviderModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by bruno on 31/08/15.
 */
public class App extends Application {
    private AppComponent mComponent = null;

    @Override
    public void onCreate() {
        super.onCreate();
        if(mComponent==null){
            mComponent = DaggerAppComponent.builder().providerModule(new ProviderModule()).build();
        }
    }

    public AppComponent getComponent() {
        return mComponent;
    }

    public void setComponent(AppComponent mComponent) {
        this.mComponent = mComponent;
    }
}
