package com.thehackerati.academy.myTimeServerAndClientProperties;

import java.io.*;
import java.util.Properties;

public class TimeServerMain {

    public static void main(String[] args) {
	// write your code here

        //Properties p = System.getProperties();
        //p.list(System.out);

        FileReader propsFileReader = null;
        File pFile = null;
        BufferedReader pfReader = null;
        Properties serverProps = new Properties();

        boolean shouldExit = false;
        // load properties for server configuration
        try
        {
            pFile = new File("server.properties");
            propsFileReader = new FileReader(pFile);
            pfReader = new BufferedReader(propsFileReader);
            serverProps.load(pfReader);
            serverProps.list(System.out);
        }
        catch (FileNotFoundException ex1) {
            System.err.println("No such server properties file exists:\n\t" + pFile.getAbsolutePath());
            shouldExit = true;
        }
        catch (IOException ex2) {
            System.err.println("Error in reading server properties file:\n\t" + pfReader);
            shouldExit = true;
        }
        finally {
            if (shouldExit) {
                return;
            }
        }


        //int port = 1971; // pick a port above 1024 (<1024 need root access)
        //int backlog = 100; // socket queue length

        int port = 0;
        int backlog = 0;

        // load in server configuration properties from file
        try {
            port = Integer.parseInt(serverProps.getProperty("port"));
            backlog = Integer.parseInt(serverProps.getProperty("backlog"));
        }
        catch (NumberFormatException ex1) {
            System.err.println("Problem parsing server configuration parameters from properties");
            serverProps.list(System.err);
            return;
        }

        TimeServer tServer = null;

        try {
            tServer = new TimeServer("myTimeServer",port, backlog);
            while (true) {
                tServer.processServerQueue();
            }
        }
        catch (IOException ex1) {
            System.err.println(ex1);
        }
        catch (Exception exx) {

        }
        finally {
            if (tServer != null) {
                tServer.close();
            }
        }
    }
}