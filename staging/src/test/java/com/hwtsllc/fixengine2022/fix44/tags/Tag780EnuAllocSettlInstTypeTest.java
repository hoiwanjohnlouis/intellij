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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.fix44.enums.Enum780AllocSettlInstType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag780EnuAllocSettlInstTypeTest {
    @Test
    void FIX0780Test() {
        FIX44 fixData = FIX44.FIX780_ENU_ALLOC_SETTL_INST_TYPE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  780
     *  AllocSettlInstType
     *  Used to indicate whether settlement instructions are provided on an
     *  allocation instruction message, and if not, how they are to be derived.
     *  Valid values:
     *      0 - Use default instructions
     *      1 - Derive from parameters provided
     *      2 - Full details provided
     *      3 - SSI DB IDs provided
     *      4 - Phone for instructions
     */
    @Test
    void Tag0780Test() {
        Tag780EnuAllocSettlInstType tagData;

        tagData = Enum780AllocSettlInstType.USE_DEFAULTS;
        tagData = Enum780AllocSettlInstType.DERIVE_FROM_PARAMETERS;
        tagData = Enum780AllocSettlInstType.FULL_DETAILS;
        tagData = Enum780AllocSettlInstType.SSI_DB_ID_PROVIDED;
        tagData = Enum780AllocSettlInstType.PHONE_FOR_INSTRUCTIONS;
    }
}