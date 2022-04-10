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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
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
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,CALCULATED_INCLUDES_MISCFEES_NETMONEY,1 - Calculated (includes MiscFees and NetMoney)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.PRELIMINARY_WITHOUT_MISCFEES_NETMONEY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,PRELIMINARY_WITHOUT_MISCFEES_NETMONEY,2 - Preliminary (without MiscFees and NetMoney)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.SELLSIDE_USING_PRELIMINARY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,SELLSIDE_USING_PRELIMINARY,3 - Sellside Calculated Using Preliminary (includes MiscFees and NetMoney) (Replaced)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.SELLSIDE_WITHOUT_PRELIMINARY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,SELLSIDE_WITHOUT_PRELIMINARY,4 - Sellside Calculated Without Preliminary (sent unsolicited by sellside, includes MiscFees and NetMoney) (Replaced)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.READY_TO_BOOK_SINGLE_ORDER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,READY_TO_BOOK_SINGLE_ORDER,5 - Ready-To-Book - Single Order", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.BUYSIDE_READY_TO_BOOK;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("6,BUYSIDE_READY_TO_BOOK,6 - Buyside Ready-To-Book - Combined Set of Orders (Replaced)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.WAREHOUSE_INSTRUCTION;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("7,WAREHOUSE_INSTRUCTION,7 - Warehouse Instruction", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.REQUEST_INTERMEDIARY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("8,REQUEST_INTERMEDIARY,8 - Request to Intermediary", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.ACCEPT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("9,ACCEPT,9 - Accept", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.REJECT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("10,REJECT,10 - Reject", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.ACCEPT_PENDING;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("11,ACCEPT_PENDING,11 - Accept Pending", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.INCOMPLETE_GROUP;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("12,INCOMPLETE_GROUP,12 - Incomplete Group", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.COMPLETE_GROUP;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("13,COMPLETE_GROUP,13 - Complete Group", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum626AllocType.REVERSAL_PENDING;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("14,REVERSAL_PENDING,14 - Reversal Pending", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());
    }
}