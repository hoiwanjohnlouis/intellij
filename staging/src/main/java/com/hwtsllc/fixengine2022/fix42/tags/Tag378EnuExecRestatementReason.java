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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.fix42.enums.Enum378ExecRestatementReason;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  378
 *  ExecRestatementReason
 *  int
 *  <p>
 *  Code to identify reason for an ExecutionRpt message sent with
 *  ExecType=Restated or used when communicating an unsolicited cancel.
 *  <p></p>
 *  Valid values:
 *  <p>     0 - GT corporate action
 *  <p>     1 - GT renewal / restatement (no corporate action)
 *  <p>     2 - Verbal change
 *  <p>     3 - Repricing of order
 *  <p>     4 - Broker option
 *  <p></p>
 *  <p>     5 - Partial decline of OrderQty (e.g. exchange initiated partial cancel)
 *  <p>     6 - Cancel on Trading Halt
 *  <p>     7 - Cancel on System Failure
 *  <p>     8 - Market (Exchange) option
 *  <p>     9 - Canceled, not best
 *  <p></p>
 *  <p>     10 - Warehouse Recap
 *  <p>     11 - Peg Refresh
 *  <p>     99 - Other
 *  <p>     or any value conforming to the data type Reserved100Plus
 */
public class Tag378EnuExecRestatementReason extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum378ExecRestatementReason dataValue;

    public final static Enum378ExecRestatementReason TESTA_ENU_EXEC_RESTATEMENT_REASON
            = Enum378ExecRestatementReason.GT_RENEWAL_RESTATEMENT;
    public final static Enum378ExecRestatementReason TESTB_ENU_EXEC_RESTATEMENT_REASON
            = Enum378ExecRestatementReason.CANCEL_ON_SYSTEM_FAILURE;

    public Tag378EnuExecRestatementReason(Enum378ExecRestatementReason dataValue) {
        setFixType(FIX42.FIX378_ENU_EXEC_RESTATEMENT_REASON);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toEnumNameString();
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
        Tag378EnuExecRestatementReason tagData;

        tagData = new Tag378EnuExecRestatementReason(TESTA_ENU_EXEC_RESTATEMENT_REASON);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag378EnuExecRestatementReason(TESTB_ENU_EXEC_RESTATEMENT_REASON);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum378ExecRestatementReason oneEnum : Enum378ExecRestatementReason.values()) {
            System.out.println( new Tag378EnuExecRestatementReason(oneEnum).toVerboseString() );
        }
    }
}
