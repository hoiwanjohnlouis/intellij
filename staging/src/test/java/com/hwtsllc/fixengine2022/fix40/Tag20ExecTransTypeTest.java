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

import com.hwtsllc.fixengine2022.TagType;
import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Deprecated
class Tag20ExecTransTypeTest {
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
    void FIX0020Test() {
        FIXType fix20ExecTransType = FIXType.EXEC_TRANS_TYPE;
        assertEquals( "EXEC_TRANS_TYPE", fix20ExecTransType.getFIXName());
        assertEquals( 20, fix20ExecTransType.getFIXNumber());
        assertEquals( "ExecTransType (replaced)", fix20ExecTransType.getFIXDescription());
        assertNotEquals( "EXEC_TRANS_TYPE EXEC_TRANS_TYPE", fix20ExecTransType.getFIXName());
        assertNotEquals( 2020, fix20ExecTransType.getFIXNumber());
        assertNotEquals( "123 ExecTransType (replaced)", fix20ExecTransType.getFIXDescription());
    }
    @Test
    void Tag0020Test() {
        TagType tag20ExecTransType = new TagType(FIXType.EXEC_TRANS_TYPE,"A");
        assertEquals( "A", tag20ExecTransType.getDataValue());
        assertNotEquals( "11", tag20ExecTransType.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0020Test()");
    }
}