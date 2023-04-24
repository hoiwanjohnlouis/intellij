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

package com.hwtsllc.fixengine.datatypes;

import com.hwtsllc.fixengine.interfaces.LogVerboseString;

public class MyStringType implements LogVerboseString {
    private final String dataValue;

    public final static String TESTA_MY_STRING_TYPE
            = "YvonneDeCarlo-MyStringType";
    public final static String TESTB_MY_STRING_TYPE
            = "VivianLeigh-MyStringType";

    public MyStringType(final String dataValue) {
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
        MyStringType dataType;

        dataType = new MyStringType(TESTA_MY_STRING_TYPE);
        System.out.println(dataType.toVerboseString());

        dataType = new MyStringType(TESTB_MY_STRING_TYPE);
        System.out.println(dataType.toVerboseString());
    }
}
