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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Deprecated
class Tag174StrSettlBrkrCodeTest {
    @Test
    void FIX0174Test() {
        FIX41 fixData = FIX41.FIX174_STR_SETTL_BRKR_CODE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX41.JUNK_ID, fixData.getID());
        assertNotEquals( FIX41.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0174Test() {
        Tag174StrSettlBrkrCode tagData;

        tagData = new Tag174StrSettlBrkrCode(new MyStringType(Tag174StrSettlBrkrCode.TESTA_STR_SETTL_BRKR_CODE));
        assertEquals( Tag174StrSettlBrkrCode.TESTA_STR_SETTL_BRKR_CODE, tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag174StrSettlBrkrCode(new MyStringType(Tag174StrSettlBrkrCode.TESTB_STR_SETTL_BRKR_CODE));
        assertEquals( Tag174StrSettlBrkrCode.TESTB_STR_SETTL_BRKR_CODE, tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}