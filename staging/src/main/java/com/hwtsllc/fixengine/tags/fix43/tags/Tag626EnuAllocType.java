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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.fix43.enums.Enum626AllocType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  626
 *  AllocType
 *  int
 *  <p></p>
 *  Describes the specific type or purpose of an Allocation message
 *  (i.e. "Buyside Calculated")
 *  <p></p>
 *  (see Volume : "Glossary" for value definitions)
 *  <p>
 *  *** SOME VALUES HAVE BEEN REPLACED ***
 *  <p>
 *  *** See 'Replaced Features and Supported Approach' ***
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Calculated (includes MiscFees and NetMoney)
 *  <p>    2 - Preliminary (without MiscFees and NetMoney)
 *  <p>    3 - Sellside Calculated Using Preliminary
 *              (includes MiscFees and NetMoney) (Replaced)
 *  <p>    4 - Sellside Calculated Without Preliminary
 *              (sent unsolicited by sellside, includes MiscFees and NetMoney) (Replaced)
 *  <p>    5 - Ready-To-Book - Single Order
 *  <p></p>
 *  <p>    6 - Buyside Ready-To-Book - Combined Set of Orders (Replaced)
 *  <p>    7 - Warehouse Instruction
 *  <p>    8 - Request to Intermediary
 *  <p>    9 - Accept
 *  <p>    10 - Reject
 *  <p></p>
 *  <p>    11 - Accept Pending
 *  <p>    12 - Incomplete Group
 *  <p>    13 - Complete Group
 *  <p>    14 - Reversal Pending
 */
public class Tag626EnuAllocType extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum626AllocType dataValue;

    public final static Enum626AllocType TESTA_ENU_ALLOC_TYPE
            = Enum626AllocType.ACCEPT_PENDING;
    public final static Enum626AllocType TESTB_ENU_ALLOC_TYPE
            = Enum626AllocType.PRELIMINARY_WITHOUT_MISCFEES_NETMONEY;

    public Tag626EnuAllocType(Enum626AllocType dataValue) {
        setFixType(FIX43.FIX626_ENU_ALLOC_TYPE);
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
        return dataValue.toFIXDescriptionString();
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
        Tag626EnuAllocType tagData;

        tagData = new Tag626EnuAllocType(TESTA_ENU_ALLOC_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag626EnuAllocType(TESTB_ENU_ALLOC_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum626AllocType oneEnum : Enum626AllocType.values()) {
            System.out.println( new Tag626EnuAllocType(oneEnum).toVerboseString() );
        }
    }
}
