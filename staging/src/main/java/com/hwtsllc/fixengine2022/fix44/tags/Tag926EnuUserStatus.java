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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum926UserStatus;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  926
 *  UserStatus
 *  int
 *  <p></p>
 *  Indicates the status of a user
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Logged In
 *  <p>    2 - Not Logged In
 *  <p>    3 - User Not Recognised
 *  <p>    4 - Password Incorrect
 *  <p>    5 - Password Changed
 *  <p></p>
 *  <p>    6 - Other
 */
public class Tag926EnuUserStatus extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum926UserStatus dataValue;

    public final static Enum926UserStatus TESTA_ENU_USER_STATUS
            = Enum926UserStatus.USER_NOT_RECOGNISED;
    public final static Enum926UserStatus TESTB_ENU_USER_STATUS
            = Enum926UserStatus.PASSWORD_CHANGED;

    public Tag926EnuUserStatus(Enum926UserStatus dataValue) {
        setFixType(FIX44.FIX926_ENU_USER_STATUS);
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
        Tag926EnuUserStatus tagData;

        tagData = new Tag926EnuUserStatus(TESTA_ENU_USER_STATUS);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag926EnuUserStatus(TESTB_ENU_USER_STATUS);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum926UserStatus oneEnum : Enum926UserStatus.values()) {
            System.out.println( new Tag926EnuUserStatus(oneEnum).toVerboseString() );
        }
    }
}
