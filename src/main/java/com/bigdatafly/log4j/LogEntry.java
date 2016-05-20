package com.bigdatafly.log4j;

import java.util.HashMap;
import java.util.Map;

public class LogEntry {

	private Map<String, Object> map = new HashMap<String, Object>();  
    
    public final <VT> void put(String key, VT value) {  
        map.put(key, value);  
    }  
   
    @SuppressWarnings("unchecked")  
    public final <VT> VT get(String key) {  
        return (VT) map.get(key);  
    }  
   
    public final <VT> boolean contains(String key) {  
        return map.containsKey(key);  
    }  
      
    public String toString() {  
        return map.toString();  
    }  
}
