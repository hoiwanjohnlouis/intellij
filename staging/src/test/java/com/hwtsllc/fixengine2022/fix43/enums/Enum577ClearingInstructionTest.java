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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum577ClearingInstructionTest {
    /**
     *  Information is the same for TAGS 577
     */
    @Test
    void Enum0577Test() {
        Enum577ClearingInstruction enumType;

        /*
         *  0-13 types
         */
        enumType = Enum577ClearingInstruction.PROCESS_NORMALLY;
        assertEquals( "0", enumType.getID());
        assertEquals( "PROCESS_NORMALLY", enumType.getName());
        assertEquals( "0 - Process normally", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum577ClearingInstruction.EXCLUDE_ALL_NETTING;
        assertEquals( "1", enumType.getID());
        assertEquals( "EXCLUDE_ALL_NETTING", enumType.getName());
        assertEquals( "1 - Exclude from all netting", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum577ClearingInstruction.BILATERAL_NETTING_ONLY;
        assertEquals( "2", enumType.getID());
        assertEquals( "BILATERAL_NETTING_ONLY", enumType.getName());
        assertEquals( "2 - Bilateral netting only", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum577ClearingInstruction.EX_CLEARING;
        assertEquals( "3", enumType.getID());
        assertEquals( "EX_CLEARING", enumType.getName());
        assertEquals( "3 - Ex clearing", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum577ClearingInstruction.SPECIAL_TRADE;
        assertEquals( "4", enumType.getID());
        assertEquals( "SPECIAL_TRADE", enumType.getName());
        assertEquals( "4 - Special trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum577ClearingInstruction.MULTILATERAL_NETTING;
        assertEquals( "5", enumType.getID());
        assertEquals( "MULTILATERAL_NETTING", enumType.getName());
        assertEquals( "5 - Multilateral netting", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum577ClearingInstruction.CLEAR_AGAINST_CENTRAL_COUNTERPARTY;
        assertEquals( "6", enumType.getID());
        assertEquals( "CLEAR_AGAINST_CENTRAL_COUNTERPARTY", enumType.getName());
        assertEquals( "6 - Clear against central counterparty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum577ClearingInstruction.EXCLUDE_FROM_CENTRAL_COUNTERPARTY;
        assertEquals( "7", enumType.getID());
        assertEquals( "EXCLUDE_FROM_CENTRAL_COUNTERPARTY", enumType.getName());
        assertEquals( "7 - Exclude from central counterparty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum577ClearingInstruction.MANUAL;
        assertEquals( "8", enumType.getID());
        assertEquals( "MANUAL", enumType.getName());
        assertEquals( "8 - Manual mode (pre-posting and/or pre-giveup)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum577ClearingInstruction.AUTOMATIC_POSTING;
        assertEquals( "9", enumType.getID());
        assertEquals( "AUTOMATIC_POSTING", enumType.getName());
        assertEquals( "9 - Automatic posting mode (trade posting to the position account number specified)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum577ClearingInstruction.AUTOMATIC_GIVE_UP;
        assertEquals( "10", enumType.getID());
        assertEquals( "AUTOMATIC_GIVE_UP", enumType.getName());
        assertEquals( "10 - Automatic give-up mode (trade give-up to the give-up destination number specified)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum577ClearingInstruction.QUALIFIED_SERVICE_REPRESENTATIVE;
        assertEquals( "11", enumType.getID());
        assertEquals( "QUALIFIED_SERVICE_REPRESENTATIVE", enumType.getName());
        assertEquals( "11 - Qualified Service Representative QSR", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum577ClearingInstruction.CUSTOMER_TRADE;
        assertEquals( "12", enumType.getID());
        assertEquals( "CUSTOMER_TRADE", enumType.getName());
        assertEquals( "12 - Customer trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum577ClearingInstruction.SELF_CLEARING;
        assertEquals( "13", enumType.getID());
        assertEquals( "SELF_CLEARING", enumType.getName());
        assertEquals( "13 - Self clearing", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}