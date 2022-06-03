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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum514RegistTransType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  514
 *  RegistTransType
 *  char
 *  <p></p>
 *  Identifies Registration Instructions transaction type
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    2 - Cancel
 *  <p>    1 - Replace
 */
class Tag514EnuRegistTransTypeTest {
    @Test
    void FIX0514Test() {
        FIX43 fixData = FIX43.FIX514_ENU_REGIST_TRANS_TYPE;
        assertEquals( "514", fixData.toFIXIDString());
        assertEquals( "REGIST_TRANS_TYPE", fixData.toFIXNameString());
        assertEquals( "RegistTransType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0514Test() {
        Tag514EnuRegistTransType tagData;

        /*
         * 0-2 types
         */
        tagData = new Tag514EnuRegistTransType( Enum514RegistTransType.NEW );
        assertEquals( Enum514RegistTransType.NEW.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag514EnuRegistTransType( Enum514RegistTransType.REPLACE );
        assertEquals( Enum514RegistTransType.REPLACE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag514EnuRegistTransType( Enum514RegistTransType.CANCEL );
        assertEquals( Enum514RegistTransType.CANCEL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}