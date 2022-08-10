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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1065
 *  BidSwapPoints
 *  PriceOffset
 *  <p>
 *  The bid FX Swap points for an FX Swap.
 *  <p></p>
 *  It is the "far bid forward points - near offer forward point".
 *  <p></p>
 *  Value can be negative.  Expressed in decimal form.
 *  <p></p>
 *  For example, 61.99 points is expressed and sent as 0.006199
 */
public class Tag1065PxoBidSwapPoints extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceOffsetType dataValue;

    public final static double TESTA_PXO_BID_SWAP_POINTS
            = 0.001065D;
    public final static double TESTB_PXO_BID_SWAP_POINTS
            = 0.00001065D;

    public Tag1065PxoBidSwapPoints(MyPriceOffsetType dataValue) {
        setFixType( FIX50.FIX1065_PXO_BID_SWAP_POINTS );
        this.dataValue = dataValue;
    }

    public double getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag1065PxoBidSwapPoints tagData;

        tagData = new Tag1065PxoBidSwapPoints(new MyPriceOffsetType( TESTA_PXO_BID_SWAP_POINTS ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1065PxoBidSwapPoints(new MyPriceOffsetType( TESTB_PXO_BID_SWAP_POINTS ) );
        System.out.println(tagData.toVerboseString());
    }
}
