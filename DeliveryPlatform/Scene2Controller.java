package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Node;
import javafx.stage.Stage;


public class Scene2Controller {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	Stores store;
	
	@FXML
	Label nameLabel;
	
	@FXML
	Label idLabel;
	
	String un;
	String iden;
	
	

	
	public void displayName(String username, String pw, String id) {
		un = username;
		store = new Stores(Integer.parseInt(un));
		iden = id;
		idLabel.setText("Login as: " + id);
		nameLabel.setText("Hello: " + store.getName());
		
	}
	
	public void switchBackToScene1(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
		root = loader.load();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	public void switchToScene3(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene3.fxml"));
		root = loader.load();
		
		//Scene3Controller scene3Controller = loader.getController();
		//scene3Controller.welcomeMsg(un, iden);
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
	
	
}
