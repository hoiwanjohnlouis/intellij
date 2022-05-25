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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum388DiscretionInst;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  388
 *  DiscretionInst
 *  char
 *  <p>
 *  Code to identify the price a DiscretionOffsetValue (389) is related to and should be mathematically added to.
 *  <p></p>
 *  Valid values:
 *  <p>     0 - Related to displayed price
 *  <p>     1 - Related to market price
 *  <p>     2 - Related to primary price
 *  <p>     3 - Related to local primary price
 *  <p>     4 - Related to midpoint price
 *  <p></p>
 *  <p>     5 - Related to last trade price
 *  <p>     6 - Related to VWAP
 *  <p>     7 - Average Price Guarantee
 */
class Tag388EnuDiscretionInstTest {
    @Test
    void FIX0388Test() {
        FIX42 fixData = FIX42.FIX388_ENU_DISCRETION_INST;
        assertEquals( "388", fixData.toFIXIDString());
        assertEquals( "DISCRETION_INST", fixData.toFIXNameString());
        assertEquals( "DiscretionInst", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0388Test() {
        Tag388EnuDiscretionInst tagData;

        /*
         *  0-7 msg types
         */
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_DISPLAYED_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_DISPLAYED_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_MARKET_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_MARKET_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_PRIMARY_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_PRIMARY_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_LOCAL_PRIMARY_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_LOCAL_PRIMARY_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_MIDPOINT_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_MIDPOINT_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_LAST_TRADE_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_LAST_TRADE_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_VWAP);
        assertEquals( Enum388DiscretionInst.RELATED_TO_VWAP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.AVERAGE_PRICE_GUARANTEE);
        assertEquals( Enum388DiscretionInst.AVERAGE_PRICE_GUARANTEE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}