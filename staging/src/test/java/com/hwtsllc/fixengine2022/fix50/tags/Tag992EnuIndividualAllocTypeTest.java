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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix50.enums.Enum992IndividualAllocType;
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
        assertEquals( "992", fixData.getID());
        assertEquals( "INDIVIDUAL_ALLOC_TYPE", fixData.getName());
        assertEquals( "IndividualAllocType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0992Test() {
        Tag992EnuIndividualAllocType tagData;

        tagData = new Tag992EnuIndividualAllocType( Enum992IndividualAllocType.SUB_ALLOCATE );
        assertEquals( Enum992IndividualAllocType.SUB_ALLOCATE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag992EnuIndividualAllocType( Enum992IndividualAllocType.THIRD_PARTY_ALLOCATION );
        assertEquals( Enum992IndividualAllocType.THIRD_PARTY_ALLOCATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}