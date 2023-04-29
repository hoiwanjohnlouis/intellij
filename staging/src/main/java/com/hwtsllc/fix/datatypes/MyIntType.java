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
 *
 * MyIntType is a wrapper class for any int primitive  field
 * Initially it will be an int.
 */
public class MyIntType implements LogVerboseString {
    private final int dataValue;

    public final static int TESTA_MY_INT_TYPE
            = 4;
    public final static int TESTB_MY_INT_TYPE
            = 8;

    public MyIntType(final int dataValue) {
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
        return String.valueOf( this.dataValue );
    }

    /**
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        MyIntType dataType;

        dataType = new MyIntType( TESTA_MY_INT_TYPE );
        System.out.println(dataType.toVerboseString());

        dataType = new MyIntType( TESTB_MY_INT_TYPE );
        System.out.println(dataType.toVerboseString());
    }
}
