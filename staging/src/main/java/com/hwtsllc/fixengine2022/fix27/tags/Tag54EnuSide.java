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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumSide;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  54 (same as 54, 624,)
 *  Side
 *  char
 *  Side of order (see Volume : "Glossary" for value definitions)
 *  Valid values:
 *      1 - Buy
 *      2 - Sell
 *      3 - Buy minus
 *      4 - Sell plus
 *      5 - Sell short
 *      6 - Sell short exempt
 *      7 - Undisclosed (valid for IOI and List Order messages only)
 *      8 - Cross (orders where counterparty is an exchange, valid for all messages except IOIs)
 *      9 - Cross short
 *      A - Cross short exxmpt
 *      B - "As Defined" (for use with multileg instruments)
 *      C - "Opposite" (for use with multileg instruments)
 *      D - Subscribe (e.g. CIV)
 *      E - Redeem (e.g. CIV)
 *      F - Lend (FINANCING - identifies direction of collateral)
 *      G - Borrow (FINANCING - identifies direction of collateral)
 */
public class Tag54EnuSide extends FIX27Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumSide dataValue;

    public final static MyEnumSide TESTA_ENU_SIDE = MyEnumSide.BUY; // fake data
    public final static MyEnumSide TESTB_ENU_SIDE = MyEnumSide.SELL;

    public Tag54EnuSide(MyEnumSide dataValue) {
        setFixType(FIX27.FIX54_ENU_SIDE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
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
        Tag54EnuSide tagData;

        tagData = new Tag54EnuSide(TESTA_ENU_SIDE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());

        tagData = new Tag54EnuSide(TESTB_ENU_SIDE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
