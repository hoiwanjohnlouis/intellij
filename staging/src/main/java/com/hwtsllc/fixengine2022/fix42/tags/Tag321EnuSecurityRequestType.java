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
import com.hwtsllc.fixengine2022.fix42.enums.Enum321SecurityRequestType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  321
 *  Enu
 *  SecurityRequestType
 *
 *      0-3 msg types
 *      REQUEST_SECURITY_IDENTITY( "0", "REQUEST_SECURITY_IDENTITY",
 *                          "0 - Request Security identity and specifications" ),
 *      REQUEST_SPECIFIED_SECURITY( "1", "REQUEST_SPECIFIED_SECURITY",
 *                          "1 - Request Security identity for the specifications provided " +
 *                          "(name of the security is not supplied)" ),
 *      REQUEST_LIST_SECURITY_TYPES( "2", "REQUEST_LIST_SECURITY_TYPES",
 *                          "2 - Request List Security Types" ),
 *      REQUEST_LIST_SECURITIES( "3", "REQUEST_LIST_SECURITIES",
 *                          "3 - Request List Securities (can be qualified with Symbol, SecurityType, " +
 *                          "TradingSessionID, SecurityExchange. " +
 *                          "If provided, then only list Securities for the specific type.)" ),
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
        Tag321EnuSecurityRequestType tagData;

        tagData = new Tag321EnuSecurityRequestType(TESTA_ENU_SECURITY_REQUEST_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());

        tagData = new Tag321EnuSecurityRequestType(TESTB_ENU_SECURITY_REQUEST_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());
    }
}
