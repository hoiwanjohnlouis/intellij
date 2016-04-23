package com.hwtechservicesllc.staging2016.fields;

import com.hwtechservicesllc.staging2016.enums.FieldType;
import org.apache.log4j.Logger;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class TickerSymbol {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private final Logger logger = Logger.getLogger(DEBUG_TAG);

    private final FieldType DEFAULT_FIELD_TYPE = FieldType.DEFAULT_TICKER_SYMBOL;
    private final String DEFAULT_VALUE = "WIDGETS";

    private final FieldType fieldType;
    private final String tickerSymbol;

    //
    public TickerSymbol() {
        this.fieldType = DEFAULT_FIELD_TYPE;
        this.tickerSymbol = DEFAULT_VALUE;
    }

    public TickerSymbol(final FieldType fieldType, final String tickerSymbol) {
        this.fieldType = fieldType;
        this.tickerSymbol = tickerSymbol;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFieldType().name());
        sb.append(":[");
        sb.append(getTickerSymbol());
        sb.append("]");

        return sb.toString();
    }
}
