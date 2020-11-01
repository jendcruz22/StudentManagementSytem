package com.tms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Test extends Application {
	public static Stage stage;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		Parent root = FXMLLoader.load(getClass().getResource("fxml/Login.fxml"));
		primaryStage.setTitle("Teachers' Management system");
		primaryStage.setScene(new Scene(root));
		primaryStage.setResizable(false);
		primaryStage.show();
	}
}
