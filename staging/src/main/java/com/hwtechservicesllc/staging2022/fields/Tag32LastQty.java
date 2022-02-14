package com.hwtechservicesllc.staging2022.fields;

import com.hwtechservicesllc.staging2022.datatypes.FieldType;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class Tag32LastQty {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final double DEFAULT_VALUE = 0.00;

    private final FieldType fieldType;
    private final double tag32LastQty;

    //
    public Tag32LastQty() {
        this.fieldType = FieldType.DEFAULT_LAST_TRADE_QUANTITY;
        this.tag32LastQty = DEFAULT_VALUE;
    }

    public Tag32LastQty(final double tag32LastQty) {
        this.fieldType = FieldType.LAST_TRADE_QUANTITY;
        this.tag32LastQty = tag32LastQty;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public double getTag32LastQtyValue() {
        return tag32LastQty;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFieldType().name());
        sb.append(":[");
        sb.append(getTag32LastQtyValue());
        sb.append("]");

        return sb.toString();
    }
}
