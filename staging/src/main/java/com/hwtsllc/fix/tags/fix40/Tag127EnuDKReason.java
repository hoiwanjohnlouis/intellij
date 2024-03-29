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

package com.hwtsllc.fix.tags.fix40;

import com.hwtsllc.fix.datatypes.FIX40;
import com.hwtsllc.fix.datatypes.FIX40Abstract;
import com.hwtsllc.fix.enums.fix40.Enum127DKReason;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  127
 *  DKReason
 *  char
 *  <p></p>
 *  Reason for execution rejection.
 *  <p></p>
 *  Valid values:
 *  <p>    A - Unknown Symbol
 *  <p>    B - Wrong Side
 *  <p>    C - Quantity Exceeds Order
 *  <p>    D - No Matching Order
 *  <p>    E - Price Exceeds Limit
 *  <p></p>
 *  <p>    F - Calculation Difference
 *  <p>    Z - Other
 */
public class Tag127EnuDKReason extends FIX40Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum127DKReason dataValue;

    public final static Enum127DKReason TESTA_ENU_DK_REASON
            = Enum127DKReason.UNKNOWN_SYMBOL;
    public final static Enum127DKReason TESTB_ENU_DK_REASON
            = Enum127DKReason.OTHER;

    public Tag127EnuDKReason(Enum127DKReason dataValue) {
        setFixType(FIX40.FIX127_ENU_DK_REASON);
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
        System.out.println( new Tag127EnuDKReason(TESTA_ENU_DK_REASON).toVerboseString() );
        System.out.println( new Tag127EnuDKReason(TESTB_ENU_DK_REASON).toVerboseString() );

        // loop around the ENUM and display
        for (Enum127DKReason oneEnum : Enum127DKReason.values()) {
            System.out.println( new Tag127EnuDKReason(oneEnum).toVerboseString() );
        }
    }
}
