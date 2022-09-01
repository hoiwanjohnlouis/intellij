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
import com.hwtsllc.fixengine2022.fix41.enums.Enum141ResetSeqNumFlag;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  141
 *  ResetSeqNumFlag
 *  Boolean
 *  <p></p>
 *  Indicates that the both sides of the FIX session should reset sequence numbers.
 *  <p></p>
 *  Valid values:
 *  <p>    N - No
 *  <p>    Y - Yes, reset sequence numbers
 */
public class Tag141EnuResetSeqNumFlag extends FIX41Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum141ResetSeqNumFlag dataValue;

    public final static Enum141ResetSeqNumFlag TESTA_ENU_RESET_SEQ_NUM_FLAG
            = Enum141ResetSeqNumFlag.NO ;
    public final static Enum141ResetSeqNumFlag TESTB_ENU_RESET_SEQ_NUM_FLAG
            = Enum141ResetSeqNumFlag.YES;

    public Tag141EnuResetSeqNumFlag(Enum141ResetSeqNumFlag dataValue) {
        setFixType(FIX41.FIX141_ENU_RESET_SEQ_NUM_FLAG);
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
        System.out.println( new Tag141EnuResetSeqNumFlag(TESTA_ENU_RESET_SEQ_NUM_FLAG).toVerboseString() );
        System.out.println( new Tag141EnuResetSeqNumFlag(TESTB_ENU_RESET_SEQ_NUM_FLAG).toVerboseString() );

        // loop around the ENUM and display
        for (Enum141ResetSeqNumFlag oneEnum : Enum141ResetSeqNumFlag.values()) {
            System.out.println( new Tag141EnuResetSeqNumFlag(oneEnum).toVerboseString() );
        }
    }
}
