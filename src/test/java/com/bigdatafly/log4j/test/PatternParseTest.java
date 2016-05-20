package com.bigdatafly.log4j.test;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.PropertyConfigurator;

import com.bigdatafly.log4j.LogEntry;
import com.bigdatafly.log4j.LogFileParser;
import com.bigdatafly.log4j.utils.RegexUtils;

public class PatternParseTest {

	static void test(String s,String pattern){
		Pattern p = Pattern.compile(pattern);  
	    Matcher m = p.matcher(s);  
	    
	    System.out.println(m.start());
    }
	
	public static void main(String[] args) throws Exception {
		
		LogFileParser logParser = new LogFileParser();
	    String conversionPattern = "%d{yyyy-MM-dd HH:mm:ss,SSS} %p %c - %m%n";
		List<LogEntry> entries = logParser.parse("E:\\basics-merchant-service_20160514_091006\\catalina.out",conversionPattern , "", 100, 1);
		
		System.out.println(entries);
	}

}
