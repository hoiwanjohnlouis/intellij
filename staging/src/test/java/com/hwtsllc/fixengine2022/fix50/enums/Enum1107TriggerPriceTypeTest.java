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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
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
        assertEquals( "1", enumType.getID() );
        assertEquals( "BEST_OFFER", enumType.getName() );
        assertEquals( "1 - Best Offer", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1107TriggerPriceType.LAST_TRADE;
        assertEquals( "2", enumType.getID() );
        assertEquals( "LAST_TRADE", enumType.getName() );
        assertEquals( "2 - Last Trade", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1107TriggerPriceType.BEST_BID;
        assertEquals( "3", enumType.getID() );
        assertEquals( "BEST_BID", enumType.getName() );
        assertEquals( "3 - Best Bid", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1107TriggerPriceType.BEST_BID_OR_LAST_TRADE;
        assertEquals( "4", enumType.getID() );
        assertEquals( "BEST_BID_OR_LAST_TRADE", enumType.getName() );
        assertEquals( "4 - Best Bid or Last Trade", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1107TriggerPriceType.BEST_OFFER_OR_LAST_TRADE;
        assertEquals( "5", enumType.getID() );
        assertEquals( "BEST_OFFER_OR_LAST_TRADE", enumType.getName() );
        assertEquals( "5 - Best Offer or Last Trade", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum1107TriggerPriceType.BEST_MID;
        assertEquals( "6", enumType.getID() );
        assertEquals( "BEST_MID", enumType.getName() );
        assertEquals( "6 - Best Mid", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}