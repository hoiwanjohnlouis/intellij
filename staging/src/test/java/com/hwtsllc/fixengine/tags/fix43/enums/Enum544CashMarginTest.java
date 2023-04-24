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

package com.hwtsllc.fixengine.tags.fix43.enums;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  544
 *  CashMargin
 *  char
 *  <p></p>
 *  Identifies whether an order is a margin order or a non-margin order.
 *  <p></p>
 *  This is primarily used when sending orders to Japanese exchanges to
 *  indicate sell margin or buy to cover.
 *  <p></p>
 *  The same tag could be assigned also by buy-side to indicate the intent
 *  to sell or buy margin and the sell-side to accept or reject
 *  <p></p>
 *  (base on some validation criteria) the margin request.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Cash
 *  <p>    2 - Margin Open
 *  <p>    3 - Margin Close
 */
class Enum544CashMarginTest {
    /*
     *  Information is the same for TAGS 544
     */
    @Test
    void Enum0544Test() {
        Enum544CashMargin enumType;

        /*
         *  1-3 types
         */
        enumType = Enum544CashMargin.CASH;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("CASH", enumType.toFIXNameString());
        assertEquals("1 - Cash", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum544CashMargin.MARGIN_OPEN;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("MARGIN_OPEN", enumType.toFIXNameString());
        assertEquals("2 - Margin Open", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum544CashMargin.MARGIN_CLOSE;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("MARGIN_CLOSE", enumType.toFIXNameString());
        assertEquals("3 - Margin Close", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}