package application;
//import application.Scene4Controller.Contacts;
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
		
		//這行會從json檔案load第四個店家的資料到store裡面
//		Stores store = new Stores(28);
//		//接下來就是會取得對應的資訊然後印出來
//		System.out.println("name: "+store.getName());
//		System.out.println("menu: "+ store.getItemList()); // 你要的應該是這行	
//		System.out.println("type: "+store.getType());
//		System.out.println("position: "+store.getPosition()); 
//		System.out.println("Store description: "+store.getStoreDescription());
//		System.out.println("business time: "+store.getBusinessTime());
//		System.out.println("phone: "+store.getPhone());
		
		ListStore.ListStore4.addAll(new Contacts("0001", "Customer 1", "12:15", "雞翅,薯條"));
		ListStore.ListStore4.addAll(new Contacts("0002", "Customer 2", "12:30", "雞排, 雞排,薯條"));
		ListStore.ListStore5.addAll(new Contacts("0003", "Customer 3", "12:45", "雞排,薯條"));
		ListStore.ListStore5.addAll(new Contacts("0004", "Customer 4", "15:45", "薯條"));
		
		ListStore.ListStore7.addAll(new Contacts("0001", "Customer 1", "12:15", "雞翅,薯條"));
		ListStore.ListStore7.addAll(new Contacts("0002", "Customer 2", "12:30", "雞排, 雞排,薯條"));
		ListStore.ListStore8.addAll(new Contacts("0003", "Customer 3", "12:45", "雞排,薯條"));
		ListStore.ListStore8.addAll(new Contacts("0004", "Customer 4", "15:45", "薯條"));
		
		ListStore.ListStore13.addAll(new Contacts("0001", "Customer 1", "12:15", "雞翅,薯條"));
		ListStore.ListStore13.addAll(new Contacts("0002", "Customer 2", "12:30", "雞排, 雞排,薯條"));
		ListStore.ListStore14.addAll(new Contacts("0003", "Customer 3", "12:45", "雞排,薯條"));
		ListStore.ListStore14.addAll(new Contacts("0004", "Customer 4", "15:45", "薯條"));
		launch(args);
	}
}
