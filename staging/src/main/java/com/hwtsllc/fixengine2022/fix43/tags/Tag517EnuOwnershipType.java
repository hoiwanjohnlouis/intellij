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
import com.hwtsllc.fixengine2022.fix43.enums.Enum517OwnershipType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  517
 *  OwnershipType
 *  char
 *  <p></p>
 *  The relationship between Registration parties.
 *  <p></p>
 *  Valid values:
 *  <p>    J - Joint Investors
 *  <p>    T - Tenants in Common
 *  <p>    2 - Joint Trustees
 */
public class Tag517EnuOwnershipType extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum517OwnershipType dataValue;

    public final static Enum517OwnershipType TESTA_ENU_OWNERSHIP_TYPE
            = Enum517OwnershipType.JOINT_INVESTORS;
    public final static Enum517OwnershipType TESTB_ENU_OWNERSHIP_TYPE
            = Enum517OwnershipType.TENANTS_IN_COMMON;

    public Tag517EnuOwnershipType(Enum517OwnershipType dataValue) {
        setFixType(FIX43.FIX517_ENU_OWNERSHIP_TYPE);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toEnumNameString();
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
        Tag517EnuOwnershipType tagData;

        tagData = new Tag517EnuOwnershipType(TESTA_ENU_OWNERSHIP_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag517EnuOwnershipType(TESTB_ENU_OWNERSHIP_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum517OwnershipType oneEnum : Enum517OwnershipType.values()) {
            System.out.println( new Tag517EnuOwnershipType(oneEnum).toVerboseString() );
        }
    }
}
