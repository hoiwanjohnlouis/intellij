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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  162
 *  SettlInstID
 *  String
 *  <p>
 *  Unique identifier for Settlement Instruction.
 */
class Tag162StrSettlInstIDTest {
    @Test
    void FIX0162Test() {
        FIX41 fixData = FIX41.FIX162_STR_SETTL_INST_ID;
        assertEquals( "162", fixData.toFIXIDString());
        assertEquals( "SETTL_INST_ID", fixData.toFIXNameString());
        assertEquals( "SettlInstID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0162Test() {
        Tag162StrSettlInstID tagData;

        tagData = new Tag162StrSettlInstID(new MyStringType(Tag162StrSettlInstID.TESTA_STR_SETTL_INST_ID));
        assertEquals( Tag162StrSettlInstID.TESTA_STR_SETTL_INST_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag162StrSettlInstID(new MyStringType(Tag162StrSettlInstID.TESTB_STR_SETTL_INST_ID));
        assertEquals( Tag162StrSettlInstID.TESTB_STR_SETTL_INST_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}