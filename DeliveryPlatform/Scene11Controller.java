package application;

import java.awt.Checkbox;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import application.Scene1Controller;

public class Scene11Controller {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	Checkbox checkbox;
	@FXML
	Label LabelAccount;
	@FXML
	Label LabelPassword;
	@FXML
	Label LabelName;
	@FXML
	Label LabelPhoneNumber;
	
	public void displayInformation(String id, String password, String username) {
		LabelAccount.setText("身份：" + id);
		LabelPassword.setText("密碼：" + password);
		LabelName.setText("姓名：" + username);
		LabelPhoneNumber.setText("電話：0900-123-456");
	}
	

	public void toDeliver(ActionEvent event) {
		
	}
	
	public void logout(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
		root = loader.load();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void toPreviousPage(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Scene10.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}
