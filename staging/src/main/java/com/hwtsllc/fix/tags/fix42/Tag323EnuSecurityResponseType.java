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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.FIX42;
import com.hwtsllc.fix.datatypes.FIX42Abstract;
import com.hwtsllc.fix.enums.fix42.Enum323SecurityResponseType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  323
 *  SecurityResponseType
 *  int
 *  <p>
 *  Type of Security Definition message response.
 *  <p></p>
 *  Valid values:
 *  <p>    1-6 msg types
 *  <p>    "1 - Accept security proposal as-is"
 *  <p>    "2 - Accept security proposal with revisions as indicated in the message"
 *  <p>    "3 - List of security types returned per request"
 *  <p>    "4 - List of securities returned per request"
 *  <p>    "5 - Reject security proposal"
 *  <p></p>
 *  <p>    "6 - Cannot match selection criteria"
 */
public class Tag323EnuSecurityResponseType extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum323SecurityResponseType dataValue;

    public final static Enum323SecurityResponseType TESTA_ENU_SECURITY_RESPONSE_TYPE
            = Enum323SecurityResponseType.LIST_OF_SECURITY_TYPES_RETURNED;
    public final static Enum323SecurityResponseType TESTB_ENU_SECURITY_RESPONSE_TYPE
            = Enum323SecurityResponseType.LIST_OF_SECURITIES_RETURNED_PER_REQUEST;

    public Tag323EnuSecurityResponseType(Enum323SecurityResponseType dataValue) {
        setFixType(FIX42.FIX323_ENU_SECURITY_RESPONSE_TYPE);
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
        Tag323EnuSecurityResponseType tagData;

        tagData = new Tag323EnuSecurityResponseType(TESTA_ENU_SECURITY_RESPONSE_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag323EnuSecurityResponseType(TESTB_ENU_SECURITY_RESPONSE_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum323SecurityResponseType oneEnum : Enum323SecurityResponseType.values()) {
            System.out.println( new Tag323EnuSecurityResponseType(oneEnum).toVerboseString() );
        }
    }
}
