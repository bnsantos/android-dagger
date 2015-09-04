package com.bnsantos.dagger.test.provider;

import com.bnsantos.dagger.provider.Provider;

/**
 * Created by bruno on 31/08/15.
 */
public class ProviderMock implements Provider {
    @Override
    public int getVersion() {
        return 1;
    }

    @Override
    public String getValue() {
        return "Mocked";
    }
}
