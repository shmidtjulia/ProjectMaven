package libs;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
* That class provides static methods for getting values from Config...
*/
public class ConfigData {
    public static String cfgFile="src/config.properties";
    //public static String uiMappingFile = "src/UIMapping.properties";

/*
 * Return value from.properties file
 */

    public static String getValueFromFile(String key, String fileName) throws IOException{
        Properties p = new Properties();
        //Create stream for reading from file
        FileInputStream cfg = new FileInputStream(fileName);
        p.load(cfg);
        cfg.close();

        //Return value for the property
        return (p.getProperty(key));
    }
    /*
     * Return value from UI mapping file.
     * Note, please, that returned value is String.
     * We should take care of value`s type by himself when will use ...
     */

    //public static String getUiMappingValue (String key) throws IOException{
    //    return (getValueFromFile(key, uiMappingFile));
    //}

    /*
     * Return value from UI mapping file.
     * Note, please, that returned value is String.
     * We should take care of value`s type by himself when will use ...
     */

    public static String getCfgValue (String key) throws IOException{
        return (getValueFromFile(key, cfgFile));
    }

}