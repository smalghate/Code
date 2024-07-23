package Test;


public class TestClass {

	public static void main(String[] args) {
		String javaVersion = System.getProperty("java.version");
        System.out.println("Java version: " + javaVersion);
        
        String javaVersion1 = System.getProperty("java.home");
        System.out.println("Java version: " + javaVersion1);
        
        String javaVersion2 = System.getProperty("java.class.path");
        System.out.println("Java version: " + javaVersion2);
        
        	
        
        Runtime.Version j = Runtime.version();
        System.out.println("Java Runtime Environment version: " + j);
	}

}
