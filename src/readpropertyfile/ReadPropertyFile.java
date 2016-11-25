/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readpropertyfile;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;

/**
 *
 * @author Brenda
 */
public class ReadPropertyFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            Properties pro = new Properties();
            FileInputStream in = new FileInputStream("C:\\Users\\gaby\\Documents\\NetBeansProjects\\ReadPropertyFile\\src\\newfile");
            pro.load(in);
            // getting values from property file
            String name = pro.getProperty("Name");
            String portal = pro.getProperty("Portal");
            String message = pro.getProperty("Message");

            // Printing Values fetched
            System.out.println(name);
            System.out.println(portal);
            System.out.println(message);

        } catch (IOException e) {
            System.out.println("Error is:" + e.getMessage());
            e.printStackTrace();
        }

}

    
}
