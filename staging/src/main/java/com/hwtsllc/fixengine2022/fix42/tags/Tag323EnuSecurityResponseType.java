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
import com.hwtsllc.fixengine2022.fix42.enums.Enum323SecurityResponseType;
import com.hwtsllc.fixengine2022.interfaces.LogEnumString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  323
 *  Enu
 *  SecurityResponseType
 *
 *      1-6 msg types
 *      ACCEPT_SECURITY_AS_IS( "1", "ACCEPT_SECURITY_AS_IS",
 *                          "1 - Accept security proposal as-is" ),
 *      ACCEPT_SECURITY_REVISIONS( "2", "ACCEPT_SECURITY_REVISIONS",
 *                          "2 - Accept security proposal with revisions as indicated in the message" ),
 *      LIST_OF_SECURITY_TYPES_RETURNED( "3", "LIST_OF_SECURITY_TYPES_RETURNED",
 *                          "3 - List of security types returned per request" ),
 *      LIST_OF_SECURITIES_RETURNED_PER_REQUEST( "4", "LIST_OF_SECURITIES_RETURNED_PER_REQUEST",
 *                          "4 - List of securities returned per request" ),
 *      REJECT_SECURITY_PROPOSAL( "5", "REJECT_SECURITY_PROPOSAL",
 *                          "5 - Reject security proposal" ),
 *      CANNOT_MATCH_SELECTION( "6", "CANNOT_MATCH_SELECTION",
 *                          "6 - Cannot match selection criteria" ),
 */
public class Tag323EnuSecurityResponseType extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogEnumString {
    private final Enum323SecurityResponseType dataValue;

    public final static Enum323SecurityResponseType TESTA_ENU_SECURITY_RESPONSE_TYPE
            = Enum323SecurityResponseType.LIST_OF_SECURITY_TYPES_RETURNED;
    public final static Enum323SecurityResponseType TESTB_ENU_SECURITY_RESPONSE_TYPE
            = Enum323SecurityResponseType.LIST_OF_SECURITIES_RETURNED_PER_REQUEST;

    public Tag323EnuSecurityResponseType(Enum323SecurityResponseType dataValue) {
        setFixType(FIX42.FIX323_ENU_SECURITY_RESPONSE_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
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
     * wrapper to return the description of the underlying ENUM data
     */
    @Override
    public String toEnumString() {
        return this.dataValue.getDescription();
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
        Tag323EnuSecurityResponseType tagData;

        tagData = new Tag323EnuSecurityResponseType(TESTA_ENU_SECURITY_RESPONSE_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toEnumString());

        tagData = new Tag323EnuSecurityResponseType(TESTB_ENU_SECURITY_RESPONSE_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toEnumString());
    }
}
