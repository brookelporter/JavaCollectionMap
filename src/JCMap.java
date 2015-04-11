	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Set;
	
public class JCMap {
	
	    public static void main(String[] args) {

	        Map google = new HashMap();
	        
	        google.put(new Integer(1), "John Smith");
	        google.put(new Integer(6), "Sally Fields");
	        google.put(new Integer(2), "Crazy Lady");
	        google.put(new Integer(8), "Hobo Joe");
	        google.put(new Integer(3), "Suzy Smith");
	        google.put(new Integer(4), "Elton John");
	       

	        Set st = google.entrySet();

	        Iterator it = st.iterator();

	        while (it.hasNext()) {

	            Map.Entry me = (Map.Entry) it.next();

	            int password = (Integer) me.getKey();

	            String output = (String) me.getValue();
	            System.out.println("Key #" + password + ':' + "  Value= " + output);

	        }
	    }
	}
