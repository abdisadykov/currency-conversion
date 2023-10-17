package com.abdisadykov.currencyconversion.service;

import com.abdisadykov.currencyconversion.dao.CurrencyDao;
import com.abdisadykov.currencyconversion.dao.DaoFactory;
import com.abdisadykov.currencyconversion.dao.impl.CurrencyDaoImpl;
import com.abdisadykov.currencyconversion.model.Currency;

import java.sql.SQLException;

public class CurrencyService {

    DaoFactory daoFactory = new DaoFactory();
    private final CurrencyDao currencyDao = daoFactory.getCurrencyDao();

    public CurrencyService() throws ClassNotFoundException, SQLException {
    }


    public void createCurrency(Currency currency) throws SQLException {
        currencyDao.createCurrency(currency);
    }
}
