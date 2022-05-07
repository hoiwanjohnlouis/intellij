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
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag381AmtGrossTradeAmtTest {
    @Test
    void FIX0381Test() {
        FIX42 fixData = FIX42.FIX381_AMT_GROSS_TRADE_AMT;
        assertEquals( "381", fixData.getID());
        assertEquals( "GROSS_TRADE_AMT", fixData.getName());
        assertEquals( "GrossTradeAmt", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0381Test() {
        Tag381AmtGrossTradeAmt tagData;

        tagData = new Tag381AmtGrossTradeAmt(new MyAmtType(
                Tag381AmtGrossTradeAmt.TESTA_AMT_GROSS_TRADE_AMT));
        assertEquals( Tag381AmtGrossTradeAmt.TESTA_AMT_GROSS_TRADE_AMT,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag381AmtGrossTradeAmt(new MyAmtType(
                Tag381AmtGrossTradeAmt.TESTB_AMT_GROSS_TRADE_AMT));
        assertEquals( Tag381AmtGrossTradeAmt.TESTB_AMT_GROSS_TRADE_AMT,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
}