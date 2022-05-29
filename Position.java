/**
 * 
 * @author yuhanchiang, deanchenn
 * @version 2022/5/29 ver.1
 * @changes
 * added: 
 * changed: 
 * 
 */
public class Position {
	private String address;
	private double latitude;
	private double longitude;
	
	public String getAddress() {
		return address;
	}
	public double getLatitude() {
		return latitude;
	}
	public double getLongtitude() {
		return longitude;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void setLatitude(Object latitude) {
		this.latitude = Double.parseDouble(latitude.toString());
	}
	public void setLongitude(Object longitude) {
		this.longitude = Double.parseDouble(longitude.toString());
	}
	
	
}
