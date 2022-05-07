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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix41.enums.Enum165SettlInstSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag165EnuSettlInstSourceTest {
    @Test
    void FIX0165Test() {
        FIX41 fixData = FIX41.FIX165_ENU_SETTL_INST_SOURCE;
        assertEquals( "165", fixData.getID());
        assertEquals( "SETTL_INST_SOURCE", fixData.getName());
        assertEquals( "SettlInstSource", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0165Test() {
        Tag165EnuSettlInstSource tagData;

        tagData = new Tag165EnuSettlInstSource(Enum165SettlInstSource.BROKER_INSTRUCTIONS);
        assertEquals( Enum165SettlInstSource.BROKER_INSTRUCTIONS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag165EnuSettlInstSource(Enum165SettlInstSource.INSTITUTION_INSTRUCTIONS);
        assertEquals( Enum165SettlInstSource.INSTITUTION_INSTRUCTIONS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag165EnuSettlInstSource(Enum165SettlInstSource.INVESTOR);
        assertEquals( Enum165SettlInstSource.INVESTOR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}