package com.hwtechservicesllc.staging2022.fields;

import com.hwtechservicesllc.staging2022.enums.FieldType;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class LastTradeQuantity {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final double DEFAULT_VALUE = 0.00;

    private final FieldType fieldType;
    private final double quantity;

    //
    public LastTradeQuantity() {
        this.fieldType = FieldType.DEFAULT_LAST_TRADE_QUANTITY;
        this.quantity = DEFAULT_VALUE;
    }

    public LastTradeQuantity(final double quantity) {
        this.fieldType = FieldType.LAST_TRADE_QUANTITY;
        this.quantity = quantity;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFieldType().name());
        sb.append(":[");
        sb.append(getQuantity());
        sb.append("]");

        return sb.toString();
    }
}
