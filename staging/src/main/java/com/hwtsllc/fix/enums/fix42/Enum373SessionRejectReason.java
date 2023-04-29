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

package com.hwtsllc.fix.enums.fix42;

import com.hwtsllc.fix.interfaces.LogFIXString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

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
public enum Enum373SessionRejectReason implements LogFIXString, LogVerboseString {
    /*
     * 0-17, 99 msg types
     */
    INVALID_TAG_NUMBER( "0", "INVALID_TAG_NUMBER", "0 - Invalid Tag Number" ),
    REQUIRED_TAG_MISSING( "1", "REQUIRED_TAG_MISSING", "1 - Required Tag Missing" ),
    TAG_NOT_DEFINED_FOR_MESSAGE_TYPE( "2", "TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE", "2 - Tag not defined for this message type" ),
    UNDEFINED_TAG( "3", "UNDEFINED_TAG", "3 - Undefined tag" ),
    TAG_SPECIFIED_WITHOUT_A_VALUE( "4", "TAG_SPECIFIED_WITHOUT_A_VALUE", "4 - Tag specified without a value" ),

    INCORRECT_VALUE_FOR_TAG( "5", "INCORRECT_VALUE_FOR_THIS_TAG", "5 - Value is incorrect (out of range) for this tag" ),
    INCORRECT_DATA_FORMAT( "6", "INCORRECT_DATA_FORMAT", "6 - Incorrect data format for value" ),
    DECRYPTION_PROBLEM( "7", "DECRYPTION_PROBLEM", "7 - Decryption problem" ),
    SIGNATURE_PROBLEM( "8", "SIGNATURE_PROBLEM", "8 - Signature problem" ),
    COMPID_PROBLEM( "9", "COMPID_PROBLEM", "9 -  CompID problem" ),

    SENDINGTIME_ACCURACY_PROBLEM( "10", "SENDINGTIME_ACCURACY_PROBLEM", "10 - SendingTime Accuracy Problem" ),
    INVALID_MSGTYPE( "11", "INVALID_MSGTYPE", "11 - Invalid MsgType" ),
    XML_VALIDATION_ERROR( "12", "XML_VALIDATION_ERROR", "12 - XML Validation Error" ),
    DUPLICATE_TAG( "13", "DUPLICATE_TAG", "13 - Tag appears more than once" ),
    TAG_SPECIFIED_OUT_OF_ORDER( "14", "TAG_SPECIFIED_OUT_OF_ORDER", "14 - Tag specified out of required order" ),

    REPEATING_GROUP_FIELDS_OUT_OF_ORDER( "15", "REPEATING_GROUP_FIELDS_OUT_OF_ORDER", "15 - Repeating group fields out of order" ),
    INCORRECT_NUMINGROUP_COUNT( "16", "INCORRECT_NUMINGROUP_COUNT", "16 - Incorrect NumInGroup count for repeating group" ),
    VALUE_INCLUDES_FIELD_DELIMITER( "17", "VALUE_INCLUDES_FIELD_DELIMITER", "17 - Non *Data* value includes field delimiter (<SOH> character)" ),
    OTHER( "99", "OTHER", "99 - Other" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum373SessionRejectReason(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toFIXLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toFIXIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toFIXNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toFIXDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat( toFIXLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toFIXDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return id;
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum373SessionRejectReason oneEnum : Enum373SessionRejectReason.values()) {
            System.out.println(oneEnum);
        }
    }
}
