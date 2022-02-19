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

package com.hwtsllc.fixengine2022.fields40;

import com.hwtsllc.fixengine2022.datatypes.FieldType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag31LastPx {
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final double DEFAULT_VALUE = 0.00;

    private final FieldType fieldType;
    private final double tag31LastPx;

    public Tag31LastPx() {
        this.fieldType = FieldType.DEFAULT_LAST_TRADE_PRICE;
        this.tag31LastPx = DEFAULT_VALUE;
    }

    public Tag31LastPx(final double tag31LastPx) {
        this.fieldType = FieldType.LAST_TRADE_PRICE;
        this.tag31LastPx = tag31LastPx;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public double getTag31LastPxValue() {
        return tag31LastPx;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFieldType().name());
        sb.append(":[");
        sb.append(getTag31LastPxValue());
        sb.append("]");

        return sb.toString();
    }
}

