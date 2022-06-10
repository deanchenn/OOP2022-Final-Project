package application;
import application.Scene4Controller.Contacts;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import application.ListStore;




public class Main extends Application {
	

	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Stores store = new Stores(3);
		System.out.println("name: "+store.getName());
		System.out.println("menu: "+ store.getItemList());
		
		System.out.println("type: "+store.getType());
		System.out.println("position: "+store.getPosition()); // prints memory address of position
		System.out.println("Store description: "+store.getStoreDescription());
		System.out.println("business time: "+store.getBusinessTime());
		System.out.println("phone: "+store.getPhone());
		
		ListStore.ListStore4.addAll(new Contacts("0001", "Customer 1", "12:15", "雞翅,薯條"));
		ListStore.ListStore4.addAll(new Contacts("0002", "Customer 2", "12:30", "雞排, 雞排,薯條"));
		ListStore.ListStore5.addAll(new Contacts("0003", "Customer 3", "12:45", "雞排,薯條"));
		ListStore.ListStore5.addAll(new Contacts("0004", "Customer 4", "15:45", "薯條"));
		launch(args);
	}
}
