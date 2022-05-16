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
import com.hwtsllc.fixengine2022.fix27.enums.Enum102CxlRejReason;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  102
 *  CxlRejReason
 *  int
 *  Code to identify reason for cancel rejection.
 *  Valid values:
 *      0 - Too late to cancel
 *      1 - Unknown order
 *      2 - Broker - Exchange Option
 *      3 - Order already in Pending Cancel or Pending Replace status
 *      4 - Unable to process Order Mass Cancel Request
 *      5 - OrigOrdModTime (586) did not match last TransactTime (60) of order
 *      6 - Duplicate ClOrdID (11) received
 *      18 - Invalid price increment
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
 */
public class Tag102EnuCxlRejReason extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum102CxlRejReason dataValue;

    public final static Enum102CxlRejReason TESTA_ENU_CXL_REJ_REASON
            = Enum102CxlRejReason.TOO_LATE_TO_CANCEL;
    public final static Enum102CxlRejReason TESTB_ENU_CXL_REJ_REASON
            = Enum102CxlRejReason.OTHER;

    public Tag102EnuCxlRejReason(Enum102CxlRejReason dataValue) {
        setFixType(FIX27.FIX102_ENU_CXL_REJ_REASON);
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
        dumpDataValues(new Tag102EnuCxlRejReason(TESTA_ENU_CXL_REJ_REASON));
        dumpDataValues(new Tag102EnuCxlRejReason(TESTB_ENU_CXL_REJ_REASON));
    }
    static void dumpDataValues(Tag102EnuCxlRejReason tagData) {
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
