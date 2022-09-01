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
import com.hwtsllc.fixengine2022.fix27.enums.Enum71AllocTransType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  71
 *  AllocTransType
 *  char
 *  <p></p>
 *  Identifies allocation transaction type
 *  <p></p>
 *  <p> *** SOME VALUES HAVE BEEN REPLACED ***
 *  <p> *** See Replaced Features and Supported Approach ***
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    1 - Replace
 *  <p>    2 - Cancel
 *  <p>    3 - Preliminary (without MiscFees and NetMoney) (Removed/Replaced)
 *  <p>    4 - Calculated (includes MiscFees and NetMoney) (Removed/Replaced)
 *  <p></p>
 *  <p>    5 - Calculated without Preliminary
 *          (sent unsolicited by broker, includes MiscFees and NetMoney)
 *          (Removed-Replaced)
 *  <p>    6 - Reversal
 */
public class Tag71EnuAllocTransType extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum71AllocTransType dataValue;

    public final static Enum71AllocTransType TESTA_ENU_ALLOC_TRANS_TYPE
            = Enum71AllocTransType.NEW;
    public final static Enum71AllocTransType TESTB_ENU_ALLOC_TRANS_TYPE
            = Enum71AllocTransType.REVERSAL;

    public Tag71EnuAllocTransType(Enum71AllocTransType dataValue) {
        setFixType(FIX27.FIX71_ENU_ALLOC_TRANS_TYPE);
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
        return dataValue.toFIXNameString();
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
        System.out.println( new Tag71EnuAllocTransType(TESTA_ENU_ALLOC_TRANS_TYPE).toVerboseString() );
        System.out.println( new Tag71EnuAllocTransType(TESTB_ENU_ALLOC_TRANS_TYPE).toVerboseString() );

        // loop around the ENUM and display
        for (Enum71AllocTransType oneEnum : Enum71AllocTransType.values()) {
            System.out.println( new Tag71EnuAllocTransType(oneEnum).toVerboseString() );
        }
    }
}