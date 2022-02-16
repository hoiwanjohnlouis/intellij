/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.staging2022.fields;

import com.hwtsllc.staging2022.datatypes.FieldType;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

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
