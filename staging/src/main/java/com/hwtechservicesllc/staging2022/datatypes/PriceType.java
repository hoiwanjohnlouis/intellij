package com.hwtechservicesllc.staging2022.datatypes;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class PriceType {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final double DEFAULT_VALUE = 0.00;

    private final double price;

    private PriceType() {
        this.price = DEFAULT_VALUE;
    }

    public PriceType(final double price) {
        this.price = price;
    }

    public double getPriceValue() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getPriceValue());
        return sb.toString();
    }

}
