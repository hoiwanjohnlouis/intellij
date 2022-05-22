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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine2022.fix41.enums.Enum150ExecType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  150
 *  ExecType
 *  char
 *  <p>
 *  Describes the specific ExecutionRpt
 *  <p>
 *  (i.e. Pending Cancel) while OrdStatus (39) will always identify the current order status (i.e. Partially Filled)
 *  <p>
 *  *** SOME VALUES HAVE BEEN REPLACED - See "Replaced Features and Supported Approach" ***
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    3 - Done for day
 *  <p>    4 - Canceled
 *  <p>    5 - Replaced
 *  <p>    6 - Pending Cancel (e.g. result of Order Cancel Request)
 *  <p></p>
 *  <p>    7 - Stopped
 *  <p>    8 - Rejected
 *  <p>    9 - Suspended
 *  <p></p>
 *  <p>    A - Pending New
 *  <p>    B - Calculated
 *  <p>    C - Expired
 *  <p>    D - Restated (Execution Report sent unsolicited by sellside, with ExecRestatementReason (378) set)
 *  <p>    E - Pending Replace (e.g. result of Order Cancel/Replace Request)
 *  <p></p>
 *  <p>    F - Trade (partial fill or fill)
 *  <p>    G - Trade Correct
 *  <p>    H - Trade Cancel
 *  <p>    I - Order Status
 *  <p>    J - Trade in a Clearing Hold
 *  <p></p>
 *  <p>    K - Trade has been released to Clearing
 *  <p>    L - Triggered or Activated by System
 */
public class Tag150EnuExecType extends FIX41Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum150ExecType dataValue;

    public final static Enum150ExecType TESTA_ENU_EXEC_TYPE = Enum150ExecType.NEW; // fake data
    public final static Enum150ExecType TESTB_ENU_EXEC_TYPE = Enum150ExecType.DONE_FOR_DAY;

    public Tag150EnuExecType(Enum150ExecType dataValue) {
        setFixType(FIX41.FIX150_ENU_EXEC_TYPE);
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
        System.out.println( new Tag150EnuExecType(TESTA_ENU_EXEC_TYPE).toVerboseString() );
        System.out.println( new Tag150EnuExecType(TESTB_ENU_EXEC_TYPE).toVerboseString() );

        // loop around the ENUM and display
        for (Enum150ExecType oneEnum : Enum150ExecType.values()) {
            System.out.println( new Tag150EnuExecType(oneEnum).toVerboseString() );
        }
    }
}
