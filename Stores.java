import java.util.Arrays;

public class Stores {
	//助教提供的商家資訊的規格定義
	
	private String account; //帳號
	private String password; //密碼
	private String email; //email
	private int discount_threshold; //滿額x元後可得到折扣
	private int discount_amount; //滿額後得到的折扣金額
	
	//店家其他資訊（提供json檔）
	
	private String name;
	private Position position;
	private String phone;
	private String store_description;
	private String order_description;
	private String[] type;
	private Items[] itemList; //商品清單
	private String[] businessTime; //營業時間
	
	private Orders[] orderList; // 訂單的list
	private Orders[] historyOrders; // 歷史訂單的list
	
	
	
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
		return position;
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
	public String[] getType() {
	    String[] copy = new String[this.type.length];
	    System.arraycopy(this.type, 0, copy, 0, copy.length);
	    return copy;
	}
	public Items[] getItemList() {
		Items[] copy = new Items[this.itemList.length];
	    System.arraycopy(this.itemList, 0, copy, 0, copy.length);
	    return copy;
	}
	public String[] getBusinessTime() {
		String[] copy = new String[this.businessTime.length];
	    System.arraycopy(this.businessTime, 0, copy, 0, copy.length);
	    return copy;
	}
	public Orders[] getOrderList() {
		Orders[] copy = new Orders[this.orderList.length];
	    System.arraycopy(this.orderList, 0, copy, 0, copy.length);
	    return copy;
	}
	public Orders[] getHistoryOrders() {
		Orders[] copy = new Orders[this.orderList.length];
	    System.arraycopy(this.orderList, 0, copy, 0, copy.length);
	    return copy;
	}
	
	
	//setters
	public void setAccount(String account) {
		this.account = account;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDiscountThreshold(int discount_threshold) {
		this.discount_threshold = discount_threshold;
	}
	public void setDiscountAmount(int discount_amount) {
		this.discount_amount = discount_amount;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setStoreDescription(String store_description) {
		this.store_description = store_description;
	}
	public void setOrderDescription(String order_description) {
		this.order_description = order_description;
	}
	public void setType(String[] type) {
	    this.type = new String[type.length];
	    System.arraycopy(type, 0, this.type, 0, type.length);
	}
	public void setItemList(Items[] itemList) {
	    this.itemList = new Items[itemList.length];
	    System.arraycopy(itemList, 0, this.itemList, 0, itemList.length);
	}
	public void setBusinessTime(String[] businessTime) {
	    this.businessTime = new String[businessTime.length];
	    System.arraycopy(businessTime, 0, this.businessTime, 0, businessTime.length);
	}
	public void setOrderList(Orders[] orderList) {
	    this.orderList = new Orders[orderList.length];
	    System.arraycopy(orderList, 0, this.orderList, 0, orderList.length);
	}
	public void setHistoryOrders(Orders[] historyOrders) {
	    this.historyOrders = new Orders[historyOrders.length];
	    System.arraycopy(historyOrders, 0, this.historyOrders, 0, historyOrders.length);
	}
	
	
}



/*
 * 問題：
 * 1.我們要做的是面向店家的程式對嗎？那如何和助教提供的json一起使用？
 * 2.前端的部分？
 */

