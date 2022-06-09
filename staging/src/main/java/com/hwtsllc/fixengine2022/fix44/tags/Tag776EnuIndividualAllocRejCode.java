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
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  88 (same as 88, 776)
 *  AllocRejCode
 *  int
 *  <p>
 *  Identifies reason for rejection.
 *  <p></p>
 *  776 (same as 88, 776)
 *  IndividualAllocRejCode
 *  int
 *  <p>
 *  Identified reason for rejecting an individual AllocAccount (79) detail.
 *  <p>
 *  Same values as  AllocRejCode (88)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Unknown account(s)
 *  <p>    1 - Incorrect quantity
 *  <p>    2 - Incorrect averageg price
 *  <p>    3 - Unknown executing broker mnemonic
 *  <p>    4 - Commission difference
 *  <p>    5 - Unknown OrderID (37)
 *  <p>    6 - Unknown ListID (66)
 *  <p>    7 - Other (further in Text (58))
 *  <p>    8 - Incorrect allocated quantity
 *  <p>    9 - Calculation difference
 *  <p>    10 - Unknown or stale ExecID
 *  <p>    11 - Mismatched data
 *  <p>    12 - Unknown ClOrdID
 *  <p>    13 - Warehouse request rejected
 */
public class Tag776EnuIndividualAllocRejCode extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
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
        System.out.println(tagData.toVerboseString());

        tagData = new Tag776EnuIndividualAllocRejCode(TESTB_ENU_INDIVIDUAL_ALLOC_REJ_CODE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            System.out.println( new Tag776EnuIndividualAllocRejCode(oneEnum).toVerboseString() );
        }
    }
}
