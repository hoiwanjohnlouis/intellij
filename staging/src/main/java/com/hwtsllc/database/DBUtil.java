package com.hwtsllc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    /*
    *  todo: put these values into a properties file
    */
    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "dbpassword";
    private static final String HSQLDB_CONN_STRING = "jdbc:hsqldb:data/explorecalifornia";
    private static final String MARIADB_CONN_STRING = "jdbc:mariadb://localhost/explorecalifornia";
    // private static final String MYSQL_CONN_STRING = "jdbc:mysql://localhost/explorecalifornia";
    private static final String POSTGRESQL_CONN_STRING = "jdbc:postgres://localhost/explorecalifornia";

    public static Connection getConnection( DBType dbType) throws SQLException {

        switch (dbType) {
            case HSQLDB:
                return DriverManager.getConnection( HSQLDB_CONN_STRING, USERNAME, PASSWORD );
            case MARIADB:
                return DriverManager.getConnection( MARIADB_CONN_STRING, USERNAME, PASSWORD );
//            case MYSQL:
//                return DriverManager.getConnection( MYSQL_CONN_STRING, USERNAME, PASSWORD );
            case POSTGRESQL:
                return DriverManager.getConnection( POSTGRESQL_CONN_STRING, USERNAME, PASSWORD );
            default:
                return null;
        }

    }

    /**
     *
     * @param args      none at this time
     */
    public static void main( String[] args ) {
        System.out.println("DBUtil");
    }
}
