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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumSide;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  54 (same as 54, 624,)
 *  Side
 *  char
 *  <p>
 *  Side of order (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  624 (same as 54, 624,)
 *  LegSide
 *  char
 *  <p>
 *  The side of this individual leg (multileg security).
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Buy
 *  <p>    2 - Sell
 *  <p>    3 - Buy minus
 *  <p>    4 - Sell plus
 *  <p>    5 - Sell short
 *  <p></p>
 *  <p>    6 - Sell short exempt
 *  <p>    7 - Undisclosed (valid for IOI and List Order messages only)
 *  <p>    8 - Cross (orders where counterparty is an exchange, valid for all messages except IOIs)
 *  <p>    9 - Cross short
 *  <p></p>
 *  <p>    A - Cross short exxmpt
 *  <p>    B - "As Defined" (for use with multileg instruments)
 *  <p>    C - "Opposite" (for use with multileg instruments)
 *  <p>    D - Subscribe (e.g. CIV)
 *  <p>    E - Redeem (e.g. CIV)
 *  <p></p>
 *  <p>    F - Lend (FINANCING - identifies direction of collateral)
 *  <p>    G - Borrow (FINANCING - identifies direction of collateral)
 */
public class Tag624EnuLegSide extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumSide dataValue;

    public final static MyEnumSide TESTA_ENU_LEG_SIDE
            = MyEnumSide.BORROW_FINANCING;
    public final static MyEnumSide TESTB_ENU_LEG_SIDE
            = MyEnumSide.SELL_PLUS;

    public Tag624EnuLegSide(MyEnumSide dataValue) {
        setFixType(FIX43.FIX624_ENU_LEG_SIDE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to return a string describing the data
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
        Tag624EnuLegSide tagData;

        tagData = new Tag624EnuLegSide(TESTA_ENU_LEG_SIDE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());

        tagData = new Tag624EnuLegSide(TESTB_ENU_LEG_SIDE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());
    }
}
