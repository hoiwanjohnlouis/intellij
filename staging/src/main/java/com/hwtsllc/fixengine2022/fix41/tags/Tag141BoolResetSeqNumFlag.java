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
import com.hwtsllc.fixengine2022.fix41.enums.Bool141ResetSeqNumFlag;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  141
 *  ResetSeqNumFlag
 *  Boolean
 *  <p>
 *  Indicates that the both sides of the FIX session should reset sequence numbers.
 *  <p></p>
 *  Valid values:
 *  <p>    N - No
 *  <p>    Y - Yes, reset sequence numbers
 */
public class Tag141BoolResetSeqNumFlag extends FIX41Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Bool141ResetSeqNumFlag dataValue;

    public final static Bool141ResetSeqNumFlag TESTA_BOOL_RESET_SEQ_NUM_FLAG
            = Bool141ResetSeqNumFlag.NO ; // N - No
    public final static Bool141ResetSeqNumFlag TESTB_BOOL_RESET_SEQ_NUM_FLAG
            = Bool141ResetSeqNumFlag.YES; // Y - Yes, reset sequence numbers

    public Tag141BoolResetSeqNumFlag(Bool141ResetSeqNumFlag dataValue) {
        setFixType(FIX41.FIX141_BOOL_RESET_SEQ_NUM_FLAG);
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
                .concat("]");
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
        System.out.println( new Tag141BoolResetSeqNumFlag(TESTA_BOOL_RESET_SEQ_NUM_FLAG).toVerboseString() );
        System.out.println( new Tag141BoolResetSeqNumFlag(TESTB_BOOL_RESET_SEQ_NUM_FLAG).toVerboseString() );

        // loop around the ENUM and display
        for (Bool141ResetSeqNumFlag oneEnum : Bool141ResetSeqNumFlag.values()) {
            System.out.println( new Tag141BoolResetSeqNumFlag(oneEnum).toVerboseString() );
        }
    }
}
