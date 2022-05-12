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
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag367UtcQuoteSetValidUntilTimeTest {
    @Test
    void FIX0367Test() {
        FIX42 fixData = FIX42.FIX367_UTC_QUOTE_SET_VALID_UNTIL_TIME;
        assertEquals( "367", fixData.getID());
        assertEquals( "QUOTE_SET_VALID_UNTIL_TIME", fixData.getName());
        assertEquals( "QuoteSetValidUntilTime", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0367Test() {
        Log367UtcQuoteSetValidUntilTime tagData;

        tagData = new Log367UtcQuoteSetValidUntilTime(new MyUTCTimestampType(
                Log367UtcQuoteSetValidUntilTime.TESTA_UTC_QUOTE_SET_VALID_UNTIL_TIME));
        assertEquals( Log367UtcQuoteSetValidUntilTime.TESTA_UTC_QUOTE_SET_VALID_UNTIL_TIME,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());

        tagData = new Log367UtcQuoteSetValidUntilTime(new MyUTCTimestampType(
                Log367UtcQuoteSetValidUntilTime.TESTB_UTC_QUOTE_SET_VALID_UNTIL_TIME));
        assertEquals( Log367UtcQuoteSetValidUntilTime.TESTB_UTC_QUOTE_SET_VALID_UNTIL_TIME,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
}