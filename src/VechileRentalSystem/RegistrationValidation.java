package VechileRentalSystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationValidation {
	
	    private static final String NAME_PATTERN = "^[a-zA-Z]+$";
	    
	    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
	

	    private static Pattern pattern;
	    private static Matcher matcher;

	    public static boolean validateName(String name) {
	        pattern = Pattern.compile(NAME_PATTERN);
	        matcher = pattern.matcher(name);
	        return matcher.matches();
	    }

	   
	    public static boolean validateEmail(String email) {
	        pattern = Pattern.compile(EMAIL_PATTERN);
	        matcher = pattern.matcher(email);
	        return matcher.matches();
	    }

	    public static boolean validatePassword(String passwordString) {
	        pattern = Pattern.compile(PASSWORD_PATTERN);
	        matcher = pattern.matcher(passwordString);
	        return matcher.matches();
	    }

	    public static boolean validateConfirmPassword(String password, String confirmPassword) {
	        return password.equals(confirmPassword);
	    }

	    public static boolean validatePhoneNumber(String phoneNumber) {
	        if (phoneNumber == null || phoneNumber.length() != 10) {
	            return false;
	        }
	        if (phoneNumber.charAt(0) != '9') {
	            return false;
	        }
	        return true;
	    }

	}



