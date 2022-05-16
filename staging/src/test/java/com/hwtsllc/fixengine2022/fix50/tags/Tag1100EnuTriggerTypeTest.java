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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1100TriggerType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1100
 *  TriggerType
 *  char
 *  <p>
 *  Defines when the trigger will hit,
 *  i.e. the action specified by the trigger instructions will come into effect.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Partial Execution
 *  <p>    2 - Specified Trading Session
 *  <p>    3 - Next Auction
 *  <p>    4 - Price Movement
 */
class Tag1100EnuTriggerTypeTest {
    @Test
    void FIX1100Test() {
        FIX50 fixData = FIX50.FIX1100_ENU_TRIGGER_TYPE;
        assertEquals( "1100", fixData.toFIXIDString());
        assertEquals( "TRIGGER_TYPE", fixData.toFIXNameString());
        assertEquals( "TriggerType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1100Test() {
        Tag1100EnuTriggerType tagData;

        tagData = new Tag1100EnuTriggerType( Enum1100TriggerType.PARTIAL_EXECUTION );
        assertEquals( Enum1100TriggerType.PARTIAL_EXECUTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1100EnuTriggerType( Enum1100TriggerType.SPECIFIED_SESSION );
        assertEquals( Enum1100TriggerType.SPECIFIED_SESSION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1100EnuTriggerType( Enum1100TriggerType.NEXT_AUCTION );
        assertEquals( Enum1100TriggerType.NEXT_AUCTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1100EnuTriggerType( Enum1100TriggerType.PRICE_MOVEMENT );
        assertEquals( Enum1100TriggerType.PRICE_MOVEMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}