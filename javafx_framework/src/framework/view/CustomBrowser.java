package framework.view;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker.State;
import javafx.scene.layout.Region;
import javafx.scene.text.Font;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class CustomBrowser extends Region{

	//link
	 final String HOME = "http://java-buddy.blogspot.com/";

    WebView browser = new WebView();
    WebEngine webEngine = browser.getEngine();


    public CustomBrowser(){
       // webEngine.load(HOME);
        getChildren().add(browser);
    }

    public void plugCSS(String path){
    	webEngine.getLoadWorker().stateProperty().addListener( new ChangeListener<State>() {
            @Override
            public void changed(ObservableValue<? extends State> ov, State oldState, State newState) {
                if (newState == State.SUCCEEDED) {
              	  browser.requestFocus();
              	  browser.getEngine().setUserStyleSheetLocation(getClass().getResource(path).toExternalForm());
                }
            }
        });
    }

    public void loadContent(String content){
    	webEngine.loadContent(content);
    }
}
