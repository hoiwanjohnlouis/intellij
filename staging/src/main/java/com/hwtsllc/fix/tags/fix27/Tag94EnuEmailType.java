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

package com.hwtsllc.fix.tags.fix27;

import com.hwtsllc.fix.datatypes.FIX27;
import com.hwtsllc.fix.datatypes.FIX27Abstract;
import com.hwtsllc.fix.enums.fix27.Enum94EmailType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  94
 *  EmailType
 *  char
 *  <p></p>
 *  Email message type.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    1 - Reply
 *  <p>    2 - Admin Reply
 */
public class Tag94EnuEmailType extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum94EmailType dataValue;

    public final static Enum94EmailType TESTA_ENU_EMAIL_TYPE
            = Enum94EmailType.NEW;
    public final static Enum94EmailType TESTB_ENU_EMAIL_TYPE
            = Enum94EmailType.ADMIN_REPLY;

    public Tag94EnuEmailType(Enum94EmailType dataValue) {
        setFixType(FIX27.FIX94_ENU_EMAIL_TYPE);
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
        System.out.println( new Tag94EnuEmailType(TESTA_ENU_EMAIL_TYPE).toVerboseString() );
        System.out.println( new Tag94EnuEmailType(TESTB_ENU_EMAIL_TYPE).toVerboseString() );

        // loop around the ENUM and display
        for (Enum94EmailType oneEnum : Enum94EmailType.values()) {
            System.out.println( new Tag94EnuEmailType(oneEnum).toVerboseString() );
        }
    }
}