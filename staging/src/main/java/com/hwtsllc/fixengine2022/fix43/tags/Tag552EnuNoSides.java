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
import com.hwtsllc.fixengine2022.fix43.enums.Enum552NoSides;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  552
 *  NoSides
 *  NumInGroup
 *  <p></p>
 *  Number of Side repeating group instances.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - One Side
 *  <p>    2 - Both Sides
 */
public class Tag552EnuNoSides extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum552NoSides dataValue;

    public final static Enum552NoSides TESTA_ENU_NO_SIDES
            = Enum552NoSides.ONE_SIDE;
    public final static Enum552NoSides TESTB_ENU_NO_SIDES
            = Enum552NoSides.BOTH_SIDES;

    public Tag552EnuNoSides( Enum552NoSides dataValue) {
        setFixType(FIX43.FIX552_ENU_NO_SIDES );
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
        Tag552EnuNoSides tagData;

        tagData = new Tag552EnuNoSides( TESTA_ENU_NO_SIDES );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag552EnuNoSides( TESTB_ENU_NO_SIDES );
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum552NoSides oneEnum : Enum552NoSides.values()) {
            System.out.println( new Tag552EnuNoSides(oneEnum).toVerboseString() );
        }
    }
}
