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
import com.hwtsllc.fixengine2022.fix44.enums.Enum787DlvyInstType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  787
 *  DlvyInstType
 *  char
 *  <p></p>
 *  Used to indicate whether a delivery instruction is used for securities
 *  or cash settlement.
 *  <p></p>
 *  Valid values:
 *  <p>    C - Cash
 *  <p>    S - Securities
 */
public class Tag787EnuDlvyInstType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum787DlvyInstType dataValue;

    public final static Enum787DlvyInstType TESTA_ENU_DLVY_INST_TYPE
            = Enum787DlvyInstType.CASH;
    public final static Enum787DlvyInstType TESTB_ENU_DLVY_INST_TYPE
            = Enum787DlvyInstType.SECURITIES;

    public Tag787EnuDlvyInstType(Enum787DlvyInstType dataValue) {
        setFixType(FIX44.FIX787_ENU_DLVY_INST_TYPE);
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
        Tag787EnuDlvyInstType tagData;

        tagData = new Tag787EnuDlvyInstType(TESTA_ENU_DLVY_INST_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag787EnuDlvyInstType(TESTB_ENU_DLVY_INST_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum787DlvyInstType oneEnum : Enum787DlvyInstType.values()) {
            System.out.println( new Tag787EnuDlvyInstType(oneEnum).toVerboseString() );
        }
    }
}
