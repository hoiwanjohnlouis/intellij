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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.FIX42;
import com.hwtsllc.fix.datatypes.FIX42Abstract;
import com.hwtsllc.fix.datatypes.MyPriceType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  426
 *  DayAvgPx
 *  Price
 *  <p></p>
 *  The average price for quantity on a GT order that has traded today.
 */
public class Tag426PrcDayAvgPx extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceType dataValue;

    public final static double TESTA_PRC_DAY_AVG_PX
            = 0.426D;
    public final static double TESTB_PRC_DAY_AVG_PX
            = 0.0426D;

    public Tag426PrcDayAvgPx(MyPriceType dataValue) {
        setFixType(FIX42.FIX426_PRC_DAY_AVG_PX);
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
        Tag426PrcDayAvgPx tagData;

        tagData = new Tag426PrcDayAvgPx(new MyPriceType(TESTA_PRC_DAY_AVG_PX) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag426PrcDayAvgPx(new MyPriceType(TESTB_PRC_DAY_AVG_PX) );
        System.out.println(tagData.toVerboseString());
    }
}
