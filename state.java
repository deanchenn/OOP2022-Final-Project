/**
 * 
 * Possible current states of the order.
 * 
 * @author 許祐嘉
 * @version ver.0
 * @changes
 * added: 
 * changed: 
 * 
 */
enum state {
	storeChecking, mealMaking, mealDelivering, mealArrived;
	
	/**
	 * @return State of the order.
	 */
	public String getState() {
		switch (this.name()) {
		case "storeChecking":
			return "正在等待商家確認訂單";
		case "mealMaking":
			return "餐點製作中";
		case "mealDelivering":
			return "餐點運送中";
		case "mealArrived":
			return "餐點已抵達";
		default:
			return "unknown state";
		}
	}
	
}