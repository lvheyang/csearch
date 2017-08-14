package com.lvheyang.csearch;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class Main {

  public static void main(String[] args) {
    try {
      InputStream in = Main.class.getClassLoader().getResourceAsStream("csearch.properties");
      Properties properties = new Properties();
      properties.load(in);
      in.close();

      Enumeration enuKeys = properties.keys();
      while (enuKeys.hasMoreElements()) {
        String key = (String) enuKeys.nextElement();
        String value = properties.getProperty(key);
        System.out.println(key + ": " + value);
      }
    } catch (FileNotFoundException e) {
      System.out.println("resource file not found ");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
