/**
 * 
 */
package com.bigdatafly.log4j;

import java.util.Map;

import org.apache.log4j.Appender;
import org.apache.log4j.Layout;
import org.apache.log4j.PatternLayout;

/**
 * @author summer
 *
 */
public class ConversionPatternParser {

	private Map<String, Appender> appenderBag;  
    public static String CONVERSION_JUST_4TEST = "%d [] %-5p %c{2} - %m%n";  
  
    public ConversionPatternParser() {}  
  
    public void parseConfiguration(String configFilePath) throws Exception {  
        AppenderParser config = new AppenderParser();  
        config.parse(configFilePath);  
        setAppenderBag(config.getAppenderBag());  
    }  
  
    public String getConversionPattern(Appender appender) {  
        Layout layout = appender.getLayout();  
        if (layout instanceof PatternLayout) {  
            PatternLayout patternLayout = (PatternLayout) layout;  
            return patternLayout.getConversionPattern();  
        }  
        return null;  
    }  
  
    public void setAppenderBag(Map<String, Appender> appenderBag) {  
        this.appenderBag = appenderBag;  
    }  
  
    public Map<String, Appender> getAppenderBag() {  
        return appenderBag;  
    }  
}
