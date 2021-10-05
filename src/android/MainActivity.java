package spikeglobal.cordova;

import org.apache.cordova.CordovaActivity;
import android.util.Log;

public class MainActivity extends CordovaActivity {

    @Override
    public void init() {
        super.init();

        Log.v("ImagePicker", "Setting web view setting.");

        WebView webView = (SystemWebView)(appView.getEngine().getView());
        WebSettings webSettings = webView.getSettings();
        webSettings.setAllowFileAccess(true);

        Log.i("ImagePicker", "Set web view setting.");
    }
}