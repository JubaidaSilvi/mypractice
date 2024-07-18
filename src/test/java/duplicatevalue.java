import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class duplicatevalue {
	@Test 
	public void duplicatevalue1() {
		String mycourse[]= {"java","cucumber","cucumber"};
		
		Set<String> course= new HashSet<String>();
		
		for(String name:mycourse) 
		if (course.add(name)== false) {
			System.out.println("duplicate valueis" + name);
		}
	}

}
