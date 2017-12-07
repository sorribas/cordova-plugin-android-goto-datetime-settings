package org.sorribas.cordova.android.datetime;

import android.content.Context;
import android.content.Intent;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class CordovaAndroidGotoDatetimeSettings extends CordovaPlugin {
  private Context context;
  private android.app.Activity activity;

  @Override
  public void initialize(final CordovaInterface cordova, final CordovaWebView webView) {
    super.initialize(cordova, webView);
    this.context = (Context) cordova.getActivity().getApplication();
    this.activity = cordova.getActivity();
  }

  @Override
  public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
    if (action.equals("gotoDatetimeSettings")) {
      this.activity.startActivity(new Intent(android.provider.Settings.ACTION_DATE_SETTINGS));
      return true;
    } else {

      return false;

    }
  }
}
