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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyEnumAccountType;
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
class Tag581EnuAccountTypeTest {
    @Test
    void FIX0581Test() {
        FIX43 fixData = FIX43.FIX581_ENU_ACCOUNT_TYPE;
        assertEquals( "581", fixData.getID());
        assertEquals( "ACCOUNT_TYPE", fixData.getName());
        assertEquals( "AccountType", fixData.getDescription());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0581Test() {
        Log581EnuAccountType tagData;

        /**
         *  1-4, types
         */
        tagData = new Log581EnuAccountType(MyEnumAccountType.CUSTOMER_BOOK);
        assertEquals( MyEnumAccountType.CUSTOMER_BOOK.getID(), tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log581EnuAccountType(MyEnumAccountType.NON_CUSTOMER_BOOK);
        assertEquals( MyEnumAccountType.NON_CUSTOMER_BOOK.getID(), tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log581EnuAccountType(MyEnumAccountType.HOUSE_TRADER);
        assertEquals( MyEnumAccountType.HOUSE_TRADER.getID(), tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log581EnuAccountType(MyEnumAccountType.FLOOR_TRADER);
        assertEquals( MyEnumAccountType.FLOOR_TRADER.getID(), tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         *  6-8, types
         */
        tagData = new Log581EnuAccountType(MyEnumAccountType.NON_CUSTOMER_CROSSED_MARGIN_BOOK);
        assertEquals( MyEnumAccountType.NON_CUSTOMER_CROSSED_MARGIN_BOOK.getID(), tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log581EnuAccountType(MyEnumAccountType.HOUSE_TRADER_CROSSED_MARGIN_BOOK);
        assertEquals( MyEnumAccountType.HOUSE_TRADER_CROSSED_MARGIN_BOOK.getID(), tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log581EnuAccountType(MyEnumAccountType.JOINT_BACK_OFFICE);
        assertEquals( MyEnumAccountType.JOINT_BACK_OFFICE.getID(), tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}