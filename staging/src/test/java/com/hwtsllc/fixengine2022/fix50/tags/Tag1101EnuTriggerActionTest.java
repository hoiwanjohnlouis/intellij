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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1101TriggerAction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1101
 *  TriggerAction
 *  char
 *  <p>
 *  Defines the type of action to take when the trigger hits.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Activate
 *  <p>    2 - Modify
 *  <p>    3 - Cancel
 */
class Tag1101EnuTriggerActionTest {
    @Test
    void FIX1101Test() {
        FIX50 fixData = FIX50.FIX1101_ENU_TRIGGER_ACTION;
        assertEquals( "1101", fixData.toFIXIDString());
        assertEquals( "TRIGGER_ACTION", fixData.toFIXNameString());
        assertEquals( "TriggerAction", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1101Test() {
        Tag1101EnuTriggerAction tagData;

        tagData = new Tag1101EnuTriggerAction( Enum1101TriggerAction.ACTIVATE );
        assertEquals( Enum1101TriggerAction.ACTIVATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1101EnuTriggerAction( Enum1101TriggerAction.MODIFY );
        assertEquals( Enum1101TriggerAction.MODIFY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1101EnuTriggerAction( Enum1101TriggerAction.CANCEL );
        assertEquals( Enum1101TriggerAction.CANCEL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}