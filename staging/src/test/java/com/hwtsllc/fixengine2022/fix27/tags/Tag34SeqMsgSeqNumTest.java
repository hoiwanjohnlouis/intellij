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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  34
 *  MsgSeqNum
 *  SeqNum
 *  Integer message sequence number.
 */
class Tag34SeqMsgSeqNumTest {

    @Test
    void FIX0034Test() {
        FIX27 fixData = FIX27.FIX34_SEQ_MSG_SEQ_NUM;
        assertEquals( "MSG_SEQ_NUM", fixData.getName());
        assertEquals( "34", fixData.getID());
        assertEquals( "MsgSeqNum", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0034Test() {
        Tag34SeqMsgSeqNum tagData;

        tagData = new Tag34SeqMsgSeqNum(new MySeqNumType(12345) );
        assertEquals( 12345, tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_SEQ_DATA_VALUE, tagData.getDataValue());
    }
}