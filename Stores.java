
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
		return type;
	}
	public Items[] getItemList() {
		return itemList;
	}
	public String[] getBusinessTime() {
		return businessTime;
	}
	public Orders[] getOrderList() {
		return orderList;
	}
	public Orders[] getHistoryOrders() {
		return historyOrders;
	}
}

/*
 * 問題：
 * 1.我們要做的是面向店家的程式對嗎？那如何和助教提供的json一起使用？
 * 2.前端的部分？
 */

