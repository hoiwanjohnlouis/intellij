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

package com.hwtsllc.fix.datatypes;

import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  MyUTCDateType contains only the DATE portion of UTC.
 */
public class MyUTCDateType implements LogVerboseString {
    private final String dataValue;

    public final static String TESTA_MY_UTC_DATE_TYPE
            = "14000101";
    public final static String TESTB_MY_UTC_DATE_TYPE
            = "15000101";

    public MyUTCDateType(final String dataValue) {
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
        MyUTCDateType dataType;

        dataType = new MyUTCDateType(TESTA_MY_UTC_DATE_TYPE);
        System.out.println(dataType.toVerboseString());

        dataType = new MyUTCDateType(TESTB_MY_UTC_DATE_TYPE);
        System.out.println(dataType.toVerboseString());
    }
}
