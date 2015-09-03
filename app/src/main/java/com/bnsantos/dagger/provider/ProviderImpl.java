package com.bnsantos.dagger.provider;

/**
 * Created by bruno on 31/08/15.
 */
public class ProviderImpl implements Provider {
    public ProviderImpl() {}

    @Override
    public int getVersion() {
        return 1;
    }

    @Override
    public String getValue() {
        return "ProviderImpl";
    }
}
