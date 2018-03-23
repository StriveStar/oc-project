package com.online.ocCommon.util;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesUtil {

    private static Map<String, Properties> propMap = new HashMap<>();

    public static final String DEFAULT_PROPERTIES_FILE = "application.yml";

    public static Object getProperty(String file, String key){
        Properties prop = getProperties(file);
        if (prop != null && prop.get(key) != null) {
            return prop.get(key);
        }
        return null;
    }

    private static Properties getProperties(String file) {
        if (propMap.get(file) != null) {
            Properties prop = new Properties();
            try {
                prop.load(Properties.class.getClassLoader().getResourceAsStream(file));
                propMap.put(file, prop);
                return prop;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void updateProperties(Properties prop, String filePath){
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            URI fileUri = PropertiesUtil.class.getClassLoader().getResource(filePath).toURI();
            File file = new File(fileUri);

            Properties tmpProp = new Properties();
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            tmpProp.load(bis);

            FileOutputStream fos = new FileOutputStream(file);
            for (Object key : prop.keySet()) {
                tmpProp.setProperty(String.valueOf(key), String.valueOf(prop.get(key)));
            }
            //
            tmpProp.store(fos, null);
            fis.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
