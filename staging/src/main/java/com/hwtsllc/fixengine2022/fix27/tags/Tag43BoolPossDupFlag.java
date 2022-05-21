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
import com.hwtsllc.fixengine2022.fix27.enums.Bool43PossDupFlag;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  43
 *  PossDupFlag
 *  Boolean
 *  <p>
 *  Indicates possible retransmission of message with this sequence number
 *  <p></p>
 *  Valid values:
 *  <p>    N - Original transmission
 *  <p>    Y - Possible duplicate
 */
public class Tag43BoolPossDupFlag extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Bool43PossDupFlag dataValue;

    public final static Bool43PossDupFlag TESTA_BOOL_POSS_DUP_FLAG
            = Bool43PossDupFlag.NO;
    public final static Bool43PossDupFlag TESTB_BOOL_POSS_DUP_FLAG
            = Bool43PossDupFlag.YES;

    public Tag43BoolPossDupFlag(Bool43PossDupFlag dataValue) {
        setFixType(FIX27.FIX43_BOOL_POSS_DUP_FLAG);
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
        System.out.println( new Tag43BoolPossDupFlag(TESTA_BOOL_POSS_DUP_FLAG).toVerboseString() );
        System.out.println( new Tag43BoolPossDupFlag(TESTB_BOOL_POSS_DUP_FLAG).toVerboseString() );

        // loop around the ENUM and display
        for (Bool43PossDupFlag oneEnum : Bool43PossDupFlag.values()) {
            System.out.println( new Tag43BoolPossDupFlag(oneEnum).toVerboseString() );
        }
    }
}
