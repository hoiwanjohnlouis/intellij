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

class Enum626AllocTypeTest {
    /**
     *  Information is the same for TAGS 626
     */
    @Test
    void Enum0626Test() {
        Enum626AllocType enumType;

        /*
         *  1-14 types
         */
        enumType = Enum626AllocType.CALCULATED_INCLUDES_MISCFEES_NETMONEY;
        assertEquals("1", enumType.getID());
        assertEquals("CALCULATED_INCLUDES_MISCFEES_NETMONEY", enumType.getName());
        assertEquals("1 - Calculated (includes MiscFees and NetMoney)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.PRELIMINARY_WITHOUT_MISCFEES_NETMONEY;
        assertEquals("2", enumType.getID());
        assertEquals("PRELIMINARY_WITHOUT_MISCFEES_NETMONEY", enumType.getName());
        assertEquals("2 - Preliminary (without MiscFees and NetMoney)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.SELLSIDE_USING_PRELIMINARY;
        assertEquals("3", enumType.getID());
        assertEquals("SELLSIDE_USING_PRELIMINARY", enumType.getName());
        assertEquals("3 - Sellside Calculated Using Preliminary (includes MiscFees and NetMoney) (Replaced)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.SELLSIDE_WITHOUT_PRELIMINARY;
        assertEquals("4", enumType.getID());
        assertEquals("SELLSIDE_WITHOUT_PRELIMINARY", enumType.getName());
        assertEquals("4 - Sellside Calculated Without Preliminary (sent unsolicited by sellside, includes MiscFees and NetMoney) (Replaced)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.READY_TO_BOOK_SINGLE_ORDER;
        assertEquals("5", enumType.getID());
        assertEquals("READY_TO_BOOK_SINGLE_ORDER", enumType.getName());
        assertEquals("5 - Ready-To-Book - Single Order", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum626AllocType.BUYSIDE_READY_TO_BOOK;
        assertEquals("6", enumType.getID());
        assertEquals("BUYSIDE_READY_TO_BOOK", enumType.getName());
        assertEquals("6 - Buyside Ready-To-Book - Combined Set of Orders (Replaced)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.WAREHOUSE_INSTRUCTION;
        assertEquals("7", enumType.getID());
        assertEquals("WAREHOUSE_INSTRUCTION", enumType.getName());
        assertEquals("7 - Warehouse Instruction", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.REQUEST_INTERMEDIARY;
        assertEquals("8", enumType.getID());
        assertEquals("REQUEST_INTERMEDIARY", enumType.getName());
        assertEquals("8 - Request to Intermediary", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.ACCEPT;
        assertEquals("9", enumType.getID());
        assertEquals("ACCEPT", enumType.getName());
        assertEquals("9 - Accept", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.REJECT;
        assertEquals("10", enumType.getID());
        assertEquals("REJECT", enumType.getName());
        assertEquals("10 - Reject", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum626AllocType.ACCEPT_PENDING;
        assertEquals("11", enumType.getID());
        assertEquals("ACCEPT_PENDING", enumType.getName());
        assertEquals("11 - Accept Pending", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.INCOMPLETE_GROUP;
        assertEquals("12", enumType.getID());
        assertEquals("INCOMPLETE_GROUP", enumType.getName());
        assertEquals("12 - Incomplete Group", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.COMPLETE_GROUP;
        assertEquals("13", enumType.getID());
        assertEquals("COMPLETE_GROUP", enumType.getName());
        assertEquals("13 - Complete Group", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.REVERSAL_PENDING;
        assertEquals("14", enumType.getID());
        assertEquals("REVERSAL_PENDING", enumType.getName());
        assertEquals("14 - Reversal Pending", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}