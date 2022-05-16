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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix41.enums.Enum163SettlInstTransType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  163
 *  SettlInstTransType
 *  char
 *  <p>
 *  Settlement Instructions message transaction type
 *  <p></p>
 *  Valid values:
 *  <p>    N - New
 *  <p>    C - Cancel
 *  <p>    R - Replace
 *  <p>    T - Restate
 */
class Tag163EnuSettlInstTransTypeTest {
    @Test
    void FIX0163Test() {
        FIX41 fixData = FIX41.FIX163_ENU_SETTL_INST_TRANS_TYPE;
        assertEquals( "163", fixData.toFIXIDString());
        assertEquals( "SETTL_INST_TRANS_TYPE", fixData.toFIXNameString());
        assertEquals( "SettlInstTransType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0163Test() {
        Tag163EnuSettlInstTransType tagData;

        tagData = new Tag163EnuSettlInstTransType(Enum163SettlInstTransType.NEW);
        assertEquals( Enum163SettlInstTransType.NEW.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag163EnuSettlInstTransType(Enum163SettlInstTransType.CANCEL);
        assertEquals( Enum163SettlInstTransType.CANCEL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag163EnuSettlInstTransType(Enum163SettlInstTransType.REPLACE);
        assertEquals( Enum163SettlInstTransType.REPLACE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag163EnuSettlInstTransType(Enum163SettlInstTransType.RESTATE);
        assertEquals( Enum163SettlInstTransType.RESTATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}