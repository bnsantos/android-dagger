package com.bnsantos.dagger;

import android.app.Application;

import com.bnsantos.dagger.dagger.Dagger2Helper;
import com.bnsantos.dagger.dagger.modules.ProviderModule;

/**
 * Created by bruno on 31/08/15.
 */
public class App extends Application {
    private AppComponent mComponent = null;

    @Override
    public void onCreate() {
        super.onCreate();
        if(mComponent==null){
            //mComponent = DaggerAppComponent.builder().providerModule(new ProviderModule()).build();
            mComponent = Dagger2Helper.buildComponent(AppComponent.class, new ProviderModule());
        }
    }

    public AppComponent getComponent() {
        return mComponent;
    }

    public void setComponent(AppComponent mComponent) {
        this.mComponent = mComponent;
    }
}
