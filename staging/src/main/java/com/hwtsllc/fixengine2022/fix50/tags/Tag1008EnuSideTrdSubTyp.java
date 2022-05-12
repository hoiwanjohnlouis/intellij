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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1008SideTrdSubTyp;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1008
 *  SideTrdSubTyp
 *  int
 *  <p>
 *  Used on a multi-sided trade to specify the type of trade for a given side
 *  <p></p>
 *  Valid values:
 *  <p>    0 - CMTA
 *  <p>    1 - Internal Transfer
 *  <p>    2 - External Transfer
 *  <p>    3 - Reject for Submitting Trade
 *  <p>    4 - Advisory for Contra Side
 *  <p></p>
 *  <p>    5 - Offset due to an allocation
 *  <p>    6 - Onset due to an allocation
 *  <p>    7 - Differential Spread
 *  <p>    8 - Implied Spread leg executed against an outright
 *  <p>    9 - Transaction from Exercise
 *  <p></p>
 *  <p>    10 - Transaction from Assignment
 */
public class Tag1008EnuSideTrdSubTyp extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final Enum1008SideTrdSubTyp dataValue;

    public final static Enum1008SideTrdSubTyp TESTA_ENU_SIDE_TRD_SUB_TYP
            = Enum1008SideTrdSubTyp.ADVISORY_FOR_CONTRA;
    public final static Enum1008SideTrdSubTyp TESTB_ENU_SIDE_TRD_SUB_TYP
            = Enum1008SideTrdSubTyp.REJECT_SUBMISSION;

    public Tag1008EnuSideTrdSubTyp(Enum1008SideTrdSubTyp dataValue) {
        setFixType(FIX50.FIX1008_ENU_SIDE_TRD_SUB_TYP);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
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
     * standard wrapper to format a simple string describing the data
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
        Tag1008EnuSideTrdSubTyp tagData;

        tagData = new Tag1008EnuSideTrdSubTyp(TESTA_ENU_SIDE_TRD_SUB_TYP);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag1008EnuSideTrdSubTyp(TESTB_ENU_SIDE_TRD_SUB_TYP);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
