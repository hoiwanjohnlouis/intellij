package com.hwtechservicesllc.staging2016.fields;

import com.hwtechservicesllc.staging2016.enums.FieldType;
import org.apache.log4j.Logger;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * <p>
 * Login   Hoi Wan Louis
 * <p>
 * Package com.hwtechservicesllc.stocks2016.fields
 * Project intellijPrototyping
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

public class CompanyName {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private final Logger logger = Logger.getLogger(DEBUG_TAG);

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
