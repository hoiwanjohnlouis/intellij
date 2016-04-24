package com.hwtechservicesllc.staging2016.fields;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.hwtechservicesllc.staging2016.enums.FieldType;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class Quantity {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final FieldType DEFAULT_FIELD_TYPE = FieldType.DEFAULT_QUANTITY;
    private final double DEFAULT_VALUE = 0.00;

    private final FieldType fieldType;
    private final double quantity;

    //
    public Quantity() {
        this.fieldType = DEFAULT_FIELD_TYPE;
        this.quantity = DEFAULT_VALUE;
    }

    public Quantity(final FieldType fieldType, final double quantity) {
        this.fieldType = fieldType;
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
