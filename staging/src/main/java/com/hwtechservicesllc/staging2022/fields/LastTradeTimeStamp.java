package com.hwtechservicesllc.staging2022.fields;

import com.hwtechservicesllc.staging2022.enums.FieldType;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class LastTradeTimeStamp {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    public final static String DEFAULT_VALUE = "00:00:00";

    private final FieldType fieldType;
    private final String timeStamp;

    //
    public LastTradeTimeStamp() {
        this.fieldType = FieldType.DEFAULT_LAST_TRADE_TIME_STAMP;
        this.timeStamp = DEFAULT_VALUE;
    }

    public LastTradeTimeStamp(final String timeStamp) {
        this.fieldType = FieldType.LAST_TRADE_TIME_STAMP;
        this.timeStamp = timeStamp;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFieldType().name());
        sb.append(":[");
        sb.append(getTimeStamp());
        sb.append("]");

        return sb.toString();
    }
}
