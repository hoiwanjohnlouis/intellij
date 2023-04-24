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

package com.hwtsllc.fixengine.tags.fix50.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1021
 *  MDBookType
 *  int
 *  <p>
 *  Describes the type of book for which the feed is intended.
 *  <p>
 *  Used when multiple feeds are provided over the same connection
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Top of Book
 *  <p>    2 - Price Depth
 *  <p>    3 - Order Depth
 */
class Enum1021MDBookTypeTest {
    @Test
    void EnumTest() {
        Enum1021MDBookType enumType;

        enumType = Enum1021MDBookType.TOP_OF_BOOK;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "TOP_OF_BOOK", enumType.toFIXNameString() );
        assertEquals( "1 - Top of Book", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1021MDBookType.PRICE_DEPTH;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "PRICE_DEPTH", enumType.toFIXNameString() );
        assertEquals( "2 - Price Depth", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1021MDBookType.ORDER_DEPTH;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "ORDER_DEPTH", enumType.toFIXNameString() );
        assertEquals( "3 - Order Depth", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}