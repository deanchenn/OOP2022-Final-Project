import java.util.LinkedList;
import java.util.Queue;

/**
 * This is the Delivery Man class for OOP Final Project.
 * 
 * @author 許祐嘉,deanchenn
 * @version 2022/5/29 ver.1
 * @changes
 * added: 
 * changed: 將currentOrder（目前訂單）從單一訂單改成一個可存複數訂單的Queue
 * 			我把IsOrderArrived（是否送達訂單）相關的method先comment掉，是否應該改成用Orders class中的state來紀錄較合理？
 * 
 */
public class DeliveryMan {
	
	private int phoneNumber;// 外送員的電話號碼
	private String deliveryManName;// 外送員的姓名
	private boolean receiveOrNot = true;// 是否要接訂單
	private Queue<Orders> currentOrder;// 目前訂單
	private boolean isOrderArrived = false;// 是否送達訂單
	
	/**
	 * Constructor
	 * 
	 * @param phoneNumber     - 外送員的電話號碼
	 * @param deliveryManName - 外送員姓名
	 */
	public DeliveryMan(String account, String password, int phoneNumber, String emailAccount, String deliveryManName,
			Queue<Orders> orders) {
		this.phoneNumber = phoneNumber;
		this.deliveryManName = deliveryManName;
		this.currentOrder = orders;
	}
	// get set
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setDeliveryManName(String deliveryManName) {
		this.deliveryManName = deliveryManName;
	}
	
	public String getDeliveryManName() {
		return deliveryManName;
	}
	
	/**
	 * @param order - Order constructed by store(or customer?).
	 * @throws deliveryManException If delivery man is not able to receive the
	 *                              order.
	 */
	public void setOrder(Queue<Orders> order) throws deliveryManException {
		if (!receiveOrNot) { // 外送員沒空->接單失敗
			throw new deliveryManException(deliveryManException.exceptionType.ImBusyNow);
		} else { // 外送員有空 ->接單成功
			this.currentOrder = new LinkedList<Orders>(order);
		}
		
	}
	
	public Queue<Orders> getOrder() {
		Queue<Orders> copy = new LinkedList<Orders>(this.currentOrder);
		return copy;
	}
	
//	/**
//	 * @param isOrderArrived - {@code true} if the meal arrives, {@code false}
//	 *                       otherwise.
//	 */
//	public void setIsOrderArrived(boolean isOrderArrived) {
//		this.isOrderArrived = isOrderArrived;
//		if (isOrderArrived) {
//			this.currentOrder.setCurrentState(state.mealArrived);
//		} else {
//			this.currentOrder.setCurrentState(state.mealDelivering);
//		}
//	}
//	
//	public boolean getIsOrderArrived() {
//		return this.isOrderArrived;
//	}
	
	/**
	 * 
	 * 查看歷史訂單
	 * 
	 * @param store - Object in the type of Class Stores
	 * @return History order list of the store.
	 */
	public Queue<Orders> getOrderList(Stores store) {
		Queue<Orders> copy = new LinkedList<Orders>(store.getOrderList());
		return copy;
	}
}