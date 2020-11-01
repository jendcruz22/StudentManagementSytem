package com.tms.controller;

import com.tms.Test;
//import com.tms.Connect;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

	@FXML
	private Pane root;

	@FXML
	private TextField username;

	@FXML
	private PasswordField password;

	@FXML
	private Button register;

	@FXML
	private Button login;

	@FXML
	void onLogin(ActionEvent event) {
		String user = username.getText();
		String pass = password.getText();
//		try{
//
//		}
	}

	@FXML
	void toRegisterPage(ActionEvent event) {
		try {
			Stage registerStage = Test.stage;
			root = FXMLLoader.load(getClass().getResource("/com/tms/fxml/Register.fxml"));
			registerStage.setTitle("Register");
			registerStage.setScene(new Scene(root));
			registerStage.setResizable(false);
			registerStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
