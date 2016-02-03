package com.thehackerati.academy.myTimeServerAndClientLog4j;

import java.io.*;
import java.util.Properties;

public class TimeClientMain {

    public static void main(String[] args) {
        // write your code here
        FileReader propsFileReader = null;
        File pFile = null;
        BufferedReader pfReader = null;
        Properties clientProps = new Properties();

        boolean shouldExit = false;

        // load properties for client configuration
        try
        {
            pFile = new File("client.properties");
            propsFileReader = new FileReader(pFile);
            pfReader = new BufferedReader(propsFileReader);
            clientProps.load(pfReader);
            clientProps.list(System.out);
        }
        catch (FileNotFoundException ex1) {
            System.err.println("No such client properties file exists:\n\t" + pFile.getAbsolutePath());
            shouldExit = true;
        }
        catch (IOException ex2) {
            System.err.println("Error in reading client properties file:\n\t" + pfReader);
            shouldExit = true;
        }
        finally {
            if (shouldExit) {
                return;
            }
        }
        int port = 0; // pick a port above 1024 (<1024 need root access)
        int backlog = 0; // socket queue length
        String serverHost = null;

        // load in client configuration properties from file
        shouldExit = false;
        try {
            port = Integer.parseInt(clientProps.getProperty("port"));
            serverHost = clientProps.getProperty("host");
        }
        catch (NumberFormatException ex1) {
            System.err.println("Problem parsing client configuration parameters from properties");
            clientProps.list(System.err);
            shouldExit = true;
        }
        finally {
            if (shouldExit) {
                return;
            }
        }

        // run
        TimeClient tClient = null;
        try {
            tClient = new TimeClient("myTimeClient", serverHost, port);
            tClient.runClient();
        }
        catch (Exception ex2) {
            System.err.println(ex2);
        }
        finally {
            if (tClient != null) {
            }
        }
    }
}
