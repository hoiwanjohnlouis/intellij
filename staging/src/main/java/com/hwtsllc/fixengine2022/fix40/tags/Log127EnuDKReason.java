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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.FIX40Abstract;
import com.hwtsllc.fixengine2022.fix40.enums.Enum127DKReason;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  127
 *  DKReason
 *  char
 *  Reason for execution rejection.
 *  Valid values:
 *      A - Unknown Symbol
 *      B - Wrong Side
 *      C - Quantity Exceeds Order
 *      D - No Matching Order
 *      E - Price Exceeds Limit
 *      F - Calculation Difference
 *      Z - Other
 */
public class Log127EnuDKReason extends FIX40Abstract implements LogValuePairString, LogVerboseString {
    private final Enum127DKReason dataValue;

    public final static Enum127DKReason TESTA_ENU_DK_REASON = Enum127DKReason.UNKNOWN_SYMBOL; // fake data
    public final static Enum127DKReason TESTB_ENU_DK_REASON = Enum127DKReason.OTHER;

    public Log127EnuDKReason(Enum127DKReason dataValue) {
        setFixType(FIX40.FIX127_ENU_DK_REASON);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
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
        Log127EnuDKReason tagData;

        tagData = new Log127EnuDKReason(TESTA_ENU_DK_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log127EnuDKReason(TESTB_ENU_DK_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
