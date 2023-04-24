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
import com.hwtsllc.fixengine2022.fix42.enums.Enum373SessionRejectReason;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  373
 *  SessionRejectReason
 *  int
 *  <p>
 *  Code to identify reason for a session-level Reject message.
 *  <p></p>
 *  Valid values:
 *  <p>     0 - Invalid Tag Number
 *  <p>     1 - Required Tag Missing
 *  <p>     2 - Tag not defined for this message type
 *  <p>     3 - Undefined tag
 *  <p>     4 - Tag specified without a value
 *  <p></p>
 *  <p>     5 - Value is incorrect (out of range) for this tag
 *  <p>     6 - Incorrect data format for value
 *  <p>     7 - Decryption problem
 *  <p>     8 - Signature problem
 *  <p>     9 -  CompID problem
 *  <p></p>
 *  <p>     10 - SendingTime Accuracy Problem
 *  <p>     11 - Invalid MsgType
 *  <p>     12 - XML Validation Error
 *  <p>     13 - Tag appears more than once
 *  <p>     14 - Tag specified out of required order
 *  <p></p>
 *  <p>     15 - Repeating group fields out of order
 *  <p>     16 - Incorrect NumInGroup count for repeating group
 *  <p>     17 - Non "Data" value includes field delimiter (<SOH> character)
 *  <p>     99 - Other
 *  <p>     or any value conforming to the data type Reserved100Plus
 */
public class Tag373EnuSessionRejectReason extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum373SessionRejectReason dataValue;

    public final static Enum373SessionRejectReason TESTA_ENU_SESSION_REJECT_REASON
            = Enum373SessionRejectReason.INCORRECT_VALUE_FOR_TAG;
    public final static Enum373SessionRejectReason TESTB_ENU_SESSION_REJECT_REASON
            = Enum373SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER;

    public Tag373EnuSessionRejectReason(Enum373SessionRejectReason dataValue) {
        setFixType(FIX42.FIX373_ENU_SESSION_REJECT_REASON);
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
        Tag373EnuSessionRejectReason tagData;

        tagData = new Tag373EnuSessionRejectReason(TESTA_ENU_SESSION_REJECT_REASON);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag373EnuSessionRejectReason(TESTB_ENU_SESSION_REJECT_REASON);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum373SessionRejectReason oneEnum : Enum373SessionRejectReason.values()) {
            System.out.println( new Tag373EnuSessionRejectReason(oneEnum).toVerboseString() );
        }
    }
}
