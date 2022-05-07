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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

/**
 *  853
 *  ShortSaleReason
 *  int
 *  Reason for short sale.
 *  Valid values:
 *      0 - Dealer Sold Short
 *      1 - Dealer Sold Short Exempt
 *      2 - Selling Customer Sold Short
 *      3 - Selling Customer Sold Short Exempt
 *      4 - Qualified Service Representative (QSR) or Automatic Give-up (AGU) Contra Side Sold Short
 *
 *      5 - QSR or AGU Contra Side Sold Short Exempt
 */
class Enum853ShortSaleReasonTest {
    @Test
    void EnumTest() {
        Enum853ShortSaleReason enumType;

        enumType = Enum853ShortSaleReason.DEALER_SOLD_SHORT;
        assertEquals( "0", enumType.getID() );
        assertEquals( "DEALER_SOLD_SHORT", enumType.getName() );
        assertEquals( "0 - Dealer Sold Short", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum853ShortSaleReason.DEALER_SOLD_SHORT_EXEMPT;
        assertEquals( "1", enumType.getID() );
        assertEquals( "DEALER_SOLD_SHORT_EXEMPT", enumType.getName() );
        assertEquals( "1 - Dealer Sold Short Exempt", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum853ShortSaleReason.CUSTOMER_SOLD_SHORT;
        assertEquals( "2", enumType.getID() );
        assertEquals( "CUSTOMER_SOLD_SHORT", enumType.getName() );
        assertEquals( "2 - Selling Customer Sold Short", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum853ShortSaleReason.CUSTOMER_SOLD_SHORT_EXEMPT;
        assertEquals( "3", enumType.getID() );
        assertEquals( "CUSTOMER_SOLD_SHORT_EXEMPT", enumType.getName() );
        assertEquals( "3 - Selling Customer Sold Short Exempt", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum853ShortSaleReason.CONTRA_SOLD_SHORT;
        assertEquals( "4", enumType.getID() );
        assertEquals( "CONTRA_SOLD_SHORT", enumType.getName() );
        assertEquals( "4 - Qualified Service Representative (QSR) or Automatic Give-up (AGU) Contra Side Sold Short", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum853ShortSaleReason.CONTRA_SOLD_SHORT_EXEMPT;
        assertEquals( "5", enumType.getID() );
        assertEquals( "CONTRA_SOLD_SHORT_EXEMPT", enumType.getName() );
        assertEquals( "5 - QSR or AGU Contra Side Sold Short Exempt", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}