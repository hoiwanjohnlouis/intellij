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

package com.hwtsllc.fix.enums.fix43;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  537
 *  QuoteType
 *  int
 *  <p></p>
 *  Identifies the type of quote.
 *  <p></p>
 *  An indicative quote is used to inform a counterparty of a market.
 *  <p></p>
 *  An indicative quote does not result directly in a trade.
 *  <p></p>
 *  A tradeable quote is submitted to a market and will result directly
 *  in a trade against other orders and quotes in a market.
 *  <p></p>
 *  A restricted tradeable quote is submitted to a market
 *  and within a certain restriction (possibly based upon price or quantity)
 *  will automatically trade against orders.
 *  <p></p>
 *  Order that do not comply with restrictions are sent to
 *  the quote issuer who can choose to accept or decline the order.
 *  <p></p>
 *  A counter quote is used in the negotiation model.
 *  <p>
 *  See Volume 7 – Product: Fixed Income for example usage.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Indicative
 *  <p>    1 - Tradeable
 *  <p>    2 - Restricted Tradeable
 *  <p>    3 - Counter (tradeable)
 */
class Enum537QuoteTypeTest {
    /*
     *  Information is the same for TAGS 537
     */
    @Test
    void Enum0537Test() {
        Enum537QuoteType enumType;

        /*
         *  0-3 types
         */
        enumType = Enum537QuoteType.INDICATIVE;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("INDICATIVE", enumType.toFIXNameString());
        assertEquals("0 - Indicative", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum537QuoteType.TRADEABLE;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("TRADEABLE", enumType.toFIXNameString());
        assertEquals("1 - Tradeable", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum537QuoteType.RESTRICTED_TRADEABLE;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("RESTRICTED_TRADEABLE", enumType.toFIXNameString());
        assertEquals("2 - Restricted Tradeable", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum537QuoteType.COUNTER;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("COUNTER", enumType.toFIXNameString());
        assertEquals("3 - Counter (tradeable)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}