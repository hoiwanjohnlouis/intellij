package com.hwtechservicesllc.staging2022.fields;

import com.hwtechservicesllc.staging2022.enums.FieldType;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class CompanyName {

    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String DEFAULT_VALUE = "Default Company Widgets, Inc.";

    private final FieldType fieldType;
    private final String companyName;

    //
    public CompanyName() {
        this.fieldType = FieldType.DEFAULT_COMPANY_NAME;
        this.companyName = DEFAULT_VALUE;
    }

    public CompanyName(final String companyName) {
        this.fieldType = FieldType.COMPANY_NAME;
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
