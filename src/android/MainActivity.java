package spikeglobal.cordova;

import org.apache.cordova.CordovaActivity;
import android.util.Log;

public class MainActivity extends CordovaActivity {

    @Override
    public void init() {
        super.init();

        Log.v("Image Picker", "Setting web view setting.");

        WebView webView = (SystemWebView)(appView.getEngine().getView());
        WebSettings webSettings = webView.getSettings();
        webSettings.setAllowFileAccess(true);

        Log.i("Image Picker", "Set web view setting.");
    }
}