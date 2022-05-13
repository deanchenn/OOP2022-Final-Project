
public class Orders {
	private int number;
	enum state{storeChecking, mealMaking, mealDelivering, mealArrived;}
	private state currentState;
	private int amount;
	private String orderTime;
	private String deliverTime;
	private String deliverAddress;
	private String customerName;
	private String deliveryManName;
	private String storeName;
	
	public int getNumber() {
		return number;
	}
	public state getCurrentState() {
		return currentState;
	}
	public int getAmount() {
		return amount;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public String getDeliverTime() {
		return deliverTime;
	}
	public String getDeliverAddress() {
		return deliverAddress;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getDeliveryManName() {
		return deliveryManName;
	}
	public String getStoreName() {
		return storeName;
	}
}
