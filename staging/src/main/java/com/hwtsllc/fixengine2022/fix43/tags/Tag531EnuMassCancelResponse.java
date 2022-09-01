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
import com.hwtsllc.fixengine2022.fix43.enums.Enum531MassCancelResponse;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  531
 *  MassCancelResponse
 *  char
 *  <p></p>
 *  Specifies the action taken by counterparty order handling system
 *  as a result of the Order Mass Cancel Request
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Cancel Request Rejected - See MassCancelRejectReason (532)
 *  <p>    1 - Cancel orders for a security
 *  <p>    2 - Cancel orders for an Underlying Security
 *  <p>    3 - Cancel orders for a Product
 *  <p>    4 - Cancel orders for a CFICode
 *  <p></p>
 *  <p>    5 - Cancel orders for a SecurityType
 *  <p>    6 - Cancel orders for a trading session
 *  <p>    7 - Cancel All Orders
 */
public class Tag531EnuMassCancelResponse extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum531MassCancelResponse dataValue;

    public final static Enum531MassCancelResponse TESTA_ENU_MASS_CANCEL_RESPONSE
            = Enum531MassCancelResponse.CANCEL_ALL_ORDERS;
    public final static Enum531MassCancelResponse TESTB_ENU_MASS_CANCEL_RESPONSE
            = Enum531MassCancelResponse.CANCEL_ORDERS_FOR_SECURITYTYPE;

    public Tag531EnuMassCancelResponse(Enum531MassCancelResponse dataValue) {
        setFixType(FIX43.FIX531_ENU_MASS_CANCEL_RESPONSE);
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
        Tag531EnuMassCancelResponse tagData;

        tagData = new Tag531EnuMassCancelResponse(TESTA_ENU_MASS_CANCEL_RESPONSE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag531EnuMassCancelResponse(TESTB_ENU_MASS_CANCEL_RESPONSE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum531MassCancelResponse oneEnum : Enum531MassCancelResponse.values()) {
            System.out.println( new Tag531EnuMassCancelResponse(oneEnum).toVerboseString() );
        }
    }
}
