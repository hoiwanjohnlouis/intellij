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
import com.hwtsllc.fixengine2022.datatypes.MyEnumAllocRejCode;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag776EnuIndividualAllocRejCodeTest {
    @Test
    void FIX0776Test() {
        FIX44 fixData = FIX44.FIX776_ENU_INDIVIDUAL_ALLOC_REJ_CODE;
        assertEquals( "INDIVIDUAL_ALLOC_REJ_CODE", fixData.getID());
        assertEquals( "776", fixData.getName());
        assertEquals( "IndividualAllocRejCode", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0776Test() {
        Tag776EnuIndividualAllocRejCode tagData;

        /*
         * 0-13 AllocRejCode types
         */
        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.UNKNOWN_ACCOUNT);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.INCORRECT_QUANTITY);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.INCORRECT_AVERAGE_PRICE);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.UNKNOWN_EXECUTING_BROKER_MNEMONIC);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.COMMISSION_DIFFERENCE);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.UNKNOWN_ORDERID);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.UNKNOWN_LISTID);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.OTHER);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.INCORRECT_ALLOCATED_QUANTITY);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.CALCULATION_DIFFERENCE);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.UNKNOWN_OR_STALE_EXECID);
        assertEquals( "10", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.MISMATCHED_DATA);
        assertEquals( "11", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.UNKNOWN_CLORDID);
        assertEquals( "12", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.WAREHOUSE_REQUEST_REJECTED);
        assertEquals( "13", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}