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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.fix42.enums.Enum265MDUpdateType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  265
 *  MDUpdateType
 *  int
 *  <p>
 *  Specifies the type of Market Data update.
 *  <p></p>
 *  Valid values:
 *  <p>    "0 - Full refresh"
 *  <p>    "1 - Incremental refresh"
 */
public class Tag265EnuMDUpdateType extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum265MDUpdateType dataValue;

    public final static Enum265MDUpdateType TESTA_ENU_MD_UPDATE_TYPE
            = Enum265MDUpdateType.FULL_REFRESH;
    public final static Enum265MDUpdateType TESTB_ENU_MD_UPDATE_TYPE
            = Enum265MDUpdateType.INCREMENTAL_REFRESH;

    public Tag265EnuMDUpdateType(Enum265MDUpdateType dataValue) {
        setFixType(FIX42.FIX265_ENU_MD_UPDATE_TYPE);
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
        Tag265EnuMDUpdateType tagData;

        tagData = new Tag265EnuMDUpdateType(TESTA_ENU_MD_UPDATE_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag265EnuMDUpdateType(TESTB_ENU_MD_UPDATE_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum265MDUpdateType oneEnum : Enum265MDUpdateType.values()) {
            System.out.println( new Tag265EnuMDUpdateType(oneEnum).toVerboseString() );
        }
    }
}
