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

package com.hwtsllc.fix.tags.fix50;

import com.hwtsllc.fix.datatypes.FIX50;
import com.hwtsllc.fix.datatypes.FIX50Abstract;
import com.hwtsllc.fix.datatypes.MyIntType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  1023
 *  MDPriceLevel
 *  int
 *  <p>
 *  Integer to convey the level of a bid or offer at a given price level.
 *  <p></p>
 *  This is in contrast to MDEntryPositionNo which is used to
 *  convey the position of an order within a Price level
 */
public class Tag1023IntMDPriceLevel extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyIntType dataValue;

    public final static int TESTA_INT_MD_PRICE_LEVEL
            = 1023;
    public final static int TESTB_INT_MD_PRICE_LEVEL
            = 23;

    public Tag1023IntMDPriceLevel(MyIntType dataValue) {
        setFixType(FIX50.FIX1023_INT_MD_PRICE_LEVEL);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                ;
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag1023IntMDPriceLevel tagData;

        tagData = new Tag1023IntMDPriceLevel(new MyIntType(TESTA_INT_MD_PRICE_LEVEL) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1023IntMDPriceLevel(new MyIntType(TESTB_INT_MD_PRICE_LEVEL) );
        System.out.println(tagData.toVerboseString());
    }
}
