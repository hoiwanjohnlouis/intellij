package com.hwtechservicesllc.staging2016.fields;

import com.hwtechservicesllc.staging2016.enums.FieldType;
import org.apache.log4j.Logger;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class DateStamp {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private final Logger logger = Logger.getLogger(DEBUG_TAG);

    private final FieldType DEFAULT_FIELD_TYPE = FieldType.DEFAULT_DATE_STAMP;
    private final String DEFAULT_VALUE = "1900.01.01";

    private final FieldType fieldType;
    private final String dateStamp;

    //
    public DateStamp() {
        this.fieldType = DEFAULT_FIELD_TYPE;
        this.dateStamp = DEFAULT_VALUE;
    }

    public DateStamp(final FieldType fieldType, final String dateStamp) {
        this.fieldType = fieldType;
        this.dateStamp = dateStamp;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public String getDateStamp() {
        return dateStamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFieldType().name());
        sb.append(":[");
        sb.append(getDateStamp());
        sb.append("]");

        return sb.toString();
    }
}
