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

class Tag17ExecIDTest {
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
    void FIX0017Test() {
        FIXType fix17ExecID = FIXType.EXEC_ID;
        assertEquals( "EXEC_ID", fix17ExecID.getFIXName());
        assertEquals( 17, fix17ExecID.getFIXNumber());
        assertEquals( "ExecID", fix17ExecID.getFIXDescription());
        assertNotEquals( "EXEC_ID EXEC_ID", fix17ExecID.getFIXName());
        assertNotEquals( 111, fix17ExecID.getFIXNumber());
        assertNotEquals( "123 ExecID", fix17ExecID.getFIXDescription());
    }
    @Test
    void Tag0017Test() {
        TagType tag17ExecID = new TagType(FIXType.COMM_TYPE,"BEST-1234");
        assertEquals( "BEST-1234", tag17ExecID.getDataValue());
        assertNotEquals( "11", tag17ExecID.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0017Test()");
    }
}