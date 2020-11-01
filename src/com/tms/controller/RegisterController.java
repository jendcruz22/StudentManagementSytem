package com.tms.controller;

import com.mongodb.MongoClientException;
import com.mongodb.client.MongoDatabase;
import com.tms.Connect;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.sql.SQLException;

public class RegisterController {
	@FXML
	private Pane registerpage;

	@FXML
	private TextField reguser;

	@FXML
	private TextField regpassword;

	@FXML
	private TextField hintquestion;

	@FXML
	private TextField classes;

	@FXML
	private TextField regconpassword;

	@FXML
	private Button register;

	@FXML
	private Label status;

	@FXML
	void toMainPage(ActionEvent event) {
		String username = reguser.getText();
		String password = regpassword.getText();
		String confpassword = regconpassword.getText();

//		boolean doesUserExist(String username) {
//			boolean found = false;
//			try {
//				Connect.connect();
//				MongoDatabase db =
//
//
//			} catch (MongoClientException e) {
//				e.printStackTrace();
//			}
//			return found;
//		}

		if (username.isEmpty() || password.isEmpty() || confpassword.isEmpty()) {
			status.setText("Fields cannot be empty");
		} else if (!password.equals(confpassword)) {
			status.setText("Passwords do not match");
		} else if (doesUserExist(username)) {
			status.setText("User already exists");
		} else {
			registerUser(username, password);
		}
	}

}


