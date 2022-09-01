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
 *  <p></p>
 *  Code to identify reason for order rejection.
 *  <p></p>
 *  Note: Values 3, 4, and 5 will be used when rejecting an
 *        order due to pre-allocation information errors.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Broker - Exchange option
 *  <p>    1 - Unknown symbol
 *  <p>    2 - Exchange closed
 *  <p>    3 - Order exceeds limit
 *  <p>    4 - Too late to enter
 *  <p></p>
 *  <p>    5 - Unknown order
 *  <p>    6 - Duplicate Order (e.g. dupe ClOrdID)
 *  <p>    7 - Duplicate of a verbally communicated order
 *  <p>    8 - Stale order
 *  <p>    9 - Trade along required
 *  <p></p>
 *  <p>    10 - Invalid Investor ID
 *  <p>    11 - Unsupported order characteristic
 *  <p>    12 - Surveillance Option
 *  <p>    13 - Incorrect quantity
 *  <p>    14 - Incorrect allocated quantity
 *  <p></p>
 *  <p>    15 - Unknown account(s)
 *  <p>    18 - Invalid price increment
 *  <p>    99 - Other
 *  <p></p>
 *  <p>    Or any value conforming to the data type Reserved100Plus
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
        return dataValue.toEnumDescriptionString();
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
        System.out.println( new Tag103EnuOrdRejReason(TESTA_ENU_ORD_REJ_REASON).toVerboseString() );
        System.out.println( new Tag103EnuOrdRejReason(TESTB_ENU_ORD_REJ_REASON).toVerboseString() );

        // loop around the ENUM and display
        for (Enum103OrdRejReason oneEnum : Enum103OrdRejReason.values()) {
            System.out.println( new Tag103EnuOrdRejReason(oneEnum).toVerboseString() );
        }
    }
}
