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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine2022.fix41.enums.Enum160SettlInstMode;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  160
 *  SettlInstMode
 *  char
 *  <p></p>
 *  Indicates mode used for Settlement Instructions message.
 *  <p></p>
 *  *** SOME VALUES HAVE BEEN REPLACED - See "Replaced Features and Supported Approach" ***
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Default (Replaced)
 *  <p>    1 - Standing Instructions Provided
 *  <p>    2 - Specific Allocation Account Overriding (Replaced)
 *  <p>    3 - Specific Allocation Account Standing (Replaced)
 *  <p>    4 - Specific Order for a single account (for CIV)
 *  <p></p>
 *  <p>    5 - Request reject
 */
public class Tag160EnuSettlInstMode extends FIX41Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum160SettlInstMode dataValue;

    public final static Enum160SettlInstMode TESTA_ENU_SETTL_INST_MODE
            = Enum160SettlInstMode.DEFAULT;
    public final static Enum160SettlInstMode TESTB_ENU_SETTL_INST_MODE
            = Enum160SettlInstMode.REQUEST_REJECT;

    public Tag160EnuSettlInstMode(Enum160SettlInstMode dataValue) {
        setFixType(FIX41.FIX160_ENU_SETTL_INST_MODE);
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
        System.out.println( new Tag160EnuSettlInstMode(TESTA_ENU_SETTL_INST_MODE).toVerboseString() );
        System.out.println( new Tag160EnuSettlInstMode(TESTB_ENU_SETTL_INST_MODE).toVerboseString() );

        // loop around the ENUM and display
        for (Enum160SettlInstMode oneEnum : Enum160SettlInstMode.values()) {
            System.out.println( new Tag160EnuSettlInstMode(oneEnum).toVerboseString() );
        }
    }
}
