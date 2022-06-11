package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;

public class StoreContacts{
	private final SimpleStringProperty id;
	private final SimpleStringProperty name;
	private final SimpleStringProperty type;
	private final SimpleStringProperty address;
	//private CheckBox select;
	
	public StoreContacts(String id, String name, String type, String address) {
		this.id = new SimpleStringProperty(id);
		this.name = new SimpleStringProperty(name);
		this.type = new SimpleStringProperty(type);
		this.address = new SimpleStringProperty(address);
		//this.select = new CheckBox();
	}
	
	public String getName() {
		return name.get();
	}
	public String getId() {
		return id.get();
	}
	public String getType() {
		return type.get();
	}
	public String getAddress() {
		return address.get();
	}

	
//	public CheckBox getSelect(){
//		return select;
//	}
//	public void setSelect(CheckBox select) {
//		this.select = select;
//	}
//	
	
}