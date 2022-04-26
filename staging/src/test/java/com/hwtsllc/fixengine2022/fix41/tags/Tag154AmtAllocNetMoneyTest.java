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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag154AmtAllocNetMoneyTest {
    @Test
    void FIX0154Test() {
        FIX41 fixData = FIX41.FIX154_AMT_ALLOC_NET_MONEY;
        assertEquals( "154", fixData.getID());
        assertEquals( "ALLOC_NET_MONEY", fixData.getName());
        assertEquals( "AllocNetMoney", fixData.getDescription());
        assertNotEquals( FIX41.JUNK_ID, fixData.getID());
        assertNotEquals( FIX41.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0154Test() {
        Tag154AmtAllocNetMoney tagData;

        tagData = new Tag154AmtAllocNetMoney(new MyAmtType(Tag154AmtAllocNetMoney.TESTA_AMT_ALLOC_NET_MONEY));
        assertEquals( Tag154AmtAllocNetMoney.TESTA_AMT_ALLOC_NET_MONEY, tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag154AmtAllocNetMoney(new MyAmtType(Tag154AmtAllocNetMoney.TESTB_AMT_ALLOC_NET_MONEY));
        assertEquals( Tag154AmtAllocNetMoney.TESTB_AMT_ALLOC_NET_MONEY, tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
}