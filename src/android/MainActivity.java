package spikeglobal.cordova;

import org.apache.cordova.CordovaActivity;

public class MainActivity extends CordovaActivity {

    @Override
    public void init() {
        super.init();

        WebView webView = (SystemWebView)(appView.getEngine().getView());
        WebSettings webSettings = webView.getSettings();
        webSettings.setAllowFileAccess(true);
    }
}