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
import com.hwtsllc.fixengine2022.fix42.enums.Enum274TickDirection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  274
 *  TickDirection
 *  char
 *  <p>
 *  Direction of the "tick".
 *  <p></p>
 *  Valid values:
 *  <p>    "0 - Plus Tick"
 *  <p>    "1 - Zero-Plus Tick"
 *  <p>    "2 - Minus Tick"
 *  <p>    "3 - Zero-Minus Tick"
 */
class Tag274EnuTickDirectionTest {
    @Test
    void FIX0274Test() {
        FIX42 fixData = FIX42.FIX274_ENU_TICK_DIRECTION;
        assertEquals( "274", fixData.toFIXIDString());
        assertEquals( "TICK_DIRECTION", fixData.toFIXNameString());
        assertEquals( "TickDirection", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0274Test() {
        Tag274EnuTickDirection tagData;

        /*
         * 0-3 msg types
         */
        tagData = new Tag274EnuTickDirection(Enum274TickDirection.PLUS_TICK);
        assertEquals( Enum274TickDirection.PLUS_TICK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag274EnuTickDirection(Enum274TickDirection.ZERO_PLUS_TICK);
        assertEquals( Enum274TickDirection.ZERO_PLUS_TICK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag274EnuTickDirection(Enum274TickDirection.MINUS_TICK);
        assertEquals( Enum274TickDirection.MINUS_TICK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag274EnuTickDirection(Enum274TickDirection.ZERO_MINUS_TICK);
        assertEquals( Enum274TickDirection.ZERO_MINUS_TICK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}