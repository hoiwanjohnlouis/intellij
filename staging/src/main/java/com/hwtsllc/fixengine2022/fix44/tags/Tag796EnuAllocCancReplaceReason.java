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
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  796
 *  AllocCancReplaceReason
 *  int
 *  <p></p>
 *  Reason for cancelling or replacing an Allocation Instruction
 *  or Allocation Report message
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Original details incomplete or incorrect
 *  <p>    2 - Change in underlying order details
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public class Tag796EnuAllocCancReplaceReason extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum796AllocCancReplaceReason dataValue;

    public final static Enum796AllocCancReplaceReason TESTA_ENU_ALLOC_CANC_REPLACE_REASON
            = Enum796AllocCancReplaceReason.CHANGE_IN_UNDERLYING_ORDER;
    public final static Enum796AllocCancReplaceReason TESTB_ENU_ALLOC_CANC_REPLACE_REASON
            = Enum796AllocCancReplaceReason.ORIGINAL_DETAILS_INCOMPLETE;

    public Tag796EnuAllocCancReplaceReason(Enum796AllocCancReplaceReason dataValue) {
        setFixType(FIX44.FIX796_ENU_ALLOC_CANC_REPLACE_REASON);
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
        Tag796EnuAllocCancReplaceReason tagData;

        tagData = new Tag796EnuAllocCancReplaceReason(TESTA_ENU_ALLOC_CANC_REPLACE_REASON);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag796EnuAllocCancReplaceReason(TESTB_ENU_ALLOC_CANC_REPLACE_REASON);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum796AllocCancReplaceReason oneEnum : Enum796AllocCancReplaceReason.values()) {
            System.out.println( new Tag796EnuAllocCancReplaceReason(oneEnum).toVerboseString() );
        }
    }
}
