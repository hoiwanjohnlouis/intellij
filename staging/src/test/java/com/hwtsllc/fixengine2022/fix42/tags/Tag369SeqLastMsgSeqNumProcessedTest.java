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
import com.hwtsllc.fixengine2022.datatypes.MySeqNumType;
import com.hwtsllc.fixengine2022.fix27.tags.Tag7SeqBeginSeqNo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag369SeqLastMsgSeqNumProcessedTest {
    @Test
    void FIX0369Test() {
        FIX42 fixData = FIX42.FIX369_SEQ_LAST_MSG_SEQ_NUM_PROCESSED;
        assertEquals( "369", fixData.getID());
        assertEquals( "LAST_MSG_SEQ_NUM_PROCESSED", fixData.getName());
        assertEquals( "LastMsgSeqNumProcessed", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0369Test() {
        Tag369SeqLastMsgSeqNumProcessed tagData;

        tagData = new Tag369SeqLastMsgSeqNumProcessed(new MySeqNumType(
                Tag369SeqLastMsgSeqNumProcessed.TESTA_SEQ_LAST_MSG_SEQ_NUM_PROCESSED) );
        assertEquals( Tag369SeqLastMsgSeqNumProcessed.TESTA_SEQ_LAST_MSG_SEQ_NUM_PROCESSED,
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_SEQ_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag369SeqLastMsgSeqNumProcessed(new MySeqNumType(
                Tag369SeqLastMsgSeqNumProcessed.TESTB_SEQ_LAST_MSG_SEQ_NUM_PROCESSED) );
        assertEquals( Tag369SeqLastMsgSeqNumProcessed.TESTB_SEQ_LAST_MSG_SEQ_NUM_PROCESSED,
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_SEQ_DATA_VALUE, tagData.getDataValue());
    }
}