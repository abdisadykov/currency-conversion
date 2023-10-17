package com.abdisadykov.currencyconversion.dao;

import com.abdisadykov.currencyconversion.dao.impl.CurrencyDaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DaoFactory {
    private final Connection connection;

    public DaoFactory() throws SQLException, ClassNotFoundException {
        connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/conversion?" +
                        "user=postgres&password=dias2002&ssl=true");
        Class.forName("org.postgresql.Driver");
    }


    public CurrencyDao getCurrencyDao() {
        return new CurrencyDaoImpl(connection);
    }
}
