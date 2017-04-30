# javafx_framefork
Framework for work with javaFX use html5 and css3 withn`t prefix -fx-.

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
