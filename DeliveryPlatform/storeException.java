package application;
/**
 * 
 * @author deanchenn
 * @version 2022/5/31 ver.1
 * @changes
 * added: 
 * changed: 
 * 
 */
public class storeException extends Exception {

	private String errMsg;
	public enum exceptionType {
		ImBusyNow// 店家沒空接單
	}
	storeException(exceptionType ex) {
		switch (ex) {
		case ImBusyNow:
			errMsg = "Store is busy now.";
			break;
		default:
			break;
		}
	}

	public String getErrorMessage() {
		return errMsg;
	}
}
