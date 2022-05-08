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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum780AllocSettlInstType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Tag780EnuAllocSettlInstTypeTest {
    @Test
    void FIX0780Test() {
        FIX44 fixData = FIX44.FIX780_ENU_ALLOC_SETTL_INST_TYPE;
        assertEquals( "780", fixData.getID());
        assertEquals( "ALLOC_SETTL_INST_TYPE", fixData.getName());
        assertEquals( "AllocSettlInstType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0780Test() {
        Tag780EnuAllocSettlInstType tagData;

        tagData = new Tag780EnuAllocSettlInstType( Enum780AllocSettlInstType.USE_DEFAULTS );
        assertEquals( Enum780AllocSettlInstType.USE_DEFAULTS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag780EnuAllocSettlInstType( Enum780AllocSettlInstType.DERIVE_FROM_PARAMETERS );
        assertEquals( Enum780AllocSettlInstType.DERIVE_FROM_PARAMETERS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag780EnuAllocSettlInstType( Enum780AllocSettlInstType.FULL_DETAILS );
        assertEquals( Enum780AllocSettlInstType.FULL_DETAILS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag780EnuAllocSettlInstType( Enum780AllocSettlInstType.SSI_DB_ID_PROVIDED );
        assertEquals( Enum780AllocSettlInstType.SSI_DB_ID_PROVIDED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag780EnuAllocSettlInstType( Enum780AllocSettlInstType.PHONE_FOR_INSTRUCTIONS );
        assertEquals( Enum780AllocSettlInstType.PHONE_FOR_INSTRUCTIONS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}