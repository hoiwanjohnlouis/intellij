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
import com.hwtsllc.fix.enums.fix44.Enum924UserRequestType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  924
 *  UserRequestType
 *  int
 *  <p></p>
 *  Indicates the action required by a User Request Message
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Log On User
 *  <p>    2 - Log Off User
 *  <p>    3 - Change Password For User
 *  <p>    4 - Request Individual User Status
 */
public class Tag924EnuUserRequestType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum924UserRequestType dataValue;

    public final static Enum924UserRequestType TESTA_ENU_USER_REQUEST_TYPE
            = Enum924UserRequestType.REQUEST_STATUS;
    public final static Enum924UserRequestType TESTB_ENU_USER_REQUEST_TYPE
            = Enum924UserRequestType.LOG_OFF;

    public Tag924EnuUserRequestType(Enum924UserRequestType dataValue) {
        setFixType(FIX44.FIX924_ENU_USER_REQUEST_TYPE);
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
        Tag924EnuUserRequestType tagData;

        tagData = new Tag924EnuUserRequestType(TESTA_ENU_USER_REQUEST_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag924EnuUserRequestType(TESTB_ENU_USER_REQUEST_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum924UserRequestType oneEnum : Enum924UserRequestType.values()) {
            System.out.println( new Tag924EnuUserRequestType(oneEnum).toVerboseString() );
        }
    }
}
