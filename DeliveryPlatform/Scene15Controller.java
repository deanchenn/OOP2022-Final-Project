package application;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.Queue;
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

public class Scene15Controller implements Initializable{
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	int storeIndex;
	

	public void toPreviousPage(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Scene10.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	
	@FXML
	private TableView<itemContacts> orderView;
	@FXML
	private TableColumn<itemContacts, String> nameID;
	@FXML
	private TableColumn<itemContacts,String> priceID;
	
	
	public void setIndex(int i) {
		System.out.println("this is row id : " + i);
		this.storeIndex = i;
		System.out.println("this is store index : " + this.storeIndex);
	}
	
	

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		System.out.println("inside scene15");
		initiateCols();
		loadData();
		
	}
	
	private void initiateCols() {
		nameID.setCellValueFactory(new PropertyValueFactory<>("name"));
		priceID.setCellValueFactory(new PropertyValueFactory<>("price"));
		
	}
	private void loadData() {


		ObservableList<itemContacts> iContacts = FXCollections.observableArrayList();
		//System.out.println("from scene15, this.storeIndex : " + this.storeIndex);
		Stores store = new Stores(this.storeIndex);
		
		Queue<Items> listOfItems = store.getItemList();
		
		for(Items i : listOfItems){
			String itemName;
			String itemPrice;
			itemName = i.getName();
			itemPrice = i.getPrice();
			iContacts.addAll(new itemContacts(itemName, itemPrice));
        }
		
		orderView.setItems(iContacts);
	}
	
	

	
	
}
