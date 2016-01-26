package com.hwtechservicesllc.staging.fields;

import com.hwtechservicesllc.staging.enums.EFieldType;
import org.apache.log4j.Logger;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * <p>
 * Login   Hoi Wan Louis
 * <p>
 * Package com.hwtechservicesllc.stocks.fields
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

public class DateStamp {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private final Logger logger = Logger.getLogger(DEBUG_TAG);

    public final static DateStamp DEFAULT_DATE_STAMP_FIELD = new DateStamp();
    private final EFieldType DEFAULT_FIELD_TYPE = EFieldType.DEFAULT_DATE_STAMP;
    private final String DEFAULT_DATE_STAMP = "1900.01.01";

    private final EFieldType fieldType;
    private final String dateStamp;

    //
    public DateStamp() {
        this.fieldType = DEFAULT_FIELD_TYPE;
        this.dateStamp = DEFAULT_DATE_STAMP;
    }

    public DateStamp(final EFieldType fieldType, final String dateStamp) {
        this.fieldType = fieldType;
        this.dateStamp = dateStamp;
    }

    public EFieldType getFieldType() {
        return fieldType;
    }

    public String getDateStamp() {
        return dateStamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(fieldType.name());
        sb.append(":[");
        sb.append(getDateStamp());
        sb.append("]");

        return sb.toString();
    }
}
