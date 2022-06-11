package application;
/**
 * 
 * Exception of DeliveryMan.
 * 
 * @author 許祐嘉
 * @version ver.0
 * @changes
 * added: 
 * changed: 
 * 
 */
public class deliveryManException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private String errMsg;
	
	public enum exceptionType {
		ImBusyNow// 還有什麼例外情況?
	}
	
	/**
	 * @param ex - Exception that is sended from {@code DeliveryMan}.
	 */
	deliveryManException(exceptionType ex) {
		switch (ex) {
		case ImBusyNow:
			errMsg = "Delivery Man is busy now.";
			break;
		default:
			break;
		}
	}
	
	/**
	 * @return Error message of certain exception.
	 */
	public String getErrorMessage() {
		return errMsg;
	}
}