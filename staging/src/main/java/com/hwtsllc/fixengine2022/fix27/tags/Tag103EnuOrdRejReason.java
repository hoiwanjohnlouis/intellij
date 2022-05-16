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
import com.hwtsllc.fixengine2022.fix27.enums.Enum103OrdRejReason;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  103
 *  OrdRejReason
 *  int
 *  Code to identify reason for order rejection.
 *  Note: Values 3, 4, and 5 will be used when rejecting an
 *        order due to pre-allocation information errors.
 *  Valid values:
 *      0 - Broker - Exchange option
 *      1 - Unknown symbol
 *      2 - Exchange closed
 *      3 - Order exceeds limit
 *      4 - Too late to enter
 *      5 - Unknown order
 *      6 - Duplicate Order (e.g. dupe ClOrdID)
 *      7 - Duplicate of a verbally communicated order
 *      8 - Stale order
 *      9 - Trade along required
 *      10 - Invalid Investor ID
 *      11 - Unsupported order characteristic
 *      12 - Surveillence Option
 *      13 - Incorrect quantity
 *      14 - Incorrect allocated quantity
 *      15 - Unknown account(s)
 *      18 - Invalid price increment
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
 */
public class Tag103EnuOrdRejReason extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum103OrdRejReason dataValue;

    public final static Enum103OrdRejReason TESTA_ENU_ORD_REJ_REASON
            = Enum103OrdRejReason.BROKER_OR_EXCHANGE;
    public final static Enum103OrdRejReason TESTB_ENU_ORD_REJ_REASON
            = Enum103OrdRejReason.OTHER;

    public Tag103EnuOrdRejReason(Enum103OrdRejReason dataValue) {
        setFixType(FIX27.FIX103_ENU_ORD_REJ_REASON);
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
        return toFIXIDString()
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
        Tag103EnuOrdRejReason tagData;

        tagData =  new Tag103EnuOrdRejReason(TESTA_ENU_ORD_REJ_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.toEnumNameString());
        System.out.println("ID:" + tagData.toFIXIDString());
        System.out.println("Name:" + tagData.toFIXNameString());
        System.out.println("Description:" + tagData.toFIXDescriptionString());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());

        tagData =  new Tag103EnuOrdRejReason(TESTB_ENU_ORD_REJ_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.toEnumNameString());
        System.out.println("ID:" + tagData.toFIXIDString());
        System.out.println("Name:" + tagData.toFIXNameString());
        System.out.println("Description:" + tagData.toFIXDescriptionString());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());
    }
}
