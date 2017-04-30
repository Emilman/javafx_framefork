package application;

import framework.view.*;
import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class Main extends Application {

	@Override
	public void start(Stage stage) {

		//create browser
		CustomBrowser browser = new CustomBrowser();
		browser.loadContent("<html><body><p>Пишем проги c помощью html5 и css3</p></body></html>");
		browser.plugCSS("/style/main.css");

		//link font and use in css
		 Font.loadFont(
				 Main.class.getResource("/fonts/Ubuntu-MI.ttf").toExternalForm(),
			      10
			    );

		 //view browser in scene
		    Scene scene = new Scene(browser,750,500, Color.web("#666970"));
	        stage.setScene(scene);
			stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
