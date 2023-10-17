package com.abdisadykov.currencyconversion.dao.impl;

import com.abdisadykov.currencyconversion.dao.CurrencyDao;
import com.abdisadykov.currencyconversion.model.Currency;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CurrencyDaoImpl implements CurrencyDao {

    private final Connection connection;

    public CurrencyDaoImpl(Connection connection)  {
        this.connection = connection;
    }

    @Override
    public void createCurrency(Currency currency) throws SQLException {
        String sql = "INSERT INTO currencies (code, full_name, sign) VALUES (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, currency.getCode());
        statement.setString(2, currency.getFullName());
        statement.setString(3, currency.getSign());
        statement.executeUpdate();
    }

    @Override
    public Currency getCurrencyById(int id) {
        return null;
    }

    @Override
    public List<Currency> getAllCurrencies() {
        return null;
    }

    @Override
    public void updateCurrency(Currency currency) {

    }

    @Override
    public void deleteCurrency(int id) {

    }
}
