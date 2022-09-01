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
import com.hwtsllc.fixengine2022.datatypes.MyEnumMoveType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  835 (same as 835, 841,)
 *  PegMoveType
 *  int
 *  <p>
 *  Describes whether peg is static or floats
 *  <p></p>
 *  841
 *  DiscretionMoveType
 *  int
 *  <p>
 *  Describes whether discretionary price is static or floats
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Floating (default)
 *  <p>    1 - Fixed
 */
public class Tag835EnuPegMoveType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumMoveType dataValue;

    public final static MyEnumMoveType TESTA_ENU_PEG_MOVE_TYPE
            = MyEnumMoveType.FIXED;
    public final static MyEnumMoveType TESTB_ENU_PEG_MOVE_TYPE
            = MyEnumMoveType.FLOATING;

    public Tag835EnuPegMoveType(MyEnumMoveType dataValue) {
        setFixType(FIX44.FIX835_ENU_PEG_MOVE_TYPE);
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
        Tag835EnuPegMoveType tagData;

        tagData = new Tag835EnuPegMoveType(TESTA_ENU_PEG_MOVE_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag835EnuPegMoveType(TESTB_ENU_PEG_MOVE_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( MyEnumMoveType oneEnum : MyEnumMoveType.values()) {
            System.out.println( new Tag835EnuPegMoveType(oneEnum).toVerboseString() );
        }
    }
}
