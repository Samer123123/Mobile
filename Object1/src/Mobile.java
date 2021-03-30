
public class Mobile {

	String charge ="Micro usb" ;
	String [] controls = {"power" , "volume" ,"touck"};
	String color = "black";
	String type ="HUAWEI";
	
    static boolean power = false;
    
    static int volume = 0 ;
    
    static int touck = 1;
    
    public static void poweron() {
    	power = true ;
    }
    public static void poweroff() {
    	power = false ;
    }
    
    public static void volumeup() {
    	volume ++ ;
    }
    
    public static void volumedown() {
    	volume -- ;
    }
    public static void  touckon() {
    	touck ++;
    	
	}
    public static void touckoff() {
    	touck --;
    }
}
