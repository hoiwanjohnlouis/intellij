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
import com.hwtsllc.fixengine2022.datatypes.MyEnumAllocRejCode;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  776 (same as 88, 776)
 *  IndividualAllocRejCode
 *  Identified reason for rejecting an individual AllocAccount (79) detail.
 *        Same values as  AllocRejCode (88)
 *  Valid values:
 *      0 - Unknown account(s)
 *      1 - Incorrect quantity
 *      2 - Incorrect average price
 *      3 - Unknown executing broker mnemonic
 *      4 - Commission difference
 *      5 - Unknown OrderID (37)
 *      6 - Unknown ListID (66)
 *      7 - Other (further in Text (58))
 *      8 - Incorrect allocated quantity
 *      9 - Calculation difference
 *      10 - Unknown or stale ExecID
 *      11 - Mismatched data
 *      12 - Unknown ClOrdID
 *      13 - Warehouse request rejected
 */
public class Tag776EnuIndividualAllocRejCode extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumAllocRejCode dataValue;

    public final static MyEnumAllocRejCode TESTA_ENU_INDIVIDUAL_ALLOC_REJ_CODE
            = MyEnumAllocRejCode.CALCULATION_DIFFERENCE;
    public final static MyEnumAllocRejCode TESTB_ENU_INDIVIDUAL_ALLOC_REJ_CODE
            = MyEnumAllocRejCode.MISMATCHED_DATA;

    public Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode dataValue) {
        setFixType(FIX44.FIX776_ENU_INDIVIDUAL_ALLOC_REJ_CODE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
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
        Tag776EnuIndividualAllocRejCode tagData;

        tagData = new Tag776EnuIndividualAllocRejCode(TESTA_ENU_INDIVIDUAL_ALLOC_REJ_CODE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag776EnuIndividualAllocRejCode(TESTB_ENU_INDIVIDUAL_ALLOC_REJ_CODE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
