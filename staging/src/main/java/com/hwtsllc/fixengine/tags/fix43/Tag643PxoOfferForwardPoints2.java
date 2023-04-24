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

package com.hwtsllc.fixengine.tags.fix43;

import com.hwtsllc.fixengine.datatypes.FIX43;
import com.hwtsllc.fixengine.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  643
 *  OfferForwardPoints2
 *  PriceOffset
 *  <p></p>
 *  Deprecated in FIX.5.0 Offer F/X forward points of the future portion of a F/X swap quote added to spot rate.
 *  <p></p>
 *  May be negative.
 */
public class Tag643PxoOfferForwardPoints2 extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceOffsetType dataValue;

    public final static double TESTA_PXO_OFFER_FORWARD_POINTS_2
            = 0.643D;
    public final static double TESTB_PXO_OFFER_FORWARD_POINTS_2
            = 0.346D;

    public Tag643PxoOfferForwardPoints2(MyPriceOffsetType dataValue) {
        setFixType(FIX43.FIX643_PXO_OFFER_FORWARD_POINTS_2);
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
        Tag643PxoOfferForwardPoints2 tagData;

        tagData = new Tag643PxoOfferForwardPoints2(new MyPriceOffsetType(TESTA_PXO_OFFER_FORWARD_POINTS_2) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag643PxoOfferForwardPoints2(new MyPriceOffsetType(TESTB_PXO_OFFER_FORWARD_POINTS_2) );
        System.out.println(tagData.toVerboseString());
    }
}
