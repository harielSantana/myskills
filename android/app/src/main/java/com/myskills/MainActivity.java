package com.myskills;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate; // <- Adicionar esse import
import com.zoontek.rnbootsplash.RNBootSplash; // <- Adicionar esse import

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected ReactActivityDelegate createReactActivityDelegate() {
    return new ReactActivityDelegate(this, getMainComponentName()) {

      @Override
      protected void loadApp(String appKey) {
        RNBootSplash.init(MainActivity.this); // <- initialize the splash screen
        super.loadApp(appKey);
      }
    };
  }
}