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
import com.hwtsllc.fixengine2022.fix42.enums.Enum216RoutingType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag388EnuDiscretionInstTest {
    @Test
    void FIX0388Test() {
        FIX42 fixData = FIX42.FIX388_ENU_DISCRETION_INST;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     * 0-7 msg types
     */
    RELATED_TO_DISPLAYED_PRICE( "0", "RELATED_TO_DISPLAYED_PRICE",
                                        "0 - Related to displayed price" ),
    RELATED_TO_MARKET_PRICE( "1", "RELATED_TO_MARKET_PRICE",
                                     "1 - Related to market price" ),
    RELATED_TO_PRIMARY_PRICE( "2", "RELATED_TO_PRIMARY_PRICE",
                                      "2 - Related to primary price" ),
    RELATED_TO_LOCAL_PRIMARY_PRICE( "3", "RELATED_TO_LOCAL_PRIMARY_PRICE",
                                            "3 - Related to local primary price" ),
    RELATED_TO_MIDPOINT_PRICE( "4", "RELATED_TO_MIDPOINT_PRICE",
                                       "4 - Related to midpoint price" ),
    RELATED_TO_LAST_TRADE_PRICE( "5", "RELATED_TO_LAST_TRADE_PRICE",
                                         "5 - Related to last trade price" ),
    RELATED_TO_VWAP( "6", "RELATED_TO_VWAP",
                             "6 - Related to VWAP" ),
    AVERAGE_PRICE_GUARANTEE( "7", "AVERAGE_PRICE_GUARANTEE",
                                     "7 - Average Price Guarantee" ),
    @Test
    void Tag0388Test() {
        Tag388EnuDiscretionInst tagData;

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}