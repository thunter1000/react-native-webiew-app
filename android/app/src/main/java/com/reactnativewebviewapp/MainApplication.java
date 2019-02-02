package com.reactnativewebviewapp;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.webkit.WebView;

import com.facebook.react.ReactApplication;
import com.lugg.ReactNativeConfig.ReactNativeConfigPackage;
import com.reactnativecommunity.webview.RNCWebViewPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new ReactNativeConfigPackage(),
            new RNCWebViewPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
      if (0 != (getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE))
      { WebView.setWebContentsDebuggingEnabled(true); }
    }
  }
}
