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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  189
 *  BidForwardPoints
 *  PriceOffset
 *  <p>
 *  Bid F/X forward points added to spot rate. Maybe a negative value.
 */
public class Tag189PxoBidForwardPoints extends FIX41Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyPriceOffsetType dataValue;

    public final static double TESTA_PXO_BID_FORWARD_POINTS = 0.189D;
    public final static double TESTB_PXO_BID_FORWARD_POINTS = 0.981D;

    public Tag189PxoBidForwardPoints(MyPriceOffsetType dataValue) {
        setFixType(FIX41.FIX189_PXO_BID_FORWARD_POINTS);
        this.dataValue = dataValue;
    }

    public double getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
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
        Tag189PxoBidForwardPoints tagData;

        tagData = new Tag189PxoBidForwardPoints(new MyPriceOffsetType(TESTA_PXO_BID_FORWARD_POINTS) );
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag189PxoBidForwardPoints(new MyPriceOffsetType(TESTB_PXO_BID_FORWARD_POINTS) );
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
