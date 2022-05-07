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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum388DiscretionInst;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag388EnuDiscretionInstTest {
    @Test
    void FIX0388Test() {
        FIX42 fixData = FIX42.FIX388_ENU_DISCRETION_INST;
        assertEquals( "388", fixData.getID());
        assertEquals( "DISCRETION_INST", fixData.getName());
        assertEquals( "DiscretionInst", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag388
     *  Enu
     *  DiscretionInst
     *
     *      0-7 msg types
     *      RELATED_TO_DISPLAYED_PRICE( "0", "RELATED_TO_DISPLAYED_PRICE", "0 - Related to displayed price" ),
     *      RELATED_TO_MARKET_PRICE( "1", "RELATED_TO_MARKET_PRICE", "1 - Related to market price" ),
     *      RELATED_TO_PRIMARY_PRICE( "2", "RELATED_TO_PRIMARY_PRICE", "2 - Related to primary price" ),
     *      RELATED_TO_LOCAL_PRIMARY_PRICE( "3", "RELATED_TO_LOCAL_PRIMARY_PRICE",
     *                          "3 - Related to local primary price" ),
     *      RELATED_TO_MIDPOINT_PRICE( "4", "RELATED_TO_MIDPOINT_PRICE", "4 - Related to midpoint price" ),
     *      RELATED_TO_LAST_TRADE_PRICE( "5", "RELATED_TO_LAST_TRADE_PRICE", "5 - Related to last trade price" ),
     *      RELATED_TO_VWAP( "6", "RELATED_TO_VWAP", "6 - Related to VWAP" ),
     *      AVERAGE_PRICE_GUARANTEE( "7", "AVERAGE_PRICE_GUARANTEE", "7 - Average Price Guarantee" ),
     */
    @Test
    void Tag0388Test() {
        Tag388EnuDiscretionInst tagData;

        /**
         *  0-7 msg types
         */
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_DISPLAYED_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_DISPLAYED_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_MARKET_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_MARKET_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_PRIMARY_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_PRIMARY_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_LOCAL_PRIMARY_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_LOCAL_PRIMARY_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_MIDPOINT_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_MIDPOINT_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_LAST_TRADE_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_LAST_TRADE_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_VWAP);
        assertEquals( Enum388DiscretionInst.RELATED_TO_VWAP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.AVERAGE_PRICE_GUARANTEE);
        assertEquals( Enum388DiscretionInst.AVERAGE_PRICE_GUARANTEE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}