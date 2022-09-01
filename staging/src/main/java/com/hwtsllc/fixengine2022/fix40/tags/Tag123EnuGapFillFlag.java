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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.FIX40Abstract;
import com.hwtsllc.fixengine2022.fix40.enums.Enum123GapFillFlag;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  123
 *  GapFillFlag
 *  Boolean
 *  <p></p>
 *  Indicates that the Sequence Reset message is replacing administrative
 *  or application messages which will not be resent.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Sequence Reset, Ignore Msg Seq Num (N/A For FIXML - Not Used)
 *  <p>    Y - Gap Fill Message, Msg Seq Num Field Valid
 */
public class Tag123EnuGapFillFlag extends FIX40Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum123GapFillFlag dataValue;

    public final static Enum123GapFillFlag TESTA_ENU_GAP_FILL_FLAG
            = Enum123GapFillFlag.NO;
    public final static Enum123GapFillFlag TESTB_ENU_GAP_FILL_FLAG
            = Enum123GapFillFlag.YES;

    public Tag123EnuGapFillFlag(Enum123GapFillFlag dataValue) {
        setFixType(FIX40.FIX123_ENU_GAP_FILL_FLAG);
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
        System.out.println( new Tag123EnuGapFillFlag(TESTA_ENU_GAP_FILL_FLAG).toVerboseString() );
        System.out.println( new Tag123EnuGapFillFlag(TESTB_ENU_GAP_FILL_FLAG).toVerboseString() );

        // loop around the ENUM and display
        for (Enum123GapFillFlag oneEnum : Enum123GapFillFlag.values()) {
            System.out.println( new Tag123EnuGapFillFlag(oneEnum).toVerboseString() );
        }
    }
}
