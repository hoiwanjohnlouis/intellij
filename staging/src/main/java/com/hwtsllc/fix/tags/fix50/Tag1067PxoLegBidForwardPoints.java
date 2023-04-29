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
import com.hwtsllc.fix.datatypes.MyPriceOffsetType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  1067
 *  LegBidForwardPoints
 *  PriceOffset
 *  <p>
 *  The bid FX forward points for the leg of an FX Swap.
 *  <p></p>
 *  Value can be negative. Expressed in decimal form.
 *  <p></p>
 *  For example, 61.99 points is expressed and sent as 0.006199
 */
public class Tag1067PxoLegBidForwardPoints extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceOffsetType dataValue;

    public final static double TESTA_PXO_LEG_BID_FORWARD_POINTS
            = 0.001067D;
    public final static double TESTB_PXO_LEG_BID_FORWARD_POINTS
            = 0.00001067D;

    public Tag1067PxoLegBidForwardPoints(MyPriceOffsetType dataValue) {
        setFixType( FIX50.FIX1067_PXO_LEG_BID_FORWARD_POINTS );
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
        Tag1067PxoLegBidForwardPoints tagData;

        tagData = new Tag1067PxoLegBidForwardPoints(new MyPriceOffsetType( TESTA_PXO_LEG_BID_FORWARD_POINTS ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1067PxoLegBidForwardPoints(new MyPriceOffsetType( TESTB_PXO_LEG_BID_FORWARD_POINTS ) );
        System.out.println(tagData.toVerboseString());
    }
}
