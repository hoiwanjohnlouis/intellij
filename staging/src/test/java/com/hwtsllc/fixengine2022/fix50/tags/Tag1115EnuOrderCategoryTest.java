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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1115OrderCategory;
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
class Tag1115EnuOrderCategoryTest {
    @Test
    void FIX1115Test() {
        FIX50 fixData = FIX50.FIX1115_ENU_ORDER_CATEGORY;
        assertEquals( "1115", fixData.getID());
        assertEquals( "ORDER_CATEGORY", fixData.getName());
        assertEquals( "OrderCategory", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1115Test() {
        Tag1115EnuOrderCategory tagData;

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.ORDER );
        assertEquals( Enum1115OrderCategory.ORDER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.QUOTE );
        assertEquals( Enum1115OrderCategory.QUOTE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.PRIVATELY );
        assertEquals( Enum1115OrderCategory.PRIVATELY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.MULTILEG );
        assertEquals( Enum1115OrderCategory.MULTILEG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.LINKED );
        assertEquals( Enum1115OrderCategory.LINKED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.QUOTE_REQUEST );
        assertEquals( Enum1115OrderCategory.QUOTE_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.IMPLIED_ORDER );
        assertEquals( Enum1115OrderCategory.IMPLIED_ORDER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.CROSS_ORDER );
        assertEquals( Enum1115OrderCategory.CROSS_ORDER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}