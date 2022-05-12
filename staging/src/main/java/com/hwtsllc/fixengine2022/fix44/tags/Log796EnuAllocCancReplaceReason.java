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
import com.hwtsllc.fixengine2022.fix44.enums.Enum796AllocCancReplaceReason;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  796
 *  AllocCancReplaceReason
 *  Reason for cancelling or replacing an Allocation Instruction or Allocation Report message
 *  Valid values:
 *      1 - Original details incomplete or incorrect
 *      2 - Change in underlying order details
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
 */
public class Log796EnuAllocCancReplaceReason extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum796AllocCancReplaceReason dataValue;

    public final static Enum796AllocCancReplaceReason TESTA_ENU_ALLOC_CANC_REPLACE_REASON
            = Enum796AllocCancReplaceReason.CHANGE_IN_UNDERLYING_ORDER;
    public final static Enum796AllocCancReplaceReason TESTB_ENU_ALLOC_CANC_REPLACE_REASON
            = Enum796AllocCancReplaceReason.ORIGINAL_DETAILS_INCOMPLETE;

    public Log796EnuAllocCancReplaceReason(Enum796AllocCancReplaceReason dataValue) {
        setFixType(FIX44.FIX796_ENU_ALLOC_CANC_REPLACE_REASON);
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
        Log796EnuAllocCancReplaceReason tagData;

        tagData = new Log796EnuAllocCancReplaceReason(TESTA_ENU_ALLOC_CANC_REPLACE_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log796EnuAllocCancReplaceReason(TESTB_ENU_ALLOC_CANC_REPLACE_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
