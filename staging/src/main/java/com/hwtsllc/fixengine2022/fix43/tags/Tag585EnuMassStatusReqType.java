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
import com.hwtsllc.fixengine2022.fix43.enums.Enum585MassStatusReqType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  585
 *  MassStatusReqType
 *  int
 *  <p></p>
 *  Mass Status Request Type
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Status for orders for a Security
 *  <p>    2 - Status for orders for an Underlying Security
 *  <p>    3 - Status for orders for a Product
 *  <p>    4 - Status for orders for a CFICode
 *  <p>    5 - Status for orders for a SecurityType
 *  <p></p>
 *  <p>    6 - Status for orders for a trading session
 *  <p>    7 - Status for all orders
 *  <p>    8 - Status for orders for a PartyID
 */
public class Tag585EnuMassStatusReqType extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum585MassStatusReqType dataValue;

    public final static Enum585MassStatusReqType TESTA_ENU_MASS_STATUS_REQ_TYPE
            = Enum585MassStatusReqType.STATUS_ORDERS_FOR_CFICODE;
    public final static Enum585MassStatusReqType TESTB_ENU_MASS_STATUS_REQ_TYPE
            = Enum585MassStatusReqType.STATUS_ORDERS_FOR_PARTYID;

    public Tag585EnuMassStatusReqType(Enum585MassStatusReqType dataValue) {
        setFixType(FIX43.FIX585_ENU_MASS_STATUS_REQ_TYPE);
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
        Tag585EnuMassStatusReqType tagData;

        tagData = new Tag585EnuMassStatusReqType(TESTA_ENU_MASS_STATUS_REQ_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());

        tagData = new Tag585EnuMassStatusReqType(TESTB_ENU_MASS_STATUS_REQ_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());
    }
}
