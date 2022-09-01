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
import com.hwtsllc.fixengine2022.fix50.enums.Enum992IndividualAllocType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  992
 *  IndividualAllocType
 *  int
 *  <p>
 *  Identifies whether the allocation is to be sub-allocated or allocated to a third party
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Sub Allocate
 *  <p>    2 - Third Party Allocation
 */
public class Tag992EnuIndividualAllocType extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum992IndividualAllocType dataValue;

    public final static Enum992IndividualAllocType TESTA_ENU_INDIVIDUAL_ALLOC_TYPE
            = Enum992IndividualAllocType.SUB_ALLOCATE;
    public final static Enum992IndividualAllocType TESTB_ENU_INDIVIDUAL_ALLOC_TYPE
            = Enum992IndividualAllocType.THIRD_PARTY_ALLOCATION;

    public Tag992EnuIndividualAllocType(Enum992IndividualAllocType dataValue) {
        setFixType(FIX50.FIX992_ENU_INDIVIDUAL_ALLOC_TYPE);
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
        Tag992EnuIndividualAllocType tagData;

        tagData = new Tag992EnuIndividualAllocType(TESTA_ENU_INDIVIDUAL_ALLOC_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag992EnuIndividualAllocType(TESTB_ENU_INDIVIDUAL_ALLOC_TYPE);
        System.out.println(tagData.toVerboseString());
    }
}
