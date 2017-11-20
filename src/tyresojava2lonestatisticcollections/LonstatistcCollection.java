
package tyresojava2lonestatisticcollections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LonstatistcCollection {
    
    public static void main(String[] args) {
        
     Map<String,Integer> list = new HashMap<String,Integer>();
 
   System.out.println("Lonestatic baserad pa Sektor: ");
    list.put("Samtliga sektorer ", 41800);
    list.put("Statlig sektor ", 38600);
    list.put("Kommunal sektor ", 36000);
    list.put("Landstigssektor ", 37600);
    list.put("Privat sektor ", 42300);
    list.put("Privatanstalda tjanstaman ", 42300);
    
   System.out.println("Visar hela listan på skärmen och beräknar genomsnittslöner");       
     int sum = 0;  
     for (Map.Entry<String, Integer> l : list.entrySet()) {
          String key = l.getKey();
            System.out.println(key + ", " + l.getValue());
                    sum +=  l.getValue(); 
		}
    System.out.println("\nGenomsnittslöner är: " + sum / list.size());
                
 
System.out.println("Sorterar löner i stigande ordning");               
List<Map.Entry<String, Integer>> newlist = new LinkedList<>(list.entrySet());             
Collections.sort(newlist, new Comparator<Map.Entry<String, Integer>>() {
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
	return (o1.getValue()).compareTo(o2.getValue());
    }
});
 
  System.out.println("\nSort with LinkedList "+list);               
  System.out.println("\nI stigande ordning: ");
		Map<String, Integer> result = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : newlist) {
			result.put(entry.getKey(), entry.getValue()); 
		}
		for (Map.Entry<String, Integer> l : result.entrySet()) {
				System.out.println(l);	
                }   
                
   
                
  System.out.println("\nSektorerna som tjänar mera än 40000 kr: " );
         for (Map.Entry<String, Integer> l : result.entrySet()) {
                 if(l.getValue()>40000)
	System.out.println(l);                              
                                
	}          
    }
}

