package application;

// tutorial : https://www.youtube.com/watch?v=mKqAOUV0A6U


import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import application.ListStore;


public class Scene13Controller implements Initializable {
	//ObservableList<Contacts> list4 = FXCollections.observableArrayList();
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	private TableView<Contacts> orderView;
	@FXML
	private TableColumn<Contacts,String> numID;
	@FXML
	private TableColumn<Contacts,String> cusID;
	@FXML
	private TableColumn<Contacts,String> timeID;
	@FXML
	private TableColumn<Contacts,String> itemID;

	@FXML
	private TableColumn<Contacts,String> doneID;
	
	
	
	
	
	public void switchBackToScene10(ActionEvent event) throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene10.fxml"));
		root = loader.load();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
//	public void addContacts(ObservableList<Contacts> dataListRemove) {
//		//list5.removeAll(list5);
//		ListStore.ListStore13.addAll(dataListRemove);
//		
//	}

	
	@FXML
	private void sendToScene14Action(ActionEvent event) throws IOException {
		ObservableList<Contacts> dataListRemove = FXCollections.observableArrayList();
		
		for(Contacts bean : ListStore.ListStore13) {
			if(bean.getSelect().isSelected()) {
				dataListRemove.add(bean);
			}
		}
		ListStore.ListStore13.removeAll(dataListRemove);
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene14.fxml"));
		root = loader.load();
		
		Scene14Controller Scene14c = loader.getController();
		Scene14c.addContacts(dataListRemove);
		
		//Stage stage = new Stage();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setScene(new Scene(root));
		stage.show();
		
	}
	
//	@FXML
//	private void TRYdeleteSelectedRows(ActionEvent event) {
//		ListStore.ListStore13.removeAll(ListStore.ListStore13);
//	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		initiateCols();
		loadData();
		
	}
	
	private void initiateCols() {
		numID.setCellValueFactory(new PropertyValueFactory<>("num"));
		cusID.setCellValueFactory(new PropertyValueFactory<>("cus"));
		timeID.setCellValueFactory(new PropertyValueFactory<>("time"));
		itemID.setCellValueFactory(new PropertyValueFactory<>("item"));
		doneID.setCellValueFactory(new PropertyValueFactory<>("select"));
		
		
	}
	private void loadData() {
//		list4.removeAll(list4);
//		list4.addAll(ListStore.ListStore13);
//		list4.addAll(new Contacts("0001", "Customer 1", "12:15", "雞翅,薯條"));
//		list4.addAll(new Contacts("0002", "Customer 2", "12:30", "雞排, 雞排,薯條"));
//		list4.addAll(new Contacts("0003", "Customer 3", "12:45", "雞排,薯條"));
		orderView.setItems(ListStore.ListStore13);
	}
	

	
}
