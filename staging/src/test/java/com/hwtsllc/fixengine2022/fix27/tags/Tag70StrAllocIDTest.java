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
 *  70
 *  AllocID
 *  String
 *  <p>
 *  Unique identifier for allocation message.
 *  <p>
 *  (Prior to FIX 4.1 this field was of type int)
 */
class Tag70StrAllocIDTest {
    @Test
    void FIX0070Test() {
        FIX27 fixData = FIX27.FIX70_STR_ALLOC_ID;
        assertEquals( "ALLOC_ID", fixData.toFIXNameString());
        assertEquals( "70", fixData.toFIXIDString());
        assertEquals( "AllocID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0070Test() {
        Tag70StrAllocID tagData;

        tagData = new Tag70StrAllocID(new MyStringType(Tag70StrAllocID.TESTA_STR_ALLOC_ID) );
        assertEquals( Tag70StrAllocID.TESTA_STR_ALLOC_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}