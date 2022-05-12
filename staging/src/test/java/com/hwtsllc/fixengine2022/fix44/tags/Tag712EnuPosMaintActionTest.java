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
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0712Test() {
        Log712EnuPosMaintAction tagData;

    }
}