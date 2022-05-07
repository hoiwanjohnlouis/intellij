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

package com.hwtsllc.fixengine2022.datatypes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  581 (same as 581, 798)
 *  Type of account associated with an order
 *  798 (same as 581, 798)
 *  AllocAccountType
 *  Type of account associated with a confirmation or other trade-level message
 *  Valid values:
 *      1 - Account is carried on customer side of books
 *      2 - Account is carried on non-customer side of books
 *      3 - House trader
 *      4 - Floor trader
 *      6 - Account is carried on non-customer side of books and is cross margined
 *      7 - Account is house trader and is cross margined
 *      8 - Joint back office account (JBO)
 */
class MyEnumAccountTypeTest {
    @Test
    void Enum0581Test() {
        MyEnumAccountType enumType;

        /**
         *  1-4, types
         */
        enumType = MyEnumAccountType.CUSTOMER_BOOK;
        assertEquals("1", enumType.getID());
        assertEquals("CUSTOMER_BOOK", enumType.getName());
        assertEquals("1 - Account is carried on customer side of the books", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumAccountType.NON_CUSTOMER_BOOK;
        assertEquals("2", enumType.getID());
        assertEquals("NON_CUSTOMER_BOOK", enumType.getName());
        assertEquals("2 - Account is carried on non-customer side of books", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumAccountType.HOUSE_TRADER;
        assertEquals("3", enumType.getID());
        assertEquals("HOUSE_TRADER", enumType.getName());
        assertEquals("3 - House Trader", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumAccountType.FLOOR_TRADER;
        assertEquals("4", enumType.getID());
        assertEquals("FLOOR_TRADER", enumType.getName());
        assertEquals("4 - Floor Trader", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /**
         *  6-8, types
         */
        enumType = MyEnumAccountType.NON_CUSTOMER_CROSSED_MARGIN_BOOK;
        assertEquals("6", enumType.getID());
        assertEquals("NON_CUSTOMER_CROSSED_MARGIN_BOOK", enumType.getName());
        assertEquals("6 - Account is carried on non-customer side of books and is cross margined",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumAccountType.HOUSE_TRADER_CROSSED_MARGIN_BOOK;
        assertEquals("7", enumType.getID());
        assertEquals("HOUSE_TRADER_CROSSED_MARGIN_BOOK", enumType.getName());
        assertEquals("7 - Account is house trader and is cross margined", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumAccountType.JOINT_BACK_OFFICE;
        assertEquals("8", enumType.getID());
        assertEquals("JOINT_BACK_OFFICE", enumType.getName());
        assertEquals("8 - Joint back office account (JBO)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}