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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix27.enums.Enum81ProcessCode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  81
 *  ProcessCode
 *  char
 *  Processing code for sub-account.
 *  Absence of this field in AllocAccount (79), AllocPrice (366),
 *  AllocQty (80), ProcessCode instance indicates regular trade.
 *  Valid values:
 *      0 - Regular
 *      1 - Soft Dollar
 *      2 - Step-In
 *      3 - Step-Out
 *      4 - Soft-dollar Step-In
 *      5 - Soft-dollar Step-Out
 *      6 - Plan Sponsor
 */
class Tag81EnuProcessCodeTest {

    @Test
    void FIX0081Test() {
        FIX27 fixData = FIX27.FIX81_ENU_PROCESS_CODE;
        assertEquals( "PROCESS_CODE", fixData.getName());
        assertEquals( "81", fixData.getID());
        assertEquals( "ProcessCode", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0081Test() {
        Tag81EnuProcessCode tagData;

        /*
         * 0-6 AllocRejCode types
         */
        tagData = new Tag81EnuProcessCode(Enum81ProcessCode.REGULAR);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag81EnuProcessCode(Enum81ProcessCode.SOFT_DOLLAR);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag81EnuProcessCode(Enum81ProcessCode.STEP_IN);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag81EnuProcessCode(Enum81ProcessCode.STEP_OUT);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag81EnuProcessCode(Enum81ProcessCode.SOFT_DOLLAR_STEP_IN);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag81EnuProcessCode(Enum81ProcessCode.SOFT_DOLLAR_STEP_OUT);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag81EnuProcessCode(Enum81ProcessCode.PLAN_SPONSOR);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}