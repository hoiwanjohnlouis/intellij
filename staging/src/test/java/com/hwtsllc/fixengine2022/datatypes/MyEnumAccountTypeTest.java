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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  581 (same as 581, 798)
 *  AccountType
 *  int
 *  <p>
 *  Type of account associated with an order
 *  <p></p>
 *  798 (same as 581, 798)
 *  AllocAccountType
 *  int
 *  <p>
 *  Type of account associated with a confirmation or other trade-level message
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Account is carried on customer side of books
 *  <p>    2 - Account is carried on non-customer side of books
 *  <p>    3 - House trader
 *  <p>    4 - Floor trader
 *  <p>    6 - Account is carried on non-customer side of books and is cross margined
 *  <p>    7 - Account is house trader and is cross margined
 *  <p>    8 - Joint back office account (JBO)
 */
class MyEnumAccountTypeTest {
    @Test
    void Enum0581Test() {
        MyEnumAccountType enumType;

        /*
         *  1-4, types
         */
        enumType = MyEnumAccountType.CUSTOMER_BOOK;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("CUSTOMER_BOOK", enumType.toEnumNameString());
        assertEquals("1 - Account is carried on customer side of the books", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumAccountType.NON_CUSTOMER_BOOK;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("NON_CUSTOMER_BOOK", enumType.toEnumNameString());
        assertEquals("2 - Account is carried on non-customer side of books", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumAccountType.HOUSE_TRADER;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("HOUSE_TRADER", enumType.toEnumNameString());
        assertEquals("3 - House Trader", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumAccountType.FLOOR_TRADER;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("FLOOR_TRADER", enumType.toEnumNameString());
        assertEquals("4 - Floor Trader", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         *  6-8, types
         */
        enumType = MyEnumAccountType.NON_CUSTOMER_CROSSED_MARGIN_BOOK;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("NON_CUSTOMER_CROSSED_MARGIN_BOOK", enumType.toEnumNameString());
        assertEquals("6 - Account is carried on non-customer side of books and is cross margined",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumAccountType.HOUSE_TRADER_CROSSED_MARGIN_BOOK;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("HOUSE_TRADER_CROSSED_MARGIN_BOOK", enumType.toEnumNameString());
        assertEquals("7 - Account is house trader and is cross margined", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumAccountType.JOINT_BACK_OFFICE;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("JOINT_BACK_OFFICE", enumType.toEnumNameString());
        assertEquals("8 - Joint back office account (JBO)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}