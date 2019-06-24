package utils;

public class Tools {
	
	public static String createUserName() {
		String username = "testuser"+System.currentTimeMillis();
		return username;
	}

}
