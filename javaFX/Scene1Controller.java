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



public class Scene1Controller implements Initializable{
	
	@FXML
	TextField nameTextField;
	@FXML
	TextField pw;
	
	@FXML
	private Label label;
	
	@FXML
	private ChoiceBox<String> choiceBox;
	
	private String[] identity = {"Store", "Customer", "Delivery Man"};
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		choiceBox.getItems().addAll(identity);
	}
	
	
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void login(ActionEvent event) throws IOException {
		
		String username = nameTextField.getText();
		String password = pw.getText();
		String id = choiceBox.getValue();
		
		/*
		 * 這裡可以用一個if去判斷選擇的是誰，來決定load哪個scene
		 */
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
		root = loader.load();
		
		Scene2Controller scene2Controller = loader.getController();
		scene2Controller.displayName(username, password, id);
		
		//root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}



}
