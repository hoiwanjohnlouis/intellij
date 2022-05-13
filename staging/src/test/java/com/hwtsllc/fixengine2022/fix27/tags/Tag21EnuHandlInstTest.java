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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix27.enums.Enum21HandlInst;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  21
 *  HandlInst
 *  char
 *  Instructions for order handling on Broker trading floor
 *  Valid values:
 *      1 - Automated execution order, private, no Broker intervention
 *      2 - Automated execution order, public, Broker intervention OK
 *      3 - Manual order, best execution
 */
class Tag21EnuHandlInstTest {
    @Test
    void FIX0021Test() {
        FIX27 fixData = FIX27.FIX21_ENU_HANDL_INST;
        assertEquals( "HANDL_INST", fixData.getName());
        assertEquals( "21", fixData.getID());
        assertEquals( "HandlInst", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0021Test() {
        Tag21EnuHandlInst tagData;

        tagData = new Tag21EnuHandlInst(Enum21HandlInst.AUTOMATIC_EXECUTION_NO_BROKER);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag21EnuHandlInst(Enum21HandlInst.AUTOMATIC_EXECUTION_BROKER_OKAY);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag21EnuHandlInst(Enum21HandlInst.MANUAL_ORDER_BEST_EXECUTION);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}