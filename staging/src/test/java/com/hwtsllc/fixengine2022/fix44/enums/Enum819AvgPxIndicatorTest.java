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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  819
 *  AvgPxIndicator
 *  int
 *  Average Pricing Indicator
 *  Valid values:
 *      0 - No Average Pricing
 *      1 - Trade is part of an average price group identified by the TradeLinkID (820)
 *      2 - Last trade is the average price group identified by the TradeLinkID (820)
 */
class Enum819AvgPxIndicatorTest {
    @Test
    void EnumTest() {
        Enum819AvgPxIndicator enumType;

        enumType = Enum819AvgPxIndicator.NO_PRICING;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("NO_PRICING", enumType.toFIXNameString());
        assertEquals("0 - No Average Pricing", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum819AvgPxIndicator.PART_OF_APG;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("PART_OF_APG", enumType.toFIXNameString());
        assertEquals("1 - Trade is part of an average price group identified by the TradeLinkID (820)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum819AvgPxIndicator.LAST_TRADE;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("LAST_TRADE", enumType.toFIXNameString());
        assertEquals("2 - Last trade is the average price group identified by the TradeLinkID (820)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}