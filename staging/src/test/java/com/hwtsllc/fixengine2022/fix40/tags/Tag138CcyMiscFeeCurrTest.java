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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  138
 *  MiscFeeCurr
 *  Currency
 *  Currency of miscellaneous fee
 */
class Tag138CcyMiscFeeCurrTest {
    @Test
    void FIX0138Test() {
        FIX40 fixData = FIX40.FIX138_CCY_MISC_FEE_CURR;
        assertEquals( "MISC_FEE_CURR", fixData.getName());
        assertEquals( "138", fixData.getID());
        assertEquals( "MiscFeeCurr", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0138Test() {
        Log138CcyMiscFeeCurr tagData;

        tagData = new Log138CcyMiscFeeCurr(new MyCurrencyType("SungHyunAh-138MiscFeeCurr") );
        assertEquals( "SungHyunAh-138MiscFeeCurr", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}