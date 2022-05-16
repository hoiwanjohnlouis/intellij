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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1083DisplayWhen;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1083
 *  DisplayWhen
 *  char
 *  <p>
 *  Instructs when to refresh DisplayQty (1138).
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Immediate (after each fill)
 *  <p>    2 - Exhaust (when DisplayQty = 0)
 */
class Tag1083EnuDisplayWhenTest {
    @Test
    void FIX1083Test() {
        FIX50 fixData = FIX50.FIX1083_ENU_DISPLAY_WHEN;
        assertEquals( "1083", fixData.toFIXIDString());
        assertEquals( "DISPLAY_WHEN", fixData.toFIXNameString());
        assertEquals( "DisplayWhen", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1083Test() {
        Tag1083EnuDisplayWhen tagData;

        tagData = new Tag1083EnuDisplayWhen( Enum1083DisplayWhen.IMMEDIATE );
        assertEquals( Enum1083DisplayWhen.IMMEDIATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1083EnuDisplayWhen( Enum1083DisplayWhen.EXHAUST );
        assertEquals( Enum1083DisplayWhen.EXHAUST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}