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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1107TriggerPriceType;
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
class Tag1107EnuTriggerPriceTypeTest {
    @Test
    void FIX1107Test() {
        FIX50 fixData = FIX50.FIX1107_ENU_TRIGGER_PRICE_TYPE;
        assertEquals( "1107", fixData.getID());
        assertEquals( "TRIGGER_PRICE_TYPE", fixData.getName());
        assertEquals( "TriggerPriceType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1107Test() {
        Tag1107EnuTriggerPriceType tagData;

        tagData = new Tag1107EnuTriggerPriceType( Enum1107TriggerPriceType.BEST_OFFER );
        assertEquals( Enum1107TriggerPriceType.BEST_OFFER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1107EnuTriggerPriceType( Enum1107TriggerPriceType.LAST_TRADE );
        assertEquals( Enum1107TriggerPriceType.LAST_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1107EnuTriggerPriceType( Enum1107TriggerPriceType.BEST_BID );
        assertEquals( Enum1107TriggerPriceType.BEST_BID.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1107EnuTriggerPriceType( Enum1107TriggerPriceType.BEST_BID_OR_LAST_TRADE );
        assertEquals( Enum1107TriggerPriceType.BEST_BID_OR_LAST_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1107EnuTriggerPriceType( Enum1107TriggerPriceType.BEST_OFFER_OR_LAST_TRADE );
        assertEquals( Enum1107TriggerPriceType.BEST_OFFER_OR_LAST_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1107EnuTriggerPriceType( Enum1107TriggerPriceType.BEST_MID );
        assertEquals( Enum1107TriggerPriceType.BEST_MID.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}