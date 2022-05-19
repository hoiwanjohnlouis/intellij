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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum20ExecTransType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  20
 *  ExecTransType
 *  char
 *  Deprecated in FIX.4.2 Identifies transaction type
 *  Valid values:
 *      0 - New
 *      1 - Cancel
 *      2 - Correct
 *      3 - Status
 */
// @Deprecated
public class Tag20EnuExecTransType extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum20ExecTransType dataValue;

    public final static Enum20ExecTransType TESTA_ENU_EXEC_TRANS_TYPE
            = Enum20ExecTransType.NEW;
    public final static Enum20ExecTransType TESTB_ENU_EXEC_TRANS_TYPE
            = Enum20ExecTransType.STATUS;

    public Tag20EnuExecTransType(Enum20ExecTransType dataValue) {
        setFixType(FIX27.FIX20_ENU_EXEC_TRANS_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(getDataValue());
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
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to return a string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        System.out.println( new Tag20EnuExecTransType(TESTA_ENU_EXEC_TRANS_TYPE).toVerboseString() );
        System.out.println( new Tag20EnuExecTransType(TESTB_ENU_EXEC_TRANS_TYPE).toVerboseString() );

        // loop around the ENUM and display
        for (Enum20ExecTransType oneEnum : Enum20ExecTransType.values()) {
            System.out.println( new Tag20EnuExecTransType(oneEnum).toVerboseString() );
        }
    }
}
