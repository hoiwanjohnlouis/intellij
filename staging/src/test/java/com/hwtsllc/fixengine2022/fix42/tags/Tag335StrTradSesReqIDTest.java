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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag335StrTradSesReqIDTest {
    @Test
    void FIX0335Test() {
        FIX42 fixData = FIX42.FIX335_STR_TRAD_SES_REQ_ID;
        assertEquals( "335", fixData.getID());
        assertEquals( "TRAD_SES_REQ_ID", fixData.getName());
        assertEquals( "TradSesReqId", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0335Test() {
        Tag335StrTradSesReqID tagData;

        tagData = new Tag335StrTradSesReqID(new MyStringType(
                Tag335StrTradSesReqID.TESTA_STR_TRAD_SES_REQ_ID));
        assertEquals( Tag335StrTradSesReqID.TESTA_STR_TRAD_SES_REQ_ID,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag335StrTradSesReqID(new MyStringType(
                Tag335StrTradSesReqID.TESTB_STR_TRAD_SES_REQ_ID));
        assertEquals( Tag335StrTradSesReqID.TESTB_STR_TRAD_SES_REQ_ID,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}