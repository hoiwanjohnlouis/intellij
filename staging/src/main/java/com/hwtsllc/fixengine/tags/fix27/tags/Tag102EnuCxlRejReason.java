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

package com.hwtsllc.fixengine.tags.fix27.tags;

import com.hwtsllc.fixengine.datatypes.FIX27;
import com.hwtsllc.fixengine.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine.tags.fix27.enums.Enum102CxlRejReason;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  102
 *  CxlRejReason
 *  int
 *  <p></p>
 *  Code to identify reason for cancel rejection.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Too late to cancel
 *  <p>    1 - Unknown order
 *  <p>    2 - Broker - Exchange Option
 *  <p>    3 - Order already in Pending Cancel or Pending Replace status
 *  <p>    4 - Unable to process Order Mass Cancel Request
 *  <p></p>
 *  <p>    5 - OrigOrdModTime (586) did not match last TransactTime (60) of order
 *  <p>    6 - Duplicate ClOrdID (11) received
 *  <p>    18 - Invalid price increment
 *  <p>    99 - Other
 *  <p></p>
 *  <p>    Or any value conforming to the data type Reserved100Plus
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
        System.out.println( new Tag102EnuCxlRejReason(TESTA_ENU_CXL_REJ_REASON).toVerboseString() );
        System.out.println( new Tag102EnuCxlRejReason(TESTB_ENU_CXL_REJ_REASON).toVerboseString() );

        // loop around the ENUM and display
        for (Enum102CxlRejReason oneEnum : Enum102CxlRejReason.values()) {
            System.out.println( new Tag102EnuCxlRejReason(oneEnum).toVerboseString() );
        }
    }
}
