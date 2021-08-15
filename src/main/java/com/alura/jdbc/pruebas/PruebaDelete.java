package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaDelete {

    public static void main(String[] args) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection con = factory.recuperaConexion();

        Statement statement = con.createStatement();

        statement.execute("DELETE FROM PRODUCTO WHERE ID = 10");

        int updateCount = statement.getUpdateCount();

        System.out.println(String.format("%d registros eliminados", updateCount));

        con.close();
    }

}
