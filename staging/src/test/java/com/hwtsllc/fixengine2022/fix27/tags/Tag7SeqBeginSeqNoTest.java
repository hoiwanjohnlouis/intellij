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
import com.hwtsllc.fixengine2022.datatypes.MySeqNumType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  7
 *  BeginSeqNo
 *  SeqNum
 *  Message sequence number of first message in range to be resent
 */
class Tag7SeqBeginSeqNoTest {
    @Test
    void FIX0007Test() {
        FIX27 fixData = FIX27.FIX7_SEQ_BEGIN_SEQ_NO;
        assertEquals( "BEGIN_SEQ_NO", fixData.getName());
        assertEquals( "7", fixData.getID());
        assertEquals( "BeginSeqNo", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0007Test() {
        Log7SeqBeginSeqNo tagData;

        tagData = new Log7SeqBeginSeqNo(new MySeqNumType(Log7SeqBeginSeqNo.TESTA_SEQ_BEGIN_SEQ_NO) );
        assertEquals( Log7SeqBeginSeqNo.TESTA_SEQ_BEGIN_SEQ_NO, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_SEQ_DATA_VALUE, tagData.getDataValue());

        tagData = new Log7SeqBeginSeqNo(new MySeqNumType(Log7SeqBeginSeqNo.TESTB_SEQ_BEGIN_SEQ_NO) );
        assertEquals( Log7SeqBeginSeqNo.TESTB_SEQ_BEGIN_SEQ_NO, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_SEQ_DATA_VALUE, tagData.getDataValue());
    }
}