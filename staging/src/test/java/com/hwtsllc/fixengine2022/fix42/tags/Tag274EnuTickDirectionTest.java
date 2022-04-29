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
import com.hwtsllc.fixengine2022.fix42.enums.Enum274TickDirection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag274EnuTickDirectionTest {
    @Test
    void FIX0274Test() {
        FIX42 fixData = FIX42.FIX274_ENU_TICK_DIRECTION;
        assertEquals( "274", fixData.getID());
        assertEquals( "TICK_DIRECTION", fixData.getName());
        assertEquals( "TickDirection", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  274
     *  TickDirection
     *      0-3 msg types
     *      "0 - Plus Tick"
     *      "1 - Zero-Plus Tick"
     *      "2 - Minus Tick"
     *      "3 - Zero-Minus Tick"
     */
    @Test
    void Tag0274Test() {
        Tag274EnuTickDirection tagData;

        /**
         * 0-3 msg types
         */
        tagData = new Tag274EnuTickDirection(Enum274TickDirection.PLUS_TICK);
        assertEquals( Enum274TickDirection.PLUS_TICK.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag274EnuTickDirection(Enum274TickDirection.ZERO_PLUS_TICK);
        assertEquals( Enum274TickDirection.ZERO_PLUS_TICK.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag274EnuTickDirection(Enum274TickDirection.MINUS_TICK);
        assertEquals( Enum274TickDirection.MINUS_TICK.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag274EnuTickDirection(Enum274TickDirection.ZERO_MINUS_TICK);
        assertEquals( Enum274TickDirection.ZERO_MINUS_TICK.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}