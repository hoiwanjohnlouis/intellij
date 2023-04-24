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

package com.hwtsllc.fixengine2022.datatypes;

import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 * MyCurrencyType is a wrapper class for the Currency field
 * It will be a String,
 */
public class MyCurrencyType implements LogVerboseString {
    private final String dataValue;

    public final static String TESTA_MY_CURRENCY_TYPE
            = "USD-MyCurrencyType";
    public final static String TESTB_MY_CURRENCY_TYPE
            = "CHF-MyCurrencyType";

    public MyCurrencyType(final String dataValue) {
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return this.dataValue;
    }

    /**
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        MyCurrencyType dataType;

        dataType = new MyCurrencyType( TESTA_MY_CURRENCY_TYPE );
        System.out.println(dataType.toVerboseString());

        dataType = new MyCurrencyType( TESTB_MY_CURRENCY_TYPE );
        System.out.println(dataType.toVerboseString());
    }
}
