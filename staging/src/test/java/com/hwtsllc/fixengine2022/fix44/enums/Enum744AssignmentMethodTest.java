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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum744AssignmentMethodTest {
    /**
     *  744
     *  AssignmentMethod
     *  Method by which short positions are assigned to an exercise
     *  notice during exercise and assignment processing
     *  Valid values:
     *      P - Pro-rata
     *      R - Random
     */
    @Test
    void EnumTest() {
        Enum744AssignmentMethod enumType;

        enumType = Enum744AssignmentMethod.PRO_RATA;
        assertEquals( "P", enumType.getID());
        assertEquals( "PRO_RATA", enumType.getName());
        assertEquals( "P - Pro-rat", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum744AssignmentMethod.RANDOM;
        assertEquals( "R", enumType.getID());
        assertEquals( "RANDOM", enumType.getName());
        assertEquals( "R - Random", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());
    }
}