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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.datatypes.MyUTCDateType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  272
 *  MDEntryDate
 *  UTCDateOnly
 *  <p>
 *  Date of Market Data Entry.
 *  <p>
 *  (prior to FIX 4.4 field was of type UTCDate)
 */
class Tag272UtcdMDEntryDateTest {
    @Test
    void FIX0272Test() {
        FIX42 fixData = FIX42.FIX272_UTCD_MD_ENTRY_DATE;
        assertEquals( "272", fixData.toFIXIDString());
        assertEquals( "MD_ENTRY_DATE", fixData.toFIXNameString());
        assertEquals( "MDEntryDate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0272Test() {
        Tag272UtcdMDEntryDate tagData;

        tagData = new Tag272UtcdMDEntryDate(new MyUTCDateType(
                Tag272UtcdMDEntryDate.TESTA_UTCD_MD_ENTRY_DATE));
        assertEquals( Tag272UtcdMDEntryDate.TESTA_UTCD_MD_ENTRY_DATE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag272UtcdMDEntryDate(new MyUTCDateType(
                Tag272UtcdMDEntryDate.TESTB_UTCD_MD_ENTRY_DATE));
        assertEquals( Tag272UtcdMDEntryDate.TESTB_UTCD_MD_ENTRY_DATE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
}