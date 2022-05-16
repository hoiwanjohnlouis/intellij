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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  66
 *  ListID
 *  String
 *  Unique identifier for list as assigned by institution,
 *  used to associate multiple individual orders.
 *
 *  Uniqueness must be guaranteed within a single trading day.
 *  Firms which generate multi-day orders should consider embedding
 *  a date within the ListID field to assure uniqueness across days.
 */
class Tag66StrListIDTest {
    @Test
    void FIX0066Test() {
        FIX27 fixData = FIX27.FIX66_STR_LIST_ID;
        assertEquals( "LIST_ID", fixData.toFIXNameString());
        assertEquals( "66", fixData.toFIXIDString());
        assertEquals( "ListID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0066Test() {
        Tag66StrListID tagData;

        tagData = new Tag66StrListID(new MyStringType(Tag66StrListID.TESTA_STR_LIST_ID) );
        assertEquals( Tag66StrListID.TESTA_STR_LIST_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}