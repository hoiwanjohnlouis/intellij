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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  Tag373
 *  Enu
 *  SessionRejectReason
 *
 *      0-17, 99 msg types
 *      INVALID_TAG_NUMBER( "0", "INVALID_TAG_NUMBER", "0 - Invalid Tag Number" ),
 *      REQUIRED_TAG_MISSING( "1", "REQUIRED_TAG_MISSING", "1 - Required Tag Missing" ),
 *      TAG_NOT_DEFINED_FOR_MESSAGE_TYPE( "2", "TAG_NOT_DEFINED_FOR_MESSAGE_TYPE",
 *                          "2 - Tag not defined for this message type" ),
 *      UNDEFINED_TAG( "3", "UNDEFINED_TAG", "3 - Undefined tag" ),
 *      TAG_SPECIFIED_WITHOUT_A_VALUE( "4", "TAG_SPECIFIED_WITHOUT_A_VALUE",
 *                          "4 - Tag specified without a value" ),
 *      INCORRECT_VALUE_FOR_THIS_TAG( "5", "INCORRECT_VALUE_FOR_THIS_TAG",
 *                          "5 - Value is incorrect (out of range) for this tag" ),
 *      INCORRECT_DATA_FORMAT( "6", "INCORRECT_DATA_FORMAT", "6 - Incorrect data format for value" ),
 *      DECRYPTION_PROBLEM( "7", "DECRYPTION_PROBLEM", "7 - Decryption problem" ),
 *      SIGNATURE_PROBLEM( "8", "SIGNATURE_PROBLEM", "8 - Signature problem" ),
 *      COMPID_PROBLEM( "9", "COMPID_PROBLEM", "9 -  CompID problem" ),
 *      SENDINGTIME_ACCURACY_PROBLEM( "10", "SENDINGTIME_ACCURACY_PROBLEM", "10 - SendingTime Accuracy Problem" ),
 *      INVALID_MSGTYPE( "11", "INVALID_MSGTYPE", "11 - Invalid MsgType" ),
 *      XML_VALIDATION_ERROR( "12", "XML_VALIDATION_ERROR", "12 - XML Validation Error" ),
 *      DUPLICATE_TAG( "13", "DUPLICATE_TAG", "13 - Tag appears more than once" ),
 *      TAG_SPECIFIED_OUT_OF_ORDER( "14", "TAG_SPECIFIED_OUT_OF_ORDER",
 *                          "14 - Tag specified out of required order" ),
 *      REPEATING_GROUP_FIELDS_OUT_OF_ORDER( "15", "REPEATING_GROUP_FIELDS_OUT_OF_ORDER",
 *                          "15 - Repeating group fields out of order" ),
 *      INCORRECT_NUMINGROUP_COUNT( "16", "INCORRECT_NUMINGROUP_COUNT",
 *                          "16 - Incorrect NumInGroup count for repeating group" ),
 *      VALUE_INCLUDES_FIELD_DELIMITER( "17", "VALUE_INCLUDES_FIELD_DELIMITER",
 *                          "17 - Non *Data* value includes field delimiter (<SOH> character)" ),
 *      OTHER( "99", "OTHER", "99 - Other" ),
 */
public enum Enum373SessionRejectReason implements EnumAccessors, LogStringVerbose {
    /**
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
    public String getEnumName() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String getID() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String getDescription() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toLogStringVerbose() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat(getEnumName())
                .concat("]")
                .concat("\n\tAction[")
                .concat(getID())
                .concat("]")
                .concat("\n\tName[")
                .concat(getName())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(getDescription())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return getEnumName()
                .concat("=[")
                .concat(getID())
                .concat(",")
                .concat(getName())
                .concat(",")
                .concat(getDescription())
                .concat("]");
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
