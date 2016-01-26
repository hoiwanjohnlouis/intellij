package com.hwtechservicesllc.staging.fields;

import com.hwtechservicesllc.staging.enums.EFieldType;
import org.apache.log4j.Logger;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * <p>
 * Login   Hoi Wan Louis
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

public class TimeStamp {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private final Logger logger = Logger.getLogger(DEBUG_TAG);

    public final static EFieldType DEFAULT_FIELD_TYPE = EFieldType.DEFAULT_TIME_STAMP;
    public final static String DEFAULT_TIME_STAMP = "00:00:00";

    private final EFieldType fieldType;
    private final String timeStamp;

    //
    public TimeStamp() {
        this.fieldType = DEFAULT_FIELD_TYPE;
        this.timeStamp = DEFAULT_TIME_STAMP;
    }

    public TimeStamp(final EFieldType fieldType, final String timeStamp) {
        this.fieldType = fieldType;
        this.timeStamp = timeStamp;
    }

    public EFieldType getFieldType() {
        return fieldType;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(fieldType.name());
        sb.append(":[");
        sb.append(getTimeStamp());
        sb.append("]");

        return sb.toString();
    }
}
