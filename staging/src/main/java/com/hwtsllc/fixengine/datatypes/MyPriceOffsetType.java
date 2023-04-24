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
 * MyPriceOffsetType is a wrapper class for the Price field
 * Initially it will be a String, later on it will become BigDecimal.
 */
public class MyPriceOffsetType implements LogVerboseString {
    private final double dataValue;

    public final static double TESTA_MY_PRICE_OFFSET_TYPE
            = 0.1280D;
    public final static double TESTB_MY_PRICE_OFFSET_TYPE
            = 0.01080D;

    public MyPriceOffsetType(final double dataValue) {
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
        MyPriceOffsetType dataType;

        dataType = new MyPriceOffsetType( TESTA_MY_PRICE_OFFSET_TYPE );
        System.out.println(dataType.toVerboseString());

        dataType = new MyPriceOffsetType( TESTB_MY_PRICE_OFFSET_TYPE );
        System.out.println(dataType.toVerboseString());
    }
}
