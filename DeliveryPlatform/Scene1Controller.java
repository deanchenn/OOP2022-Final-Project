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
	
	static String username;
	static String password;
	static String id;
	
	
	public void login(ActionEvent event) throws IOException {
		
		username = nameTextField.getText();
		password = pw.getText();
		id = choiceBox.getValue();
		
		//System.out.println(username);
		
		/*
		 * 這裡可以用一個if去判斷選擇的是誰，來決定load哪個scene
		 */
		if(id.equals("Store")) {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
			root = loader.load();
			
			Scene2Controller scene2Controller = loader.getController();
			scene2Controller.displayName(username, password, id);
		}
		else if(id.equals("Delivery Man")) {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneDeliveryMan.fxml"));
			root = loader.load();
			
//			CheckMemberInformationController infoController = loader.getController();
//			infoController.displayName(username, password, id);
		}
		else if(id.equals("Customer")) {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene10.fxml"));
			root = loader.load();
		}
		
		
		//root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}



}
