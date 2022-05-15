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
import com.hwtsllc.fixengine2022.fix44.enums.Enum722PosMaintStatus;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  722
 *  PosMaintStatus
 *  Status of Position Maintenance Request
 *  Valid values:
 *      0 - Accepted
 *      1 - Accepted With Warnings
 *      2 - Rejected
 *      3 - Completed
 *      4 - Completed With Warnings
 */
public class Tag722EnuPosMaintStatus extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum722PosMaintStatus dataValue;

    public final static Enum722PosMaintStatus TESTA_ENU_POS_MAINT_STATUS
            = Enum722PosMaintStatus.ACCEPTED_WITH_WARNINGS;
    public final static Enum722PosMaintStatus TESTB_ENU_POS_MAINT_STATUS
            = Enum722PosMaintStatus.REJECTED;

    public Tag722EnuPosMaintStatus(Enum722PosMaintStatus dataValue) {
        setFixType(FIX44.FIX722_ENU_POS_MAINT_STATUS);
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
        Tag722EnuPosMaintStatus tagData;

        tagData = new Tag722EnuPosMaintStatus(TESTA_ENU_POS_MAINT_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag722EnuPosMaintStatus(TESTB_ENU_POS_MAINT_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}