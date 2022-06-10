package application;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.LinkedList;
import java.util.Queue;
/*
 * queue相關語法：
 * 	offer 添加元素
 *  poll 返回第一個元素並刪除
 *  element/peek 返回第一個元素
 *  
 */

/**
 * 
 * @author yuhanchiang, deanchenn
 * @version 2022/5/31 ver.2
 * @changes
 * added: 
 * changed: 
 * 
 */

public class Stores {
	//助教提供的商家資訊的規格定義
	
	private String account; //帳號
	private String password; //密碼
	private String email; //email
	private int discount_threshold; //滿額x元後可得到折扣
	private int discount_amount; //滿額後得到的折扣金額
	
	private boolean receiveOrNot = true;// 是否要接訂單
	
	//店家其他資訊（提供json檔）
	
	private static JSONObject info;	//  New: info contains all the data of the store
	private String name;
	private Position position;
	private String phone;
	private String store_description;
	private String order_description;
	// private String[] type;
	private Queue<String> type;
	// private Items[] itemList; //商品清單, retrieves one dish from menu
	private Queue<Items> itemList;
	private JSONObject businessTime; //營業時間
	
	// private Orders[] orderList; // 訂單的list
	private Queue<Orders> orderList = new LinkedList<Orders>();
	// private Orders[] historyOrders; // 歷史訂單的list
	private Queue<Orders> historyOrders = new LinkedList<Orders>();
	
	// constructor
	
	public Stores(int index) {
		this.info = Stores.Loader(index);  
		this.name = Stores.setName();
		this.position = Stores.setPosition();	// no problem writing here
		this.phone = Stores.setPhone();			// problem
		this.store_description = Stores.setStoreDescription();
		this.order_description = Stores.setOrderDescription();
		this.type = Stores.setType();			// problem
		this.itemList = Stores.setItemList();	// problem
		this.businessTime = Stores.setBusinessTime();
		
	}
	
	//getters
	public String getAccount() {
		return account;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public int getDiscountThreshold() {
		return discount_threshold;
	}
	public int getDiscountAmount() {
		return discount_amount;
	}
	public String getName() {
		return name;
	}
	public Position getPosition() {
		System.out.println("----------- this is the position ------------");
		System.out.println("address: "+this.position.getAddress());
		System.out.println("latitude: "+this.position.getLatitude());
		System.out.println("longitude: "+this.position.getLongtitude());
		return this.position;
	}
	public String getPhone() {
		return phone;
	}
	public String getStoreDescription() {
		return store_description;
	}
	public String getOrderDescription() {
		return order_description;
	}
	public Queue<String> getType() {
		System.out.println("----------- this is the type ------------");
		for(String q : this.type){
            System.out.println(q);
        }
		return this.type;
	    
	}
	public Queue<Items> getItemList() {
		System.out.println("----------- this is the menu ------------");
		for(Items i : this.itemList){
			System.out.println("price: " + i.getPrice());
			System.out.println("name: " + i.getName());
        }
		return this.itemList;
	}
	public JSONObject getBusinessTime() {
		System.out.println("----------- this is buisness time ------------");
		JSONObject copy = this.businessTime;
		// iterate through the json object
		Set<String> set =  new LinkedHashSet<String>();  
		set.add("mon");
		set.add("tue");
		set.add("wed");
		set.add("thu");
		set.add("fri");
		set.add("sat");
		set.add("sun");
		Iterator keys = set.iterator();
		while(keys.hasNext()) {
			String str = (String) keys.next();
			System.out.println(str + " :" + copy.get(str));
;		}
		// 
	    return copy;
	}
	public Queue<Orders> getOrderList() {
		Queue<Orders> copy = new LinkedList<Orders>(this.orderList);
		return copy;
	}
	public Queue<Orders> getHistoryOrders() {
		Queue<Orders> copy = new LinkedList<Orders>(this.historyOrders);
		return copy;

	}
	
	
	//setters
	
	// loads specific store data 
	public static JSONObject Loader(int index) {	
		StoreReader stores = new StoreReader("stores_detail.json");
		JSONObject store = (JSONObject) stores.jsonarr.get(index) ;
		return store;		// returns json store
	}
	
	public static String setName() {
		String name = null;
		name = (String) info.get("name");
		return name;
	}
	
	// 
	public static Position setPosition() {
		Position position = new Position();
		JSONObject loc = (JSONObject) info.get("position");
		position.setAddress((String) loc.get("address"));
		position.setLatitude(loc.get("latitude"));
		position.setLongitude(loc.get("longitude"));
		return position;
	}
	// needs work
	
	// get phone number
	public static String setPhone() {
		String phone = null;
		phone = (String) info.get("phone");;
		return phone;
	}
	public static String setStoreDescription() {
		String store_description = null;
		store_description = (String) info.get("store_description");
		return store_description;
	}
	public static String setOrderDescription() {
		String order_description = null;
		order_description = (String) info.get("order_description");;
		return order_description;
	}
	public static Queue<String> setType() {
		JSONArray emparr = (JSONArray) info.get("type");
		int size = emparr.size();
		Queue<String> copy = new LinkedList<String>();
		for(int i = 0; i < size; i++) {
			copy.offer((String) emparr.get(i));
		}

	    return copy;
	}
	
	
	public static Queue<Items> setItemList() {
		JSONArray emparr = (JSONArray) info.get("menu");
		int size = emparr.size();
		Queue<Items> items = new LinkedList<Items>();
		//Items[] items = new Items[size];
	    for (int i = 0; i < size; i++) {
	    	Items item = new Items();
	    	JSONObject obj = (JSONObject) emparr.get(i);
	    	item.setName((String) obj.get("name"));
	    	item.setPrice((String) obj.get("price"));
	    	//items[i] = item;
	    	items.offer(item);
	    }
		return items;
	}
	public static JSONObject setBusinessTime() {
		JSONObject empobj = (JSONObject) info.get("business_time");
	    return empobj;
	}
	
	
	
	public void addOrder(Orders order) throws storeException {
		if(!this.receiveOrNot) {// 店家沒空，接單失敗
			throw new storeException(storeException.exceptionType.ImBusyNow);
		}
		else {// 店家有空，接單成功
			this.orderList.offer(order);
		}
		
		
		
	}
	public Queue<Orders> setHistoryOrders() {
		Queue<Orders> copy = new LinkedList<Orders>(this.historyOrders);
		return copy;
	}
	
	
	
	
}




