package application;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import application.Scene1Controller;

public class Scene10Controller {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void checkMemberInformation(ActionEvent event) throws IOException {
		
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene11.fxml"));
		root = loader.load();
		
		Scene11Controller infoController = loader.getController();
		infoController.displayInformation(Scene1Controller.id, Scene1Controller.password, Scene1Controller.username);
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void checkStores(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Scene12.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void checkCurrentOrder(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Scene13.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void checkHistoryOrder(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Scene14.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchBackToScene1(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
		root = loader.load();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}

}
