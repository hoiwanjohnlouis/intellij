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
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag17ExecIDTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0017Test() {
        FIXType fix17ExecID = FIXType.FIX17_EXEC_ID;
        assertEquals( "EXEC_ID", fix17ExecID.getName());
        assertEquals( 17, fix17ExecID.getNumber());
        assertEquals( "ExecID", fix17ExecID.getDescription());
        assertNotEquals( "EXEC_ID EXEC_ID", fix17ExecID.getName());
        assertNotEquals( 111, fix17ExecID.getNumber());
        assertNotEquals( "123 ExecID", fix17ExecID.getDescription());
    }
    @Test
    void Tag0017Test() {
        Tag17ExecID tag17ExecID = new Tag17ExecID("BEST-1234");
        assertEquals( "BEST-1234", tag17ExecID.getDataValue());
        assertNotEquals( "11", tag17ExecID.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0017Test()");
    }
}