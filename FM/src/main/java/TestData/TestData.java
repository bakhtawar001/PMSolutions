package TestData;

import java.util.Date;
import java.util.Random;

public class TestData {
	
	public static String URL="http://www.fmsolutions.tech/newOrganizationUserProfile.sdo";
	static Random Userid= new Random(); 
	static int FMUserId  = Userid.nextInt(500000); 
	public static String userid="userid"+FMUserId;
	public static String SecretCode="fm-solutions-fiver";

}
