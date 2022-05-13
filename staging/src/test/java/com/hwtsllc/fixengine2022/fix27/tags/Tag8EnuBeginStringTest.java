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
import com.hwtsllc.fixengine2022.fix27.enums.Enum8BeginString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  8
 *  BeginString
 *  String
 *  Identifies beginning of new message and protocol version.
 *  ALWAYS FIRST FIELD IN MESSAGE.
 *  ALWAYS UNENCRYPTED.
 *  Valid values:
 *
 *      FIX.2.7
 *      FIX.3.0
 *      FIX.4.0
 *      FIX.4.1
 *      FIX.4.2
 *
 *      FIX.4.3
 *      FIX.4.4
 *      FIXT.1.1
 */
class Tag8EnuBeginStringTest {
    @Test
    void FIX0008Test() {
        FIX27 fixData = FIX27.FIX8_ENU_BEGIN_STRING;
        assertEquals( "BEGIN_STRING", fixData.getName());
        assertEquals( "8", fixData.getID());
        assertEquals( "BeginString", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0008Test() {
        Tag8EnuBeginString tagData;

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_2_7);
        assertEquals( Enum8BeginString.BEGIN_STRING_2_7.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_3_0);
        assertEquals( Enum8BeginString.BEGIN_STRING_3_0.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_4_0);
        assertEquals( Enum8BeginString.BEGIN_STRING_4_0.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_4_1);
        assertEquals( Enum8BeginString.BEGIN_STRING_4_1.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_4_2);
        assertEquals( Enum8BeginString.BEGIN_STRING_4_2.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_4_3);
        assertEquals( Enum8BeginString.BEGIN_STRING_4_3.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_4_4);
        assertEquals( Enum8BeginString.BEGIN_STRING_4_4.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_5_0);
        assertEquals( Enum8BeginString.BEGIN_STRING_5_0.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}