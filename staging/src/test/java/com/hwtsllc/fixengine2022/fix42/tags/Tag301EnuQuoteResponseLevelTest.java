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
import com.hwtsllc.fixengine2022.fix42.enums.Enum301QuoteResponseLevel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag301EnuQuoteResponseLevelTest {
    @Test
    void FIX0301Test() {
        FIX42 fixData = FIX42.FIX301_ENU_QUOTE_RESPONSE_LEVEL;
        assertEquals( "301", fixData.getID());
        assertEquals( "QUOTE_RESPONSE_LEVEL", fixData.getName());
        assertEquals( "QuoteResponseLevel", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  301
     *  QuoteResponseLevel
     *
     *      0-2 msg types
     *      NO_ACKNOWLEDGEMENT( "0", "NO_ACKNOWLEDGEMENT", "0 - No Acknowledgement (default)" ),
     *      ACKNOWLEDGE_NEGATIVE_OR_ERRORS( "1", "ACKNOWLEDGE_NEGATIVE_OR_ERRORS",
     *                      "1 - Acknowledge only negative or erroneous quotes" ),
     *      ACKNOWLEDGE_EACH_QUOTE( "2", "ACKNOWLEDGE_EACH_QUOTE", "2 - Acknowledge each quote messages" ),
     */
    @Test
    void Tag0301Test() {
        Log301EnuQuoteResponseLevel tagData;

        /**
         * 0-2 msg types
         */
        tagData = new Log301EnuQuoteResponseLevel(Enum301QuoteResponseLevel.NO_ACKNOWLEDGEMENT);
        assertEquals( Enum301QuoteResponseLevel.NO_ACKNOWLEDGEMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log301EnuQuoteResponseLevel(Enum301QuoteResponseLevel.ACKNOWLEDGE_NEGATIVE_OR_ERRORS);
        assertEquals( Enum301QuoteResponseLevel.ACKNOWLEDGE_NEGATIVE_OR_ERRORS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log301EnuQuoteResponseLevel(Enum301QuoteResponseLevel.ACKNOWLEDGE_EACH_QUOTE);
        assertEquals( Enum301QuoteResponseLevel.ACKNOWLEDGE_EACH_QUOTE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}