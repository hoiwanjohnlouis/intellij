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
import com.hwtsllc.fixengine2022.fix41.enums.Enum163SettlInstTransType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag163EnuSettlInstTransTypeTest {
    @Test
    void FIX0163Test() {
        FIX41 fixData = FIX41.FIX163_ENU_SETTL_INST_TRANS_TYPE;
        assertEquals( "163", fixData.getID());
        assertEquals( "SETTL_INST_TRANS_TYPE", fixData.getName());
        assertEquals( "SettlInstTransType", fixData.getDescription());
        assertNotEquals( FIX41.JUNK_ID, fixData.getID());
        assertNotEquals( FIX41.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0163Test() {
        Tag163EnuSettlInstTransType tagData;

        tagData = new Tag163EnuSettlInstTransType(Enum163SettlInstTransType.NEW);
        assertEquals( Enum163SettlInstTransType.NEW.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag163EnuSettlInstTransType(Enum163SettlInstTransType.CANCEL);
        assertEquals( Enum163SettlInstTransType.CANCEL.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag163EnuSettlInstTransType(Enum163SettlInstTransType.REPLACE);
        assertEquals( Enum163SettlInstTransType.REPLACE.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag163EnuSettlInstTransType(Enum163SettlInstTransType.RESTATE);
        assertEquals( Enum163SettlInstTransType.RESTATE.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}