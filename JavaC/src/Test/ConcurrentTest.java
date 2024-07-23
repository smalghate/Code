package Test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.management.RuntimeErrorException;

public class ConcurrentTest {
public static void main(String[] args) {
	/*
	 * ConcurrentMap<String, Object> cache = new ConcurrentHashMap<>();
	 * cache.put("111", new Double(5)); cache.putIfAbsent("111", "LOL");
	 * cache.put("111", new Integer(4)); cache.put("222", new Integer(4));
	 * System.out.println(cache);
	 */
	int result = execute();
	System.out.println(result);
} 
private static int execute() {
	try {
		System.out.println("try");
		throw new RuntimeException();
	}catch (Exception e) {
		System.out.println("catch");
		return 0;
	}finally {
		System.out.println("finally");
	}
	
}
}
