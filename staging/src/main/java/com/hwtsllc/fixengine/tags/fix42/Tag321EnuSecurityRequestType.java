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

package com.hwtsllc.fixengine.tags.fix42;

import com.hwtsllc.fixengine.datatypes.FIX42;
import com.hwtsllc.fixengine.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine.enums.fix42.Enum321SecurityRequestType;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  321
 *  SecurityRequestType
 *  int
 *  <p>
 *  Type of Security Definition Request.
 *  <p></p>
 *  Valid values:
 *  <p>    0-3 msg types
 *  <p>    "0 - Request Security identity and specifications"
 *  <p>    "1 - Request Security identity for the specifications provided
 *          (name of the security is not supplied)"
 *  <p>    "2 - Request List Security Types" ),
 *  <p>    "3 - Request List Securities (can be qualified with Symbol, SecurityType,
 *          TradingSessionID, SecurityExchange.
 *          If provided, then only list Securities for the specific type.)"
 */
public class Tag321EnuSecurityRequestType extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum321SecurityRequestType dataValue;

    public final static Enum321SecurityRequestType TESTA_ENU_SECURITY_REQUEST_TYPE
            = Enum321SecurityRequestType.REQUEST_LIST_SECURITY_TYPES;
    public final static Enum321SecurityRequestType TESTB_ENU_SECURITY_REQUEST_TYPE
            = Enum321SecurityRequestType.REQUEST_LIST_SECURITIES;

    public Tag321EnuSecurityRequestType(Enum321SecurityRequestType dataValue) {
        setFixType(FIX42.FIX321_ENU_SECURITY_REQUEST_TYPE);
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
        Tag321EnuSecurityRequestType tagData;

        tagData = new Tag321EnuSecurityRequestType(TESTA_ENU_SECURITY_REQUEST_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag321EnuSecurityRequestType(TESTB_ENU_SECURITY_REQUEST_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum321SecurityRequestType oneEnum : Enum321SecurityRequestType.values()) {
            System.out.println( new Tag321EnuSecurityRequestType(oneEnum).toVerboseString() );
        }
    }
}
