package com.dmxiaoshen.common.utils;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.util.HashMap;
import java.util.Map;

/**
 * 通过读取本地配置文件获取配置项
 * @author hushengen
 *
 */
public class ConfigPropertiesUtils {
	private static ConfigPropertiesUtils instance = new ConfigPropertiesUtils();

	private static Map<String, Object> configMap = new HashMap<String, Object>();

	private ConfigPropertiesUtils() {
	}

	/**
	 * 获取内容
	 * 
	 * @param configFile
	 * @param property
	 * @param defaultValue
	 * @return
	 */
	public static String get(String configFile, String property,String...defaultValue) {
		if (!configMap.containsKey(configFile)) {
			instance.initConfig(configFile);
		}
		PropertiesConfiguration config = (PropertiesConfiguration) configMap.get(configFile);
		String value = config.getString(property);
		
		if(value==null && defaultValue.length>0){
			value = defaultValue[0];
		}
		return value;
	}

	/**
	 * 载入配置文件，初始化后加入map
	 * 
	 * @param configFile
	 */
	private synchronized void initConfig(String configFile) {
		try {
			PropertiesConfiguration config = new PropertiesConfiguration(configFile);
			configMap.put(configFile, config);

		} catch (ConfigurationException e) {
			throw new RuntimeException("init configFile error!",e);
		}
	}
}