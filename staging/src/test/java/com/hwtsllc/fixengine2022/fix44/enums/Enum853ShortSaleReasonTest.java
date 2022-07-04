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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  853
 *  ShortSaleReason
 *  int
 *  <p></p>
 *  Reason for short sale.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Dealer Sold Short
 *  <p>    1 - Dealer Sold Short Exempt
 *  <p>    2 - Selling Customer Sold Short
 *  <p>    3 - Selling Customer Sold Short Exempt
 *  <p>    4 - Qualified Service Representative (QSR)
 *              or Automatic Give-up (AGU) Contra Side Sold Short
 *  <p></p>
 *  <p>    5 - QSR or AGU Contra Side Sold Short Exempt
 */
class Enum853ShortSaleReasonTest {
    @Test
    void EnumTest() {
        Enum853ShortSaleReason enumType;

        enumType = Enum853ShortSaleReason.DEALER_SOLD_SHORT;
        assertEquals( "0", enumType.toEnumIDString() );
        assertEquals( "DEALER_SOLD_SHORT", enumType.toEnumNameString() );
        assertEquals( "0 - Dealer Sold Short", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum853ShortSaleReason.DEALER_SOLD_SHORT_EXEMPT;
        assertEquals( "1", enumType.toEnumIDString() );
        assertEquals( "DEALER_SOLD_SHORT_EXEMPT", enumType.toEnumNameString() );
        assertEquals( "1 - Dealer Sold Short Exempt", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum853ShortSaleReason.CUSTOMER_SOLD_SHORT;
        assertEquals( "2", enumType.toEnumIDString() );
        assertEquals( "CUSTOMER_SOLD_SHORT", enumType.toEnumNameString() );
        assertEquals( "2 - Selling Customer Sold Short", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum853ShortSaleReason.CUSTOMER_SOLD_SHORT_EXEMPT;
        assertEquals( "3", enumType.toEnumIDString() );
        assertEquals( "CUSTOMER_SOLD_SHORT_EXEMPT", enumType.toEnumNameString() );
        assertEquals( "3 - Selling Customer Sold Short Exempt", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum853ShortSaleReason.CONTRA_SOLD_SHORT;
        assertEquals( "4", enumType.toEnumIDString() );
        assertEquals( "CONTRA_SOLD_SHORT", enumType.toEnumNameString() );
        assertEquals( "4 - Qualified Service Representative (QSR) or Automatic Give-up (AGU) Contra Side Sold Short", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum853ShortSaleReason.CONTRA_SOLD_SHORT_EXEMPT;
        assertEquals( "5", enumType.toEnumIDString() );
        assertEquals( "CONTRA_SOLD_SHORT_EXEMPT", enumType.toEnumNameString() );
        assertEquals( "5 - QSR or AGU Contra Side Sold Short Exempt", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}