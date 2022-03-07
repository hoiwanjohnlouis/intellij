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
import com.hwtsllc.fixengine2022.fix27.tags.Tag18ExecInst;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag18ExecInstTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0018Test() {
        FIXType fix18ExecInst = FIXType.FIX18_EXEC_INST;
        assertEquals( "EXEC_INST", fix18ExecInst.getFIXName());
        assertEquals( 18, fix18ExecInst.getFIXNumber());
        assertEquals( "ExecInst", fix18ExecInst.getFIXDescription());
        assertNotEquals( "EXEC_INST EXEC_INST", fix18ExecInst.getFIXName());
        assertNotEquals( 1818, fix18ExecInst.getFIXNumber());
        assertNotEquals( "123 ExecInst", fix18ExecInst.getFIXDescription());
    }
    @Test
    void Tag0018Test() {
        Tag18ExecInst tag18ExecInst;
        //= new TagType(FIXType.FIX18_EXEC_INST,"A");
//        assertEquals( "A", tag18ExecInst.getDataValue());
//        assertNotEquals( "11", tag18ExecInst.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0018Test()");
    }
}