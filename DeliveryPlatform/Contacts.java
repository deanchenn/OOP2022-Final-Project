package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;

public class Contacts{
	private final SimpleStringProperty num;
	private final SimpleStringProperty cus;
	private final SimpleStringProperty time;
	private final SimpleStringProperty item;
	private CheckBox select;
	
	public Contacts(String num, String cus, String time, String item) {
		this.num = new SimpleStringProperty(num);
		this.cus = new SimpleStringProperty(cus);
		this.time = new SimpleStringProperty(time);
		this.item = new SimpleStringProperty(item);
		this.select = new CheckBox();
	}
	
	public String getNum() {
		return num.get();
	}
	public String getCus() {
		return cus.get();
	}
	public String getTime() {
		return time.get();
	}
	public String getItem() {
		return item.get();
	}

	
	public CheckBox getSelect(){
		return select;
	}
	public void setSelect(CheckBox select) {
		this.select = select;
	}
	
	
}