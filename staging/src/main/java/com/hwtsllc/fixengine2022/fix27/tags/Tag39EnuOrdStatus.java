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
 *  Identifies current status of order.
 *
 *  *** SOME VALUES HAVE BEEN REPLACED ***
 *  *** See Replaced Features and Supported Approach ***
 *      (see Volume : "Glossary" for value definitions)
 *
 *  Valid values:
 *      0 - New
 *      1 - Partially filled
 *      2 - Filled
 *      3 - Done for day
 *      4 - Canceled
 *
 *      5 - Replaced (No longer used)
 *      6 - Pending Cancel (i.e. result of Order Cancel Request)
 *      7 - Stopped
 *      8 - Rejected
 *      9 - Suspended
 *
 *      A - Pending New
 *      B - Calculated
 *      C - Expired
 *      D - Accepted for Bidding
 *      E - Pending Replace (i.e. result of Order Cancel/Replace Request)
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
        dumpDataValues(new Tag39EnuOrdStatus(TESTA_ENU_ORDER_STATUS));
        dumpDataValues(new Tag39EnuOrdStatus(TESTB_ENU_ORDER_STATUS));

        // loop around the ENUM and display
        for (Enum39OrdStatus oneEnum : Enum39OrdStatus.values()) {
            dumpDataValues(new Tag39EnuOrdStatus(oneEnum));
        }
    }
    static void dumpDataValues(Tag39EnuOrdStatus tagData) {
        System.out.println("-------------------- Start Enum --------------------");
        System.out.println("VerboseString:" + tagData.toVerboseString());
        System.out.println("Accessing FIXTag Directly:");
        System.out.println("TagDataString:" + tagData);
        System.out.println("EnumNameString:" + tagData.toEnumNameString());
        System.out.println("FIXIDString:" + tagData.toFIXIDString());
        System.out.println("FIXNameString:" + tagData.toFIXNameString());
        System.out.println("FIXDescriptionString:" + tagData.toFIXDescriptionString());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());
        System.out.println("ValuePairString:" + tagData.toValuePairString());
        System.out.println("-------------------- End Enum --------------------");
    }
}
