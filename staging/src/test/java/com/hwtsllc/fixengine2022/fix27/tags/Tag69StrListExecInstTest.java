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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  69
 *  ListExecInst
 *  String
 *  Free format text message containing list handling and execution instructions.
 */
class Tag69StrListExecInstTest {
    @Test
    void FIX0069Test() {
        FIX27 fixData = FIX27.FIX69_STR_LIST_EXEC_INST;
        assertEquals( "LIST_EXEC_INST", fixData.toFIXNameString());
        assertEquals( "69", fixData.toFIXIDString());
        assertEquals( "ListExecInst", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0069Test() {
        Tag69StrListExecInst tagData;

        tagData = new Tag69StrListExecInst(new MyStringType(Tag69StrListExecInst.TESTA_STR_LIST_EXEC_INST) );
        assertEquals(Tag69StrListExecInst.TESTA_STR_LIST_EXEC_INST, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}