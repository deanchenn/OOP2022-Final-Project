package application;


import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;

public class itemContacts{
	private final SimpleStringProperty name;
	private final SimpleStringProperty price;
	//private final SimpleStringProperty address;
	//private CheckBox select;
	
	public itemContacts(String name, String price) {
		this.name = new SimpleStringProperty(name);
		this.price = new SimpleStringProperty(price);
		//this.select = new CheckBox();
	}
	
	public String getName() {
		return name.get();
	}
	public String getPrice() {
		return price.get();
	}
	
	
//	public CheckBox getSelect(){
//		return select;
//	}
//	public void setSelect(CheckBox select) {
//		this.select = select;
//	}
	
	
}