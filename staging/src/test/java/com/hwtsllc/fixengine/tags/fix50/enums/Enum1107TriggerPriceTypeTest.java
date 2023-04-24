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

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1107
 *  TriggerPriceType
 *  char
 *  <p>
 *  The type of price that the trigger is compared to.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Best Offer
 *  <p>    2 - Last Trade
 *  <p>    3 - Best Bid
 *  <p>    4 - Best Bid or Last Trade
 *  <p>    5 - Best Offer or Last Trade
 *  <p></p>
 *  <p>    6 - Best Mid
 */
class Enum1107TriggerPriceTypeTest {
    @Test
    void EnumTest() {
        Enum1107TriggerPriceType enumType;

        enumType = Enum1107TriggerPriceType.BEST_OFFER;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "BEST_OFFER", enumType.toFIXNameString() );
        assertEquals( "1 - Best Offer", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1107TriggerPriceType.LAST_TRADE;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "LAST_TRADE", enumType.toFIXNameString() );
        assertEquals( "2 - Last Trade", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1107TriggerPriceType.BEST_BID;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "BEST_BID", enumType.toFIXNameString() );
        assertEquals( "3 - Best Bid", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1107TriggerPriceType.BEST_BID_OR_LAST_TRADE;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "BEST_BID_OR_LAST_TRADE", enumType.toFIXNameString() );
        assertEquals( "4 - Best Bid or Last Trade", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1107TriggerPriceType.BEST_OFFER_OR_LAST_TRADE;
        assertEquals( "5", enumType.toFIXIDString() );
        assertEquals( "BEST_OFFER_OR_LAST_TRADE", enumType.toFIXNameString() );
        assertEquals( "5 - Best Offer or Last Trade", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum1107TriggerPriceType.BEST_MID;
        assertEquals( "6", enumType.toFIXIDString() );
        assertEquals( "BEST_MID", enumType.toFIXNameString() );
        assertEquals( "6 - Best Mid", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}