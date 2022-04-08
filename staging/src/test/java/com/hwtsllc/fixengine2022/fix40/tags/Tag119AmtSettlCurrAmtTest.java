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
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag119AmtSettlCurrAmtTest {

    @Test
    void FIX0119Test() {
        FIX40 fixData = FIX40.FIX119_AMT_SETTL_CURR_AMT;
        assertEquals( "SETTL_CURR_AMT", fixData.getName());
        assertEquals( "119", fixData.getID());
        assertEquals( "SettlCurrAmt", fixData.getDescription());
        assertNotEquals( FIX40.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIX40.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX40.JUNK_ID, fixData.getID());
        assertNotEquals( FIX40.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0119Test() {
        Tag119AmtSettlCurrAmt tagData;

        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType("JohnWick-119SettlCurrAmt") );
        assertEquals( "JohnWick-119SettlCurrAmt", tagData.getDataValue());
        assertNotEquals( FIX40.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
}