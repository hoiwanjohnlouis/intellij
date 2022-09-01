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
import com.hwtsllc.fixengine2022.fix42.enums.Enum279MDUpdateAction;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  279
 *  MDUpdateAction
 *  char
 *  <p>
 *  Type of Market Data update action.
 *  <p></p>
 *  Valid values:
 *  <p>    0-4 msg types
 *  <p>    NEW( "0", "NEW", "0 - New" ),
 *  <p>    CHANGE( "1", "CHANGE", "1 - Change" ),
 *  <p>    DELETE( "2", "DELETE", "2 - Delete" ),
 *  <p>    DELETE_THRU( "3", "DELETE_THRU", "3 - Delete Thru" ),
 *  <p>    DELETE_FROM( "4", "DELETE_FROM", "4 - Delete From" ),
 */
public class Tag279EnuMDUpdateAction extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum279MDUpdateAction dataValue;

    public final static Enum279MDUpdateAction TESTA_ENU_MD_UPDATE_ACTION
            = Enum279MDUpdateAction.CHANGE;
    public final static Enum279MDUpdateAction TESTB_ENU_MD_UPDATE_ACTION
            = Enum279MDUpdateAction.DELETE_THRU;

    public Tag279EnuMDUpdateAction(Enum279MDUpdateAction dataValue) {
        setFixType(FIX42.FIX279_ENU_MD_UPDATE_ACTION);
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
        Tag279EnuMDUpdateAction tagData;

        tagData = new Tag279EnuMDUpdateAction(TESTA_ENU_MD_UPDATE_ACTION);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag279EnuMDUpdateAction(TESTB_ENU_MD_UPDATE_ACTION);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum279MDUpdateAction oneEnum : Enum279MDUpdateAction.values()) {
            System.out.println( new Tag279EnuMDUpdateAction(oneEnum).toVerboseString() );
        }
    }
}
