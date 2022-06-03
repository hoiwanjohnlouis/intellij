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
import com.hwtsllc.fixengine2022.fix43.enums.Enum537QuoteType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
class Tag537EnuQuoteTypeTest {
    @Test
    void FIX0537Test() {
        FIX43 fixData = FIX43.FIX537_ENU_QUOTE_TYPE;
        assertEquals( "537", fixData.toFIXIDString());
        assertEquals( "QUOTE_TYPE", fixData.toFIXNameString());
        assertEquals( "QuoteType", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0537Test() {
        Tag537EnuQuoteType tagData;

        /*
         *  0-3 types
         */
        tagData = new Tag537EnuQuoteType( Enum537QuoteType.INDICATIVE );
        assertEquals( Enum537QuoteType.INDICATIVE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag537EnuQuoteType( Enum537QuoteType.TRADEABLE );
        assertEquals( Enum537QuoteType.TRADEABLE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag537EnuQuoteType( Enum537QuoteType.RESTRICTED_TRADEABLE );
        assertEquals( Enum537QuoteType.RESTRICTED_TRADEABLE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag537EnuQuoteType( Enum537QuoteType.COUNTER );
        assertEquals( Enum537QuoteType.COUNTER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}