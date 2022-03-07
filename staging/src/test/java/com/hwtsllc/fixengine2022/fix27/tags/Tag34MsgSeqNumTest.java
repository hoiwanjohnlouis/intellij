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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.fix27.tags.Tag34MsgSeqNum;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag34MsgSeqNumTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();
    // private static final Logger logger = LogManager.getLogger(Tag1Account.class);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0034Test() {
        FIXType fix34MsgSeqNum = FIXType.FIX34_MSG_SEQ_NUM;
        assertEquals( "MSG_SEQ_NUM", fix34MsgSeqNum.getFIXName());
        assertEquals( 34, fix34MsgSeqNum.getFIXNumber());
        assertEquals( "MsgSeqNum", fix34MsgSeqNum.getFIXDescription());
        assertNotEquals( "MSG_SEQ_NUM MSG_SEQ_NUM", fix34MsgSeqNum.getFIXName());
        assertNotEquals( 312, fix34MsgSeqNum.getFIXNumber());
        assertNotEquals( "MsgSeqNum MsgSeqNum", fix34MsgSeqNum.getFIXDescription());
    }
    @Test
    void Tag0034Test() {
        Tag34MsgSeqNum tag34MsgSeqNum = new Tag34MsgSeqNum();
        assertEquals( "12345", tag34MsgSeqNum.getDataValue());
        assertNotEquals( "11", tag34MsgSeqNum.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0034Test()");
    }
}