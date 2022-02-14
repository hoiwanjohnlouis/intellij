package com.hwtechservicesllc.staging2022.fields;

import com.hwtechservicesllc.staging2022.datatypes.FieldType;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class OpeningPrice {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final double DEFAULT_VALUE = 0.00;

    private final FieldType fieldType;
    private final double price;

    //
    public OpeningPrice() {
        this.fieldType = FieldType.DEFAULT_OPENING_PRICE;
        this.price = DEFAULT_VALUE;
    }

    public OpeningPrice(final double price) {
        this.fieldType = FieldType.OPENING_PRICE;
        this.price = price;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFieldType().name());
        sb.append(":[");
        sb.append(getPrice());
        sb.append("]");

        return sb.toString();
    }
}
