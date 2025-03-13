package Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configDataProvider {

    private Properties properties;

    public configDataProvider() {
        String projectPath = System.getProperty("user.dir");
        String confFile=projectPath+"/Config/Config.properties";
        try{
            File conf=new File(confFile);
            FileInputStream fileInputStream=new FileInputStream(conf);
            properties=new Properties();
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getPlatformName(){
        return properties.getProperty("platformName");
    }
    public String getudId(){
        return properties.getProperty("udId");
    }
    public String getautomationName(){
        return properties.getProperty("automationName");
    }
    public String getplatformVersion(){
        return properties.getProperty("platformVersion");
    }
    public String getdeviceName(){
        return properties.getProperty("deviceName");
    }
    public String getApp(){
        return properties.getProperty("App");
    }
    public String getURL(){
        return properties.getProperty("URL");
    }

}
