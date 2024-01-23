package hash_map_concept;

import java.util.HashMap; 
import java.util.Map;

public class HashMapConcept {
public static void main(String[] args) {
	HashMap<String,Integer>hm=new HashMap<>();
	System.out.println(hm.size());
	System.out.println(hm);
	// for inserting and updating in the hashmap
	hm.put("Ramnagar",80);
	hm.put("Harinagar",95);
	hm.put("prity",2022);
	hm.put("hasan",23);
	hm.put("babu", 33);
	System.out.println(hm.size());
	System.out.println(hm);
	//for fetching the record from the hash map
	System.out.println(hm.get("prity"));
	// for serching the record in the hashmap
	if(hm.containsKey("prity")) {
		System.out.println("true");
	    System.out.println(hm.get("prity"));
		
	}
	else {
		System.out.println("not present");
	}
	
	//update the value in hashmap
	hm.put("babu", 2023);
	hm.get("babu");
	System.out.println(hm);
	
	//remove the key in hashmap
	
	int remove_value=hm.remove("prity");
	System.out.println(remove_value);
	System.out.println(hm);

		//iterate the hashmap 
	for(Map.Entry<String,Integer> entry : hm.entrySet()){
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
	
	
	//iterate using stream
	hm.forEach((k,v)-> System.out.println(k+" "+v) );

}

}


