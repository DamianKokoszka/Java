package com.javafee.java.lessons.lesson17.model;

import com.javafee.java.lessons.Main;
import com.javafee.java.lessons.lesson17.controller.Controller;

import java.util.ArrayList;
import java.util.HashMap;

public class Converter {
    //Kursy walut w zl : EUR 4,68zl USD 4,43zl CHF 4,76zl GBP 5,46zl
    //Kursy walut w euro :zl 0,21 USD 0,95 CHF 1,02 GBP 1,16
    //Kursy walut w usd : zl 4,43 Eur 1,05 CHF 1,07 GBP 1,23
    //Kursy walut w chf : zl 0,21 Eur 0,98 USD 0,93 GBP 1,15
    //Kursy walut w gbp : zl 0,18 Eur 0,86 CHF 0,87 USD 0,81


    //    double amount , zl, eur, usd,chf, gbp;
//    public Double covert(double amount, String fromType, String toType) {
    private String name;
    private String shortname;
    private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();

    public Converter(String nameValue, String shortNameValue) {
        this.name = nameValue;
        this.shortname = shortNameValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public HashMap<String, Double> getExchangeValues() {
        return this.exchangeValues;
    }

    public void setExchangeValues(String key, Double value) {
        this.exchangeValues.put(key, value);
    }

    public void defaultValues(String converter) {
        switch (converter) {
//            case "US Dollar":
//                this.exchangeValues.put("USD", 1.00);
//                this.exchangeValues.put("EUR", 1.05);
//                this.exchangeValues.put("CHF", 1.07);
//                this.exchangeValues.put("GBP", 1.23);
//                break;
//            case "Euro":
//                this.exchangeValues.put("USD", 0.95);
//                this.exchangeValues.put("EUR", 1.05);
//                this.exchangeValues.put("CHF", 1.02);
//                this.exchangeValues.put("GBP", 1.16);
//                break;
//            case "CHF":
//                this.exchangeValues.put("USD", 0.93);
//                this.exchangeValues.put("EUR", 0.98);
//                this.exchangeValues.put("CHF", 1.07);
//                this.exchangeValues.put("GBP", 1.15);
//                break;
            case "GBP":
                this.exchangeValues.put("USD", 0.93);
                this.exchangeValues.put("EUR", 0.86);
                this.exchangeValues.put("CHF", 1.08);
                this.exchangeValues.put("GBP", 1.23);
                break;
        }
    }

    public void init() {
        ArrayList<String> converters = new ArrayList<String>();
        converters.add("USD");
        converters.add("EUR");
        converters.add("CHF");
        converters.add("GBP");

        for (Integer i = 0; i < converters.size(); i++) {
            defaultValues(converters.get(i));
        }
    }

    //Double amount, String fromCurrency, String toCurrency
    public Double convert(String From, String To) {
        // pobierz exchange rate z mapy exchangeValue, używając currencyTo
        Double fromValue = exchangeValues.get(To);
        // pobierz exchange rate z mapy exchangeValue, uzywając currencyFrom
        Double toValue = exchangeValues.get(From);
        return (fromValue);

        // policzyć weg. przeliczników z currencyFrom do currencyTo używając amount
    }


//    public static Double convert(Double amount, Double exchangeValue) {
//        Double price;
//        price = Math.round(price * 100d) / 100d;
//        return price;
//    }
    //Kursy walut w zl : EUR 4,68zl USD 4,43zl CHF 4,76zl GBP 5,46zl
    //Kursy walut w euro :zl 0,21 USD 0,95 CHF 1,02 GBP 1,16
    //Kursy walut w usd : zl 4,43 Eur 1,05 CHF 1,07 GBP 1,23
    //Kursy walut w chf : zl 0,21 Eur 0,98 USD 0,93 GBP 1,15
    //Kursy walut w gbp : zl 0,18 Eur 0,86 CHF 0,87 USD 0,81

}
