package com.hwtechservicesllc.staging2022.fields;

import com.hwtechservicesllc.staging2022.datatypes.FieldType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class Tag31LastPx {
    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final double DEFAULT_VALUE = 0.00;

    private final FieldType fieldType;
    private final double tag31LastPx;

    public Tag31LastPx() {
        this.fieldType = FieldType.DEFAULT_LAST_TRADE_PRICE;
        this.tag31LastPx = DEFAULT_VALUE;
    }

    public Tag31LastPx(final double tag31LastPx) {
        this.fieldType = FieldType.LAST_TRADE_PRICE;
        this.tag31LastPx = tag31LastPx;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public double getTag31LastPxValue() {
        return tag31LastPx;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFieldType().name());
        sb.append(":[");
        sb.append(getTag31LastPxValue());
        sb.append("]");

        return sb.toString();
    }
}

