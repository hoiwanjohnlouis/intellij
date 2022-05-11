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
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

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
public class Tag992EnuIndividualAllocType extends FIX50Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum992IndividualAllocType dataValue;

    public final static Enum992IndividualAllocType TESTA_ENU_INDIVIDUAL_ALLOC_TYPE
            = Enum992IndividualAllocType.SUB_ALLOCATE;
    public final static Enum992IndividualAllocType TESTB_ENU_INDIVIDUAL_ALLOC_TYPE
            = Enum992IndividualAllocType.THIRD_PARTY_ALLOCATION;

    public Tag992EnuIndividualAllocType(Enum992IndividualAllocType dataValue) {
        setFixType(FIX50.FIX992_ENU_INDIVIDUAL_ALLOC_TYPE);
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
        Tag992EnuIndividualAllocType tagData;

        tagData = new Tag992EnuIndividualAllocType(TESTA_ENU_INDIVIDUAL_ALLOC_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag992EnuIndividualAllocType(TESTB_ENU_INDIVIDUAL_ALLOC_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
