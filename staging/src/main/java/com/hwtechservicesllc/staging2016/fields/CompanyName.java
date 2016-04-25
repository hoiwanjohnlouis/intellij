package com.hwtechservicesllc.staging2016.fields;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.hwtechservicesllc.staging2016.enums.FieldType;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class CompanyName {

    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final FieldType DEFAULT_FIELD_TYPE = FieldType.DEFAULT_COMPANY_NAME;
    private final String DEFAULT_VALUE = "Some Widgets, Inc.";

    private final FieldType fieldType;
    private final String companyName;

    //
    public CompanyName() {
        this.fieldType = DEFAULT_FIELD_TYPE;
        this.companyName = DEFAULT_VALUE;
    }

    public CompanyName(final FieldType fieldType, final String companyName) {
        this.fieldType = fieldType;
        this.companyName = companyName;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFieldType().name());
        sb.append(":[");
        sb.append(getCompanyName());
        sb.append("]");

        return sb.toString();
    }
}
