package q3;

public class validitychecker {
	public validitychecker() {
		
	}
	
	public static boolean checking(String name , String email ,String password ) {
		 return (name.equalsIgnoreCase("yash") && email.equalsIgnoreCase("yashwanth21@gmail.com") &&  password.equalsIgnoreCase("yash@123"));

}
}