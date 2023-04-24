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

package com.hwtsllc.fixengine.tags.fix50;

import com.hwtsllc.fixengine.datatypes.FIX50;
import com.hwtsllc.fixengine.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  1069
 *  SwapPoints
 *  PriceOffset
 *  <p>
 *  For FX Swap, this is used to express the differential
 *  between the far leg's bid/offer and the near leg's bid/offer.
 *  <p></p>
 *  Value can be negative. Expressed in decimal form.
 *  <p></p>
 *  For example, 61.99 points is expressed and sent as 0.006199
 */
public class Tag1069PxoSwapPoints extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceOffsetType dataValue;

    public final static double TESTA_PXO_SWAP_POINTS
            = 0.001069D;
    public final static double TESTB_PXO_SWAP_POINTS
            = 0.00001069D;

    public Tag1069PxoSwapPoints(MyPriceOffsetType dataValue) {
        setFixType( FIX50.FIX1069_PXO_SWAP_POINTS );
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
        Tag1069PxoSwapPoints tagData;

        tagData = new Tag1069PxoSwapPoints(new MyPriceOffsetType( TESTA_PXO_SWAP_POINTS ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1069PxoSwapPoints(new MyPriceOffsetType( TESTB_PXO_SWAP_POINTS ) );
        System.out.println(tagData.toVerboseString());
    }
}
