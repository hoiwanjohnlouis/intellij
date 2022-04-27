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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum216RoutingType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag433EnuListExecInstTypeTest {
    @Test
    void FIX0433Test() {
        FIX42 fixData = FIX42.FIX433_ENU_LIST_EXEC_INST_TYPE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     * 1-5 msg types
     */
    IMMEDIATE( "1", "IMMEDIATE",
                       "1 - Immediate" ),
    WAIT_FOR_EXECUTION_INSTRUCTION( "2", "WAIT_FOR_EXECUTION_INSTRUCTION",
                                            "2 - Wait for Execution Instruction (i.e. a List Execution message or " +
                                            "phone call before proceeding with execution of the list)" ),
    SELL_DRIVEN( "3", "SELL_DRIVEN",
                         "3 - Exchange/switch CIV order - Sell driven" ),
    BUY_DRIVEN_CASH_TOP_UP( "4", "BUY_DRIVEN_CASH_TOP_UP",
                                    "4 - Exchange/switch CIV order - Buy driven, cash top-up " +
                                    "(i.e. additional cash will be provided to fulfill the order)" ),
    BUY_DRIVEN_CASH_WITHDRAW( "5", "BUY_DRIVEN_CASH_WITHDRAW",
                                      "5 - Exchange/switch CIV order - Buy driven, cash withdraw " +
                                      "(i.e. additional cash will not be provided to fulfill the order)" ),
    @Test
    void Tag0433Test() {
        Tag433EnuListExecInstType tagData;

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}