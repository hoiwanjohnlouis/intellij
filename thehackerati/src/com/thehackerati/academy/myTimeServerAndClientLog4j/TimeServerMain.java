package com.thehackerati.academy.myTimeServerAndClientLog4j;

import java.io.*;
import java.util.Properties;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class TimeServerMain {
    // get a logger instance named "com.company.TimeServer"
    public static Logger logger = Logger.getLogger("com.company.TimeServerMain");

    static {
        // Now set its level. Normally you do not need to set the
        // level of a logger programmatically. This is usually done
        // in configuration files.
        //logger.setLevel(Level.INFO);
    }

    public static void main(String[] args) {
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
            logger.error("No such server properties file exists:\n\t" + pFile.getAbsolutePath());
            shouldExit = true;
        }
        catch (IOException ex2) {
            logger.error("Error in reading server properties file:\n\t" + pfReader);
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
            logger.error("Problem parsing server configuration parameters from properties");
            logger.error(serverProps);
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
            logger.error(ex1);
            logger.error(ex1.getStackTrace());
        }
        catch (Exception exx) {
            logger.error(exx);
            logger.error(exx.getStackTrace());
        }
        finally {
            if (tServer != null) {
                tServer.close();
            }
        }
    }
}
