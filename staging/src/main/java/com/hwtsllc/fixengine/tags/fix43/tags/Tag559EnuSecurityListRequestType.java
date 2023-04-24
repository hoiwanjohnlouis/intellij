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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.fix43.enums.Enum559SecurityListRequestType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  559
 *  SecurityListRequestType
 *  int
 *  <p></p>
 *  Identifies the type/criteria of Security List Request
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Symbol
 *  <p>    1 - SecurityType and/or CFICode
 *  <p>    2 - Product
 *  <p>    3 - TradingSessionID
 *  <p>    4 - All Securities
 */
public class Tag559EnuSecurityListRequestType extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum559SecurityListRequestType dataValue;

    public final static Enum559SecurityListRequestType TESTA_ENU_SECURITY_LIST_REQUEST_TYPE
            = Enum559SecurityListRequestType.TRADING_SESSION_ID;
    public final static Enum559SecurityListRequestType TESTB_ENU_SECURITY_LIST_REQUEST_TYPE
            = Enum559SecurityListRequestType.SECURITY_TYPE;

    public Tag559EnuSecurityListRequestType(Enum559SecurityListRequestType dataValue) {
        setFixType(FIX43.FIX559_ENU_SECURITY_LIST_REQUEST_TYPE);
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
        Tag559EnuSecurityListRequestType tagData;

        tagData = new Tag559EnuSecurityListRequestType(TESTA_ENU_SECURITY_LIST_REQUEST_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag559EnuSecurityListRequestType(TESTB_ENU_SECURITY_LIST_REQUEST_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum559SecurityListRequestType oneEnum : Enum559SecurityListRequestType.values()) {
            System.out.println( new Tag559EnuSecurityListRequestType(oneEnum).toVerboseString() );
        }
    }
}
