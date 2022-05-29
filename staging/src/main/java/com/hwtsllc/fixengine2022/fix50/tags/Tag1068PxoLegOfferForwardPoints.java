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
 *  1068
 *  LegOfferForwardPoints
 *  PriceOffset
 *  <p>
 *  The offer FX forward points for the leg of an FX Swap.
 *  <p>
 *  Value can be negative. Expressed in decimal form.
 *  <p>
 *  For example, 61.99 points is expressed and sent as 0.006199
 */
public class Tag1068PxoLegOfferForwardPoints extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceOffsetType dataValue;

    public final static double TESTA_PXO_LEG_OFFER_FORWARD_POINTS
            = 0.001068D;
    public final static double TESTB_PXO_LEG_OFFER_FORWARD_POINTS
            = 0.00001068D;

    public Tag1068PxoLegOfferForwardPoints(MyPriceOffsetType dataValue) {
        setFixType( FIX50.FIX1068_PXO_LEG_OFFER_FORWARD_POINTS );
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
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag1068PxoLegOfferForwardPoints tagData;

        tagData = new Tag1068PxoLegOfferForwardPoints(new MyPriceOffsetType( TESTA_PXO_LEG_OFFER_FORWARD_POINTS ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1068PxoLegOfferForwardPoints(new MyPriceOffsetType( TESTB_PXO_LEG_OFFER_FORWARD_POINTS ) );
        System.out.println(tagData.toVerboseString());
    }
}
