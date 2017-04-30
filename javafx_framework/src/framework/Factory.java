package framework;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker.State;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Factory {

	public static WebEngine createWebEngine(WebView	browser){
		WebEngine webEngine = browser.getEngine();




		return webEngine;

	}

}
