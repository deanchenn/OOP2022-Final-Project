package application;

// tutorial : https://www.youtube.com/watch?v=mKqAOUV0A6U


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Scene4Controller.Contacts;
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

public class Scene6Controller implements Initializable {
	//ObservableList<Contacts> list5 = FXCollections.observableArrayList();
	
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
	
	//Button []button = new Button[3];
	
	
	
	
	
	public void switchBackToScene3(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene3.fxml"));
		root = loader.load();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void addContacts(ObservableList<Contacts> dataListRemove) {
		//list5.removeAll(list5);
		ListStore.ListStore6.addAll(dataListRemove);
		
	}
	
	@FXML
	private void deleteSelectedRows(ActionEvent event) {
		ObservableList<Contacts> dataListRemove = FXCollections.observableArrayList();
		
		for(Contacts bean : ListStore.ListStore6) {
			if(bean.getSelect().isSelected()) {
				dataListRemove.add(bean);
			}
		}
		ListStore.ListStore6.removeAll(dataListRemove);
	}
	
//	@FXML
//	private void TRYdeleteSelectedRows(ActionEvent event) {
//		list5.removeAll(list5);
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
		// list.removeAll(list);
		//list5.addAll(new Contacts("0004", "Customer 4", "14:15", "薯條"));
		//list5.addAll(new Contacts("0005", "Customer 5", "16:30", "雞排, 薯條"));
		orderView.setItems(ListStore.ListStore6);
	}
}
