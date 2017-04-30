package application;
import org.w3c.dom.Document;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker.State;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;


public class Main extends Application {
	WebView browser;
	WebEngine webEngine;
	private Document doc = null;

	@Override
	public void start(Stage stage) {
		WebView	browser = new WebView();
		 webEngine = browser.getEngine();

		            	webEngine.getLoadWorker().stateProperty().addListener( new ChangeListener<State>() {
		                              @Override
		                              public void changed(ObservableValue<? extends State> ov, State oldState, State newState) {
		                                  if (newState == State.SUCCEEDED) {
		                                	  browser.requestFocus();
		                                	  String pathToCSS = "/style/main.css";
		                                	  browser.getEngine().setUserStyleSheetLocation(getClass().getResource(pathToCSS).toExternalForm());
		                                  }
		                              }
		                          });
		            	webEngine.loadContent("<html><body><p>Пишем проги c помощью html5 и css3</p></body></html>");

		                Scene scene = new Scene(browser,750,500, Color.web("#666970"));
				        stage.setScene(scene);
					    stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
