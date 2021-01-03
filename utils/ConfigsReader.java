package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
    static Properties prop;

    /**
     *
     * @param filePath
     */

    public static Properties readProperties(String filePath){

        try{
            FileInputStream fis=new FileInputStream(filePath);
            prop=new Properties();
            prop.load(fis);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;

    }

    /**
     * T              HIS METHOD RETRIEVES SINGLE VALUE BASED ON THE SPECIFIED KEY
     * @param key
     * @return
     */

    public static String getPropertyValue(String key){
        return prop.getProperty(key);
    }

}
