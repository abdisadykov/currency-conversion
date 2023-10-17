package com.abdisadykov.currencyconversion.dao;

import com.abdisadykov.currencyconversion.model.Currency;

import java.sql.SQLException;
import java.util.List;

public interface CurrencyDao {
    void createCurrency(Currency currency) throws SQLException;
    Currency getCurrencyById(int id);
    List<Currency> getAllCurrencies();
    void updateCurrency(Currency currency);
    void deleteCurrency(int id);


}
