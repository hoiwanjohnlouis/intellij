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

package com.hwtsllc.fix.tags.fix41;

import com.hwtsllc.fix.datatypes.FIX41;
import com.hwtsllc.fix.datatypes.FIX41Abstract;
import com.hwtsllc.fix.datatypes.MyIntType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  157
 *  NumDaysInterest
 *  int
 *  <p></p>
 *  Number of Days of Interest for convertible bonds and fixed income.
 *  <p></p>
 *  Note value may be negative.
 */
public class Tag157IntNumDaysInterest extends FIX41Abstract implements LogValuePairString, LogVerboseString {
    private final MyIntType dataValue;

    public final static int TESTA_INT_NUM_DAYS_INTEREST
            = 60;
    public final static int TESTB_INT_NUM_DAYS_INTEREST
            = 30;

    public Tag157IntNumDaysInterest(MyIntType dataValue) {
        setFixType(FIX41.FIX157_INT_NUM_DAYS_INTEREST);
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
        Tag157IntNumDaysInterest tagData;

        tagData = new Tag157IntNumDaysInterest(new MyIntType(TESTA_INT_NUM_DAYS_INTEREST) );
        System.out.println( tagData.toVerboseString() );

        tagData = new Tag157IntNumDaysInterest(new MyIntType(TESTB_INT_NUM_DAYS_INTEREST) );
        System.out.println( tagData.toVerboseString() );
    }
}
