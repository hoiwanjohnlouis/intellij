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
import com.hwtsllc.fixengine2022.fix50.enums.Enum975UnderlyingSettlementType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  975
 *  UnderlyingSettlementType
 *  int
 *  <p>
 *  Indicates order settlement period for the underlying instrument.
 *  <p></p>
 *  Valid values:
 *  <p>    2 - T+1
 *  <p>    4 - T+3
 *  <p>    5 - T+4
 */
class Tag975EnuUnderlyingSettlementTypeTest {
    @Test
    void FIX0975Test() {
        FIX50 fixData = FIX50.FIX975_ENU_UNDERLYING_SETTLEMENT_TYPE;
        assertEquals( "975", fixData.getID());
        assertEquals( "UNDERLYING_SETTLEMENT_TYPE", fixData.getName());
        assertEquals( "UnderlyingSettlementType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0975Test() {
        Tag975EnuUnderlyingSettlementType tagData;

        tagData = new Tag975EnuUnderlyingSettlementType( Enum975UnderlyingSettlementType.T_PLUS_1 );
        assertEquals( Enum975UnderlyingSettlementType.T_PLUS_1.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag975EnuUnderlyingSettlementType( Enum975UnderlyingSettlementType.T_PLUS_3 );
        assertEquals( Enum975UnderlyingSettlementType.T_PLUS_3.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag975EnuUnderlyingSettlementType( Enum975UnderlyingSettlementType.T_PLUS_4 );
        assertEquals( Enum975UnderlyingSettlementType.T_PLUS_4.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}