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
import com.hwtsllc.fix.datatypes.MyPriceType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  153
 *  AllocAvgPx
 *  Price
 *  <p></p>
 *  AvgPx (6) for a specific AllocAccount (79)
 *  <p></p>
 *  For Fixed Income this is always expressed as "percent of par" price type.
 */
public class Tag153PrcAllocAvgPx extends FIX41Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceType dataValue;

    public final static double TESTA_PRC_ALLOC_AVG_PX
            = 1.53D;
    public final static double TESTB_PRC_ALLOC_AVG_PX
            = 3.51D;

    public Tag153PrcAllocAvgPx(MyPriceType dataValue) {
        setFixType(FIX41.FIX153_PRC_ALLOC_AVG_PX);
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
        Tag153PrcAllocAvgPx tagData;

        tagData = new Tag153PrcAllocAvgPx(new MyPriceType(TESTA_PRC_ALLOC_AVG_PX) );
        System.out.println( tagData.toVerboseString() );

        tagData = new Tag153PrcAllocAvgPx(new MyPriceType(TESTB_PRC_ALLOC_AVG_PX) );
        System.out.println( tagData.toVerboseString() );
    }
}
