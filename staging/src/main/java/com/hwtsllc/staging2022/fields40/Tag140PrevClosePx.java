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

package com.hwtsllc.staging2022.fields40;

import com.hwtsllc.staging2022.datatypes.FieldType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag140PrevClosePx {
    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final double DEFAULT_VALUE = 0.00;

    private final FieldType fieldType;
    private final double tag140PrevClosePx;

    public Tag140PrevClosePx() {
        this.fieldType = FieldType.DEFAULT_PREVIOUS_DAYS_CLOSING_PRICE;
        this.tag140PrevClosePx = DEFAULT_VALUE;
    }

    public Tag140PrevClosePx(final double tag140PrevClosePx) {
        this.fieldType = FieldType.PREVIOUS_DAYS_CLOSING_PRICE;
        this.tag140PrevClosePx = tag140PrevClosePx;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public double getTag140PrevClosePxValue() {
        return tag140PrevClosePx;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFieldType().name());
        sb.append(":[");
        sb.append(getTag140PrevClosePxValue());
        sb.append("]");

        return sb.toString();
    }
}

