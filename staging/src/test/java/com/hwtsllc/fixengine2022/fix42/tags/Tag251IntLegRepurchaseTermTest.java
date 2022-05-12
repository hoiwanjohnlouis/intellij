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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

// @Deprecated
class Tag251IntLegRepurchaseTermTest {
    @Test
    void FIX0251Test() {
        FIX42 fixData = FIX42.FIX251_INT_LEG_REPURCHASE_TERM;
        assertEquals( "251", fixData.getID());
        assertEquals( "LEG_REPURCHASE_TERM", fixData.getName());
        assertEquals( "LegRepurchaseTerm", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0251Test() {
        Log251IntLegRepurchaseTerm tagData;

        tagData = new Log251IntLegRepurchaseTerm(new MyIntType(
                Log251IntLegRepurchaseTerm.TESTA_INT_LEG_REPURCHASE_TERM));
        assertEquals( Log251IntLegRepurchaseTerm.TESTA_INT_LEG_REPURCHASE_TERM,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        tagData = new Log251IntLegRepurchaseTerm(new MyIntType(
                Log251IntLegRepurchaseTerm.TESTB_INT_LEG_REPURCHASE_TERM));
        assertEquals( Log251IntLegRepurchaseTerm.TESTB_INT_LEG_REPURCHASE_TERM,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
}