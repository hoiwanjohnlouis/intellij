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
import com.hwtsllc.fixengine2022.fix27.enums.Enum39OrdStatus;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  39
 *  OrdStatus
 *  char
 *  <p></p>
 *  Identifies current status of order.
 *  <p></p>
 *  *** SOME VALUES HAVE BEEN REPLACED ***
 *  <p>
 *  *** See Replaced Features and Supported Approach ***
 *  <p>
 *      (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    1 - Partially filled
 *  <p>    2 - Filled
 *  <p>    3 - Done for day
 *  <p>    4 - Canceled
 *  <p></p>
 *  <p>    5 - Replaced (No longer used)
 *  <p>    6 - Pending Cancel (i.e. result of Order Cancel Request)
 *  <p>    7 - Stopped
 *  <p>    8 - Rejected
 *  <p>    9 - Suspended
 *  <p></p>
 *  <p>    A - Pending New
 *  <p>    B - Calculated
 *  <p>    C - Expired
 *  <p>    D - Accepted for Bidding
 *  <p>    E - Pending Replace (i.e. result of Order Cancel/Replace Request)
 */
public class Tag39EnuOrdStatus extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum39OrdStatus dataValue;

    public final static Enum39OrdStatus TESTA_ENU_ORDER_STATUS
            = Enum39OrdStatus.NEW;
    public final static Enum39OrdStatus TESTB_ENU_ORDER_STATUS
            = Enum39OrdStatus.ACCEPTED_FOR_BIDDING;

    public Tag39EnuOrdStatus(Enum39OrdStatus dataValue) {
        setFixType(FIX27.FIX39_ENU_ORD_STATUS);
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
        System.out.println( new Tag39EnuOrdStatus(TESTA_ENU_ORDER_STATUS).toVerboseString() );
        System.out.println( new Tag39EnuOrdStatus(TESTB_ENU_ORDER_STATUS).toVerboseString() );

        // loop around the ENUM and display
        for (Enum39OrdStatus oneEnum : Enum39OrdStatus.values()) {
            System.out.println( new Tag39EnuOrdStatus(oneEnum).toVerboseString() );
        }
    }
}
