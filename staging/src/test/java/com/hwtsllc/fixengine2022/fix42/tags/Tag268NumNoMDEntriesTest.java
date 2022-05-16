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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag268NumNoMDEntriesTest {
    @Test
    void FIX0268Test() {
        FIX42 fixData = FIX42.FIX268_NUM_NO_MD_ENTRIES;
        assertEquals( "268", fixData.toFIXIDString());
        assertEquals( "NO_MD_ENTRIES", fixData.toFIXNameString());
        assertEquals( "NoMDEntries", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0268Test() {
        Tag268NumNoMDEntries tagData;

        tagData = new Tag268NumNoMDEntries(new MyNumInGroupType(
                Tag268NumNoMDEntries.TESTA_NUM_NO_MD_ENTRIES));
        assertEquals( Tag268NumNoMDEntries.TESTA_NUM_NO_MD_ENTRIES,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag268NumNoMDEntries(new MyNumInGroupType(
                Tag268NumNoMDEntries.TESTB_NUM_NO_MD_ENTRIES));
        assertEquals( Tag268NumNoMDEntries.TESTB_NUM_NO_MD_ENTRIES,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
}