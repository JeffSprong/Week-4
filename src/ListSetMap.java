import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSetMap {

	public static void main(String[] args) {
	
	List<String> employeeNames = new ArrayList<String> ();
	employeeNames.add("Jim");
	employeeNames.add("Sally");
	employeeNames.add("Michael");
	employeeNames.add("Tommy");
	employeeNames.add("Ryan");
	
	Set<Integer> ids = new HashSet<Integer> ();
	ids.add(500);
	ids.add(501);
	ids.add(502);
	ids.add(503);
	ids.add(504);
	
	Map<Integer, String> employeeMap = new HashMap<Integer, String> ();
	
	int i=0;
	for (int id : ids) {
	employeeMap.put(id, employeeNames.get(i++));
	}
	
	for (int key : employeeMap.keySet()) {
	System.out.println(key + " " + employeeMap.get(key));
	}
	
	StringBuilder idsBuilder = new StringBuilder ();
	for (int number : ids) {
	idsBuilder.append(number + "-");
	}
	
	System.out.println(idsBuilder.toString());
	
		
	StringBuilder namesBuilder = new StringBuilder ();
	for (String names : employeeNames) {
	namesBuilder.append(names + " ");
	}
	
    System.out.println(namesBuilder.toString());
	
}
	}
	

	
		
	


