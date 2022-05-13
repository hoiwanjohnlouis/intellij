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
import com.hwtsllc.fixengine2022.fix27.enums.Enum5AdvTransType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  5
 *  AdvTransType
 *  String
 *  Identifies advertisement message transaction type
 *  Valid values:
 *      N - New
 *      C - Cancel
 *      R - Replace
 */
class Tag5Enu5AdvTransTypeTest {
    @Test
    void FIX0005Test() {
        FIX27 fixData = FIX27.FIX5_ENU_ADV_TRANS_TYPE;
        assertEquals( "ADV_TRANS_TYPE", fixData.getName());
        assertEquals( "5", fixData.getID());
        assertEquals( "Enum5AdvTransType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0005Test() {
        Tag5EnuAdvTransType tagData;

        tagData = new Tag5EnuAdvTransType(Enum5AdvTransType.NEW);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag5EnuAdvTransType(Enum5AdvTransType.CANCEL);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag5EnuAdvTransType(Enum5AdvTransType.REPLACE);
        assertEquals( "R", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}