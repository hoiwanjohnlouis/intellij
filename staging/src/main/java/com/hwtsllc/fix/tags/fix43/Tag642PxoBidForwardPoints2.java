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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.datatypes.FIX43;
import com.hwtsllc.fix.datatypes.FIX43Abstract;
import com.hwtsllc.fix.datatypes.MyPriceOffsetType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  642
 *  BidForwardPoints2
 *  PriceOffset
 *  <p></p>
 *  Deprecated in FIX.5.0 Bid F/X forward points of the future portion of a F/X swap quote added to spot rate.
 *  <p></p>
 *  May be negative.
 */
public class Tag642PxoBidForwardPoints2 extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceOffsetType dataValue;

    public final static double TESTA_PXO_BID_FORWARD_POINTS_2
            = 0.642D;
    public final static double TESTB_PXO_BID_FORWARD_POINTS_2
            = 0.246D;

    public Tag642PxoBidForwardPoints2(MyPriceOffsetType dataValue) {
        setFixType(FIX43.FIX642_PXO_BID_FORWARD_POINTS_2);
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
        Tag642PxoBidForwardPoints2 tagData;

        tagData = new Tag642PxoBidForwardPoints2(new MyPriceOffsetType(TESTA_PXO_BID_FORWARD_POINTS_2) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag642PxoBidForwardPoints2(new MyPriceOffsetType(TESTB_PXO_BID_FORWARD_POINTS_2) );
        System.out.println(tagData.toVerboseString());
    }
}
