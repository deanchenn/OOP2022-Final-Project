package application;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Scene12Controller implements Initializable{
	private Stage stage;
	private Scene scene;
	private Parent root;
	

	public void toPreviousPage(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Scene10.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	
	@FXML
	private TableView<StoreContacts> orderView;
	@FXML
	private TableColumn<StoreContacts,String> idID;
	@FXML
	private TableColumn<StoreContacts,String> nameID;
	@FXML
	private TableColumn<StoreContacts,String> typeID;
	@FXML
	private TableColumn<StoreContacts,String> addID;
	
	
	
	

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		initiateCols();
		loadData();
		System.out.println("inside scene12");
		
	}
	
	private void initiateCols() {
		
		nameID.setCellValueFactory(new PropertyValueFactory<>("name"));
		idID.setCellValueFactory(new PropertyValueFactory<>("id"));
		typeID.setCellValueFactory(new PropertyValueFactory<>("type"));
		addID.setCellValueFactory(new PropertyValueFactory<>("address"));
		
	}
	private void loadData() {
//		list4.removeAll(list4);
//		list4.addAll(ListStore.ListStore13);
//		list4.addAll(new Contacts("0001", "Customer 1", "12:15", "雞翅,薯條"));
//		list4.addAll(new Contacts("0002", "Customer 2", "12:30", "雞排, 雞排,薯條"));
//		list4.addAll(new Contacts("0003", "Customer 3", "12:45", "雞排,薯條"));


		ObservableList<StoreContacts> storeContacts = FXCollections.observableArrayList();
		
		for(int i = 0; i < 28; i++) {
			String id;
			String name;
			String type = "";
			String add;
			
			Stores store = new Stores(i);
			
			id = Integer.toString(i);
			//System.out.println("this is id's");
			//System.out.println(id);
			name = store.getName();
			for(int j = 0; j < store.getType().size(); j++) {
				type += store.getType();
			}
			add = store.getPosition().getAddress();
			storeContacts.addAll(new StoreContacts(id, name, type, add));
		}
		
		orderView.setItems(storeContacts);
	}
	


	
	@FXML
	private void selectRowFromTable(ActionEvent event) throws IOException {
		StoreContacts row = orderView.getSelectionModel().getSelectedItem();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene15.fxml"));
		root = loader.load();
		
		Scene15Controller Scene15c = loader.getController();
		Scene15c.setIndex(Integer.parseInt(row.getId()));
		System.out.println("this is row id : " + row.getId());
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	
	
	
}
