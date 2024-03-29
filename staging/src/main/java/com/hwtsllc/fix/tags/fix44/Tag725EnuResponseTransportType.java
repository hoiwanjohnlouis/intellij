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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.FIX44;
import com.hwtsllc.fix.datatypes.FIX44Abstract;
import com.hwtsllc.fix.enums.fix44.Enum725ResponseTransportType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  725
 *  ResponseTransportType
 *  int
 *  <p></p>
 *  Identifies how the response to the request should be transmitted.
 *  <p></p>
 *  Details specified via ResponseDestination (726).
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Inband - transport the request was sent over (default)
 *  <p>    1 - Out of Band - pre-arranged out-of-band delivery mechanism
 *              (i.e. FTP, HTTP, NDM, etc.) between counterparties
 */
public class Tag725EnuResponseTransportType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum725ResponseTransportType dataValue;

    public final static Enum725ResponseTransportType TESTA_ENU_RESPONSE_TRANSPORT_TYPE
            = Enum725ResponseTransportType.INBAND;
    public final static Enum725ResponseTransportType TESTB_ENU_RESPONSE_TRANSPORT_TYPE
            = Enum725ResponseTransportType.OUT_OF_BAND;

    public Tag725EnuResponseTransportType(Enum725ResponseTransportType dataValue) {
        setFixType(FIX44.FIX725_ENU_RESPONSE_TRANSPORT_TYPE);
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
        Tag725EnuResponseTransportType tagData;

        tagData = new Tag725EnuResponseTransportType(TESTA_ENU_RESPONSE_TRANSPORT_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag725EnuResponseTransportType(TESTB_ENU_RESPONSE_TRANSPORT_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum725ResponseTransportType oneEnum : Enum725ResponseTransportType.values()) {
            System.out.println( new Tag725EnuResponseTransportType(oneEnum).toVerboseString() );
        }
    }
}
