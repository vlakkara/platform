package platform;

import java.util.List;

public class Analytics {
	
	String key;
	
	List<String> number;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<String> getNumber() {
		return number;
	}
	public void setNumbers(List<String> number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Analytics [key=" + key + ", number=" + number + "]";
	}
	
	

}
