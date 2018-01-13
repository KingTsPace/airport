package com.pinker.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtil {

    private static ComboPooledDataSource dataSource;

    static {

        dataSource= new ComboPooledDataSource("c3p0");

    }

    public static Connection getConn(){

        Connection connection=null;

        try {
            connection=dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }


    public static void close(Connection connection){

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
