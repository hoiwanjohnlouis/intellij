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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.fix44.enums.Enum694QuoteRespType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag694EnuQuoteRespTypeTest {
    @Test
    void FIX0694Test() {
        FIX44 fixData = FIX44.FIX694_ENU_QUOTE_RESP_TYPE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  694
     *  QuoteRespType
     *  Identifies the type of Quote Response.
     *  Valid values:
     *      1 - Hit/Lift
     *      2 - Counter
     *      3 - Expired
     *      4 - Cover
     *      5 - Done Away
     *      6 - Pass
     */
    @Test
    void Tag0694Test() {
        Tag694EnuQuoteRespType tagData;

        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.HIT_OR_LIFT);
        assertEquals( Enum694QuoteRespType.HIT_OR_LIFT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.COUNTER);
        assertEquals( Enum694QuoteRespType.COUNTER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.EXPIRED);
        assertEquals( Enum694QuoteRespType.EXPIRED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.COVER);
        assertEquals( Enum694QuoteRespType.COVER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.DONE_AWAY);
        assertEquals( Enum694QuoteRespType.DONE_AWAY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.PASS);
        assertEquals( Enum694QuoteRespType.PASS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}