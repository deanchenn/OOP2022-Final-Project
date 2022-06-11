package application;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author 許祐嘉, deanchenn
 * @version 2022/5/29 ver.1
 * @changes
 * added: storeAddress店家位置
 * changed: 將itemList（餐點）改寫成Queue的存法
 * 
 */
public class Orders {
	private int number;// 訂單編號
	private Queue<Items> itemList;//餐點
	
	private state currentState;// 訂單狀態
	
	private int amount;// 訂單金額
	private String orderTime;// 下單時間
	private String deliverTime;// 送達時間
	private String deliverAddress;// 配送位置
	private String storeAddress;// 店家位置
	private String customerName;// 消費者姓名
	private String deliveryManName;// 外送員名字
	private String storeName;// 店家名字
	
	// Constructor
	/**
	 * 
	 * @param number          - 訂單編號
	 * @param items           - 訂單內容
	 * @param orderTime       - 下單時間
	 * @param deliverTime     - 送達時間
	 * @param deliverAddress  - 配送位置
	 * @param customerName    - 消費者名字
	 * @param deliveryManName - 外送員名字
	 * @param store           - 店家資訊
	 */
	public Orders(int number, Queue<Items> itemList, String orderTime, String deliverTime, String deliverAddress, String storeAddress,
			String customerName, String deliveryManName, Stores store) {
		this.number = number;
		this.itemList = itemList;
		this.orderTime = orderTime;
		this.deliverAddress = deliverAddress;
		this.storeAddress = storeAddress;
		this.customerName = customerName;
		this.deliveryManName = deliveryManName;
		this.storeName = store.getName();
	}
	
	// get set
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Queue<Items> getItemList() {
		return itemList;
	}
	
	public void setItems(Queue<Items> itemList) {
		this.itemList = new LinkedList<Items>(itemList);
	}
	
	public String getCurrentState() {
		return currentState.getState();
	}
	
	public void setCurrentState(state currentState) {
		this.currentState = currentState;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getOrderTime() {
		return orderTime;
	}
	
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	
	public String getDeliverTime() {
		return deliverTime;
	}
	
	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}
	
	public String getDeliverAddress() {
		return deliverAddress;
	}
	
	public void setDeliverAddress(String deliverAddress) {
		this.deliverAddress = deliverAddress;
	}
	
	public String getStoreAddress() {
		return storeAddress;
	}
	
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getDeliveryManName() {
		return deliveryManName;
	}
	
	public void setDeliveryManName(String deliveryManName) {
		this.deliveryManName = deliveryManName;
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	public void setStoreName(Stores store) {
		this.storeName = store.getName();
	}
	
}