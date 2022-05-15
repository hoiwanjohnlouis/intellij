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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  984
 *  NoUnderlyingAmounts
 *  NumInGroup
 *  <p>
 *  Total number of occurrences of Amount to pay in order to receive the underlying instrument
 */
class Tag984NumNoUnderlyingAmountsTest {
    @Test
    void FIX0984Test() {
        FIX50 fixData = FIX50.FIX984_NUM_NO_UNDERLYING_AMOUNTS;
        assertEquals( "984", fixData.getID());
        assertEquals( "NO_UNDERLYING_AMOUNTS", fixData.getName());
        assertEquals( "NoUnderlyingAmounts", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0984Test() {
        Tag984NumNoUnderlyingAmounts tagData;

        tagData = new Tag984NumNoUnderlyingAmounts(
                new MyNumInGroupType( Tag984NumNoUnderlyingAmounts.TESTA_NUM_NO_UNDERLYING_AMOUNTS ));
        assertEquals( Tag984NumNoUnderlyingAmounts.TESTA_NUM_NO_UNDERLYING_AMOUNTS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag984NumNoUnderlyingAmounts(
                new MyNumInGroupType( Tag984NumNoUnderlyingAmounts.TESTB_NUM_NO_UNDERLYING_AMOUNTS ));
        assertEquals( Tag984NumNoUnderlyingAmounts.TESTB_NUM_NO_UNDERLYING_AMOUNTS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
}