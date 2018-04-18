package com.hwtechservicesllc.staging2016.fields;

import com.hwtechservicesllc.staging2016.enums.FieldType;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class Price {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final FieldType DEFAULT_FIELD_TYPE = FieldType.DEFAULT_PRICE;
    private final double DEFAULT_VALUE = 0.00;

    private final FieldType fieldType;
    private final double price;

    //
    public Price() {
        this.fieldType = DEFAULT_FIELD_TYPE;
        this.price = DEFAULT_VALUE;
    }

    public Price(final FieldType fieldType, final double price) {
        this.fieldType = fieldType;
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
