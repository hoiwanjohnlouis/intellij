/***************************************************************************
 * Copyright (c) 2016 HW Tech Services, LLC
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package com.robmarano.timeserverandclientproperties;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by computerlab on 9/20/14.
 */
public class TimeClient {
    ObjectOutputStream m_output;
    ObjectInputStream m_input;
    int m_port;
    String m_clientName;
    String m_timeServerHost;
    Socket m_clientSocket;

    public TimeClient(String name, String host, int port) {
        m_clientName = name;
        m_timeServerHost = host;
        m_port = port;
    }

    public void runClient() {
        System.out.println(m_clientName+": Processing service");
        // connect to server; get streams; process connection
        try {
            connectToServer(); // create Socket to make connection
            getStreams(); // get input and output streams
            processConnection(); // process connection
        }
        catch (ConnectException ex0) {
            System.err.println(m_clientName+": Trying to connect to server; Received exception.\n"+ex0+"\n");
            ex0.printStackTrace(System.err);
        }
        catch (IOException ex1) {
            System.err.println(m_clientName+": Trying to connect to server; Received exception.\n"+ex1+"\n");
            ex1.printStackTrace(System.err);
        }
        finally {
            closeConnection();
        }
    }

    public void connectToServer() throws IOException {
        System.out.println(m_clientName+": Connecting to server");
        m_clientSocket = new Socket(InetAddress.getByName(m_timeServerHost), m_port);
    }

    public void getStreams() throws IOException {
        System.out.println(m_clientName+": Getting streams");
        m_output = new ObjectOutputStream(m_clientSocket.getOutputStream());
        m_output.flush(); // flush output buffer to send header info

        // set up input stream for objects
        m_input = new ObjectInputStream(m_clientSocket.getInputStream());
    }

    public void processConnection() throws IOException {
        System.out.println(m_clientName+": Processing connection");

        String message = TimeServer.TERMINATION_CLAUSE;
        do // process messages sent from server
        {
            try {
                message = (String) m_input.readObject(); // read new message
                if (!message.equals(TimeServer.TERMINATION_CLAUSE)) {
                    System.out.println(m_clientName+": TIMESTAMP = "+message);
                }
            }
            catch (ClassNotFoundException ex1) {
                System.err.println(m_clientName+": Trying to read a message from server; Received exception.\n"+ex1+"\n");
                ex1.printStackTrace(System.err);
            }
            catch (IOException ex2) {
                System.err.println(m_clientName+": Trying to read a message from server; Received exception.\n"+ex2+"\n");
                ex2.printStackTrace(System.err);
            }
        } while (! message.equals(TimeServer.TERMINATION_CLAUSE));
    }

    public void closeConnection() {
        System.out.println(m_clientName+": Terminating connection");
        try {
            m_output.close();
            m_input.close();
            m_clientSocket.close();
        }
        catch (StreamCorruptedException ex2) {
            System.err.println(m_clientName+": Trying to close server connection; Received exception.\n"+ex2+"\n");
            ex2.printStackTrace(System.err);
        }
        catch (IOException ex1) {
            System.err.println(m_clientName+": Trying to close server connection; Received exception.\n"+ex1+"\n");
            ex1.printStackTrace(System.err);
        }
    }
}
