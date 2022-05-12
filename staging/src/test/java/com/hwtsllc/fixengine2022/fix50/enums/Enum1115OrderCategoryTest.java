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

package com.hwtsllc.fixengine2022.fix50.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1115
 *  OrderCategory
 *  char
 *  <p>
 *  Defines the type of interest behind a trade (fill or partial fill).
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Order
 *  <p>    2 - Quote
 *  <p>    3 - Privately Negotiated Trade
 *  <p>    4 - Multileg order
 *  <p>    5 - Linked order
 *  <p></p>
 *  <p>    6 - Quote Request
 *  <p>    7 - Implied Order
 *  <p>    8 - Cross Order
 */
class Enum1115OrderCategoryTest {
    @Test
    void EnumTest() {
        Enum1115OrderCategory enumType;

        enumType = Enum1115OrderCategory.ORDER;
        assertEquals( "1", enumType.getID() );
        assertEquals( "ORDER", enumType.getName() );
        assertEquals( "1 - Order", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1115OrderCategory.QUOTE;
        assertEquals( "2", enumType.getID() );
        assertEquals( "QUOTE", enumType.getName() );
        assertEquals( "2 - Quote", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1115OrderCategory.PRIVATELY;
        assertEquals( "3", enumType.getID() );
        assertEquals( "PRIVATELY", enumType.getName() );
        assertEquals( "3 - Privately Negotiated Trade", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1115OrderCategory.MULTILEG;
        assertEquals( "4", enumType.getID() );
        assertEquals( "MULTILEG", enumType.getName() );
        assertEquals( "4 - Multileg order", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1115OrderCategory.LINKED;
        assertEquals( "5", enumType.getID() );
        assertEquals( "LINKED", enumType.getName() );
        assertEquals( "5 - Linked order", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum1115OrderCategory.QUOTE_REQUEST;
        assertEquals( "6", enumType.getID() );
        assertEquals( "QUOTE_REQUEST", enumType.getName() );
        assertEquals( "6 - Quote Request", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1115OrderCategory.IMPLIED_ORDER;
        assertEquals( "7", enumType.getID() );
        assertEquals( "IMPLIED_ORDER", enumType.getName() );
        assertEquals( "7 - Implied Order", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1115OrderCategory.CROSS_ORDER;
        assertEquals( "8", enumType.getID() );
        assertEquals( "CROSS_ORDER", enumType.getName() );
        assertEquals( "8 - Cross Order", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}