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
import com.hwtsllc.fix.enums.fix50.Enum1094PegPriceType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  1094
 *  PegPriceType
 *  int
 *  <p>
 *  Defines the type of peg.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Last peg (last sale)
 *  <p>    2 - Mid-price peg (midprice of inside quote)
 *  <p>    3 - Opening peg
 *  <p>    4 - Market peg
 *  <p>    5 - Primary peg (primary market - buy at bid or sell at offer)
 *  <p></p>
 *  <p>    6 - Fixed Peg to Local best bid or offer at time of order
 *  <p>    7 - Peg to VWAP
 *  <p>    8 - Trailing Stop Peg
 *  <p>    9 - Peg to Limit Price
 */
public class Tag1094EnuPegPriceType extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum1094PegPriceType dataValue;

    public final static Enum1094PegPriceType TESTA_ENU_PEG_PRICE_TYPE
            = Enum1094PegPriceType.FIXED_PEG;
    public final static Enum1094PegPriceType TESTB_ENU_PEG_PRICE_TYPE
            = Enum1094PegPriceType.MID_PEG;

    public Tag1094EnuPegPriceType(Enum1094PegPriceType dataValue) {
        setFixType(FIX50.FIX1094_ENU_PEG_PRICE_TYPE);
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
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toFIXDescriptionString();
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
        Tag1094EnuPegPriceType tagData;

        tagData = new Tag1094EnuPegPriceType(TESTA_ENU_PEG_PRICE_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1094EnuPegPriceType(TESTB_ENU_PEG_PRICE_TYPE);
        System.out.println(tagData.toVerboseString());
    }
}
