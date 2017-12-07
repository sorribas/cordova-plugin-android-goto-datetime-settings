/*global cordova, module*/

module.exports = {
  gotoDatetimeSettings: function (name, successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "CordovaAndroidGotoDatetimeSettings", "gotoDatetimeSettings", []);
  }
};
