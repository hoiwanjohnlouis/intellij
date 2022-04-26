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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.fix41.enums.Enum160SettlInstMode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag160EnuSettlInstModeTest {
    @Test
    void FIX0160Test() {
        FIX41 fixData = FIX41.FIX160_ENU_SETTL_INST_MODE;
        assertEquals( "160", fixData.getID());
        assertEquals( "SETTL_INST_MODE", fixData.getName());
        assertEquals( "SettlInstMode", fixData.getDescription());
        assertNotEquals( FIX41.JUNK_ID, fixData.getID());
        assertNotEquals( FIX41.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0160Test() {
        Tag160EnuSettlInstMode tagData;

        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.DEFAULT);
        assertEquals( Enum160SettlInstMode.DEFAULT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.STANDING_INSTRUCTIONS_PROVIDED);
        assertEquals( Enum160SettlInstMode.STANDING_INSTRUCTIONS_PROVIDED.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING);
        assertEquals( Enum160SettlInstMode.SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.SPECIFIC_ALLOCATION_ACCOUNT_STANDING);
        assertEquals( Enum160SettlInstMode.SPECIFIC_ALLOCATION_ACCOUNT_STANDING.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.SPECIFIC_ORDER_SINGLE_ACCOUNT);
        assertEquals( Enum160SettlInstMode.SPECIFIC_ORDER_SINGLE_ACCOUNT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.REQUEST_REJECT);
        assertEquals( Enum160SettlInstMode.REQUEST_REJECT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}