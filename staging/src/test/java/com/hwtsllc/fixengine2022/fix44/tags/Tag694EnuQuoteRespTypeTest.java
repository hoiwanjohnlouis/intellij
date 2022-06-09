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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum694QuoteRespType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  694
 *  QuoteRespType
 *  int
 *  <p></p>
 *  Identifies the type of Quote Response.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Hit/Lift
 *  <p>    2 - Counter
 *  <p>    3 - Expired
 *  <p>    4 - Cover
 *  <p>    5 - Done Away
 *  <p></p>
 *  <p>    6 - Pass
 */
class Tag694EnuQuoteRespTypeTest {
    @Test
    void FIX0694Test() {
        FIX44 fixData = FIX44.FIX694_ENU_QUOTE_RESP_TYPE;
        assertEquals( "694", fixData.toFIXIDString());
        assertEquals( "QUOTE_RESP_TYPE", fixData.toFIXNameString());
        assertEquals( "QuoteRespType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0694Test() {
        Tag694EnuQuoteRespType tagData;

        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.HIT_OR_LIFT);
        assertEquals( Enum694QuoteRespType.HIT_OR_LIFT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.COUNTER);
        assertEquals( Enum694QuoteRespType.COUNTER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.EXPIRED);
        assertEquals( Enum694QuoteRespType.EXPIRED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.COVER);
        assertEquals( Enum694QuoteRespType.COVER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.DONE_AWAY);
        assertEquals( Enum694QuoteRespType.DONE_AWAY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.PASS);
        assertEquals( Enum694QuoteRespType.PASS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}