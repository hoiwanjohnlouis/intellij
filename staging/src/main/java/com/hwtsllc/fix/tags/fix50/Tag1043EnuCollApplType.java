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

package com.hwtsllc.fix.tags.fix50;

import com.hwtsllc.fix.datatypes.FIX50;
import com.hwtsllc.fix.datatypes.FIX50Abstract;
import com.hwtsllc.fix.enums.fix50.Enum1043CollApplType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  1043
 *  CollApplType
 *  int
 *  <p>
 *  conveys how the collateral should be/has been applied
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Specific Deposit
 *  <p>    1 - General
 */
public class Tag1043EnuCollApplType extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum1043CollApplType dataValue;

    public final static Enum1043CollApplType TESTA_ENU_COLL_APPL_TYPE
            = Enum1043CollApplType.GENERAL;
    public final static Enum1043CollApplType TESTB_ENU_COLL_APPL_TYPE
            = Enum1043CollApplType.SPECIFIC_DEPOSIT;

    public Tag1043EnuCollApplType(Enum1043CollApplType dataValue) {
        setFixType(FIX50.FIX1043_ENU_COLL_APPL_TYPE);
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
        Tag1043EnuCollApplType tagData;

        tagData = new Tag1043EnuCollApplType(TESTA_ENU_COLL_APPL_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1043EnuCollApplType(TESTB_ENU_COLL_APPL_TYPE);
        System.out.println(tagData.toVerboseString());
    }
}
