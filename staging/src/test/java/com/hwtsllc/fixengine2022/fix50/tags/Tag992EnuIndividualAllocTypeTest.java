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
import com.hwtsllc.fixengine2022.fix50.enums.Enum992IndividualAllocType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Tag992EnuIndividualAllocTypeTest {
    @Test
    void FIX0992Test() {
        FIX50 fixData = FIX50.FIX992_ENU_INDIVIDUAL_ALLOC_TYPE;
        assertEquals( "992", fixData.toEnumIDString());
        assertEquals( "INDIVIDUAL_ALLOC_TYPE", fixData.toEnumNameString());
        assertEquals( "IndividualAllocType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0992Test() {
        Tag992EnuIndividualAllocType tagData;

        tagData = new Tag992EnuIndividualAllocType( Enum992IndividualAllocType.SUB_ALLOCATE );
        assertEquals( Enum992IndividualAllocType.SUB_ALLOCATE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag992EnuIndividualAllocType( Enum992IndividualAllocType.THIRD_PARTY_ALLOCATION );
        assertEquals( Enum992IndividualAllocType.THIRD_PARTY_ALLOCATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag992EnuIndividualAllocType tagData;

        // loop around the ENUM and process
        for ( Enum992IndividualAllocType oneEnum : Enum992IndividualAllocType.values()) {
            tagData = new Tag992EnuIndividualAllocType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag992EnuIndividualAllocType tagData;

        // loop around the ENUM and process
        for (Enum992IndividualAllocType oneEnum : Enum992IndividualAllocType.values()) {
            tagData = new Tag992EnuIndividualAllocType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag992EnuIndividualAllocType tagData;

        // loop around the ENUM and process
        for (Enum992IndividualAllocType oneEnum : Enum992IndividualAllocType.values()) {
            tagData = new Tag992EnuIndividualAllocType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag992EnuIndividualAllocType tagData;

        // loop around the ENUM and process
        for (Enum992IndividualAllocType oneEnum : Enum992IndividualAllocType.values()) {
            tagData = new Tag992EnuIndividualAllocType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag992EnuIndividualAllocType tagData;

        // loop around the ENUM and process
        for (Enum992IndividualAllocType oneEnum : Enum992IndividualAllocType.values()) {
            tagData = new Tag992EnuIndividualAllocType(oneEnum);
            assertEquals( "Tag992EnuIndividualAllocType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}