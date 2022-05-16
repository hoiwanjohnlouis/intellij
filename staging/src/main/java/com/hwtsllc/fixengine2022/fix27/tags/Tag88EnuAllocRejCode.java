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
public class Tag88EnuAllocRejCode extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumAllocRejCode dataValue;

    public final static MyEnumAllocRejCode TESTA_ENU_ALLOC_STATUS
            = MyEnumAllocRejCode.UNKNOWN_ACCOUNT;
    public final static MyEnumAllocRejCode TESTB_ENU_ALLOC_STATUS
            = MyEnumAllocRejCode.CALCULATION_DIFFERENCE;

    public Tag88EnuAllocRejCode(MyEnumAllocRejCode dataValue) {
        setFixType(FIX27.FIX88_ENU_ALLOC_REJ_CODE);
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
        dumpDataValues(new Tag88EnuAllocRejCode(TESTA_ENU_ALLOC_STATUS));
        dumpDataValues(new Tag88EnuAllocRejCode(TESTB_ENU_ALLOC_STATUS));
    }
    static void dumpDataValues(Tag88EnuAllocRejCode tagData) {
        System.out.println("-------------------- Start Enum --------------------");
        System.out.println("VerboseString:" + tagData.toVerboseString());
        System.out.println("Accessing FIXTag Directly:");
        System.out.println("TagDataString:" + tagData);
        System.out.println("EnumNameString:" + tagData.toEnumNameString());
        System.out.println("FIXIDString:" + tagData.toFIXIDString());
        System.out.println("FIXNameString:" + tagData.toFIXNameString());
        System.out.println("FIXDescriptionString:" + tagData.toFIXDescriptionString());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());
        System.out.println("ValuePairString:" + tagData.toValuePairString());
        System.out.println("-------------------- End Enum --------------------");
    }
}