package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
//import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class SelectIdentityController {
	private Parent root;
	private Stage stage;
	private Scene scene;
	@FXML
	Label usernameLabel;
	
	public void displayName(String username) {
		usernameLabel.setText("Welcome, " + username);
	}
	
	public void switchToSceneDeliveryMan(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SceneDeliveryMan.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToSceneCustomer(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SceneCustomer.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToSceneStore(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SceneStore.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void Logout(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SceneLogin.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
}
