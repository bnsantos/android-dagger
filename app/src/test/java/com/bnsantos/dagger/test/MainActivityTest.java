package com.bnsantos.dagger.test;

import android.content.Context;
import android.os.Build;
import android.widget.TextView;

import com.bnsantos.dagger.App;
import com.bnsantos.dagger.BuildConfig;
import com.bnsantos.dagger.test.dagger.DaggerTestComponent;
import com.bnsantos.dagger.MainActivity;
import com.bnsantos.dagger.R;
import com.bnsantos.dagger.test.dagger.TestModule;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

/**
 * Created by bruno on 03/09/15.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class MainActivityTest {
    private MainActivity mMainActivity;
    private Context mContext;

    @Before
    public void setup() {

        ((App)RuntimeEnvironment.application).setComponent(DaggerTestComponent.builder().testModule(new TestModule()).build());
        mContext = RuntimeEnvironment.application;
    }

    @Test
    public void testInitialState(){
        mMainActivity = Robolectric.buildActivity(MainActivity.class).get();
        //MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        Assert.assertNotNull(mMainActivity);
        /*TextView version = (TextView) mMainActivity.findViewById(R.id.version);
        TextView value = (TextView) mMainActivity.findViewById(R.id.value);

        Assert.assertEquals("1", version.getText().toString());
        Assert.assertEquals("ProviderImpl", value.getText().toString());*/
    }
}
