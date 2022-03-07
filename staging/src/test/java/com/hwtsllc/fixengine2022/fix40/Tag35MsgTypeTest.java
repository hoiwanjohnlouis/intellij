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

package com.hwtsllc.fixengine2022.fix40;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag35MsgTypeTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0035Test() {
        FIXType fix35MsgType = FIXType.FIX35_MSG_TYPE;
        assertEquals( "MSG_TYPE", fix35MsgType.getFIXName());
        assertEquals( 35, fix35MsgType.getFIXNumber());
        assertEquals( "MsgType", fix35MsgType.getFIXDescription());
        assertNotEquals( "MSG_TYPE MSG_TYPE", fix35MsgType.getFIXName());
        assertNotEquals( 312, fix35MsgType.getFIXNumber());
        assertNotEquals( "MsgType MsgType", fix35MsgType.getFIXDescription());
    }
    @Test
    void Tag0035Test() {
        Tag35MsgType tag35MsgType;
        logger.info(WHERE_AM_I + ":Successful Tag0035Test()");
    }
}