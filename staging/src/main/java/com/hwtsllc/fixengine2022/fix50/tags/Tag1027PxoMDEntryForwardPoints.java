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
 *  1027
 *  MDEntryForwardPoints
 *  PriceOffset
 *  <p>
 *  Used for an F/X entry.
 *  <p></p>
 *  The forward points to be added to or subtracted from the spot rate
 *  to get the "all-in" rate in MDEntryPx.  Expressed in decimal form.
 *  <p></p>
 *  For example, 61.99 points is expressed and sent as 0.006199
 */
public class Tag1027PxoMDEntryForwardPoints extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyPriceOffsetType dataValue;

    public final static double TESTA_PXO_MD_ENTRY_FORWARD_POINTS
            = 0.001027D;
    public final static double TESTB_PXO_MD_ENTRY_FORWARD_POINTS
            = 0.00001027D;

    public Tag1027PxoMDEntryForwardPoints(MyPriceOffsetType dataValue) {
        setFixType( FIX50.FIX1027_PXO_MD_ENTRY_FORWARD_POINTS );
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
        Tag1027PxoMDEntryForwardPoints tagData;

        tagData = new Tag1027PxoMDEntryForwardPoints(new MyPriceOffsetType( TESTA_PXO_MD_ENTRY_FORWARD_POINTS ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1027PxoMDEntryForwardPoints(new MyPriceOffsetType( TESTB_PXO_MD_ENTRY_FORWARD_POINTS ) );
        System.out.println(tagData.toVerboseString());
    }
}
