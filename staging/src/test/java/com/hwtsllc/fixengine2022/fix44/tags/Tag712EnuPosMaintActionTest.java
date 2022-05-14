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
import com.hwtsllc.fixengine2022.fix44.enums.Enum712PosMaintAction;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  712
 *  PosMaintAction
 *  Maintenance Action to be performed.
 *  Valid values:
 *      1 - New - used to increment the overall transaction quantity
 *      2 - Replace - used to override the overall transaction quantity
 *                      or specifically add messages based on the reference ID
 *      3 - Cancel - used to remove the overall transaction or specific
 *                      add messages based on reference ID
 *      4 - Reverse - used to completely back-out the transaction
 *                      such that the transaction never existed
 */
class Tag712EnuPosMaintActionTest {
    @Test
    void FIX0712Test() {
        FIX44 fixData = FIX44.FIX712_ENU_POS_MAINT_ACTION;
        assertEquals( "712", fixData.getID());
        assertEquals( "POS_MAINT_ACTION", fixData.getName());
        assertEquals( "PosMaintAction", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0712Test() {
        Tag712EnuPosMaintAction tagData;

        tagData = new Tag712EnuPosMaintAction( Enum712PosMaintAction.NEW );
        assertEquals( Enum712PosMaintAction.NEW.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag712EnuPosMaintAction( Enum712PosMaintAction.REPLACE );
        assertEquals( Enum712PosMaintAction.REPLACE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag712EnuPosMaintAction( Enum712PosMaintAction.CANCEL );
        assertEquals( Enum712PosMaintAction.CANCEL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag712EnuPosMaintAction( Enum712PosMaintAction.REVERSE );
        assertEquals( Enum712PosMaintAction.REVERSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}