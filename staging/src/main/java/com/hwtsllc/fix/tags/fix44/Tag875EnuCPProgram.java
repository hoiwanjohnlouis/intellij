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
import com.hwtsllc.fix.enums.fix44.Enum875CPProgram;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  875
 *  CPProgram
 *  int
 *  <p></p>
 *  The program under which a commercial paper is issued
 *  <p></p>
 *  Valid values:
 *  <p>    1 - 3(a)(3)
 *  <p>    2 - 4(2)
 *  <p></p>
 *  <p>    99 - Other
 *  <p></p>
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public class Tag875EnuCPProgram extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum875CPProgram dataValue;

    public final static Enum875CPProgram TESTA_ENU_CP_PROGRAM
            = Enum875CPProgram.FOUR;
    public final static Enum875CPProgram TESTB_ENU_CP_PROGRAM
            = Enum875CPProgram.OTHER;

    public Tag875EnuCPProgram(Enum875CPProgram dataValue) {
        setFixType(FIX44.FIX875_ENU_CP_PROGRAM);
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
        Tag875EnuCPProgram tagData;

        tagData = new Tag875EnuCPProgram(TESTA_ENU_CP_PROGRAM);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag875EnuCPProgram(TESTB_ENU_CP_PROGRAM);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum875CPProgram oneEnum : Enum875CPProgram.values()) {
            System.out.println( new Tag875EnuCPProgram(oneEnum).toVerboseString() );
        }
    }
}
