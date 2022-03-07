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
import com.hwtsllc.fixengine2022.fix27.tags.Tag21HandlInst;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag21HandlInstTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0021Test() {
        FIXType fix21HandlInst = FIXType.FIX21_HANDL_INST;
        assertEquals( "HANDL_INST", fix21HandlInst.getFIXName());
        assertEquals( 21, fix21HandlInst.getFIXNumber());
        assertEquals( "HandlInst", fix21HandlInst.getFIXDescription());
        assertNotEquals( "HANDL_INST HANDL_INST", fix21HandlInst.getFIXName());
        assertNotEquals( 2121, fix21HandlInst.getFIXNumber());
        assertNotEquals( "123 HandlInst", fix21HandlInst.getFIXDescription());
    }
    @Test
    void Tag0021Test() {
        Tag21HandlInst tag21HandlInst;
        //= new Tag21HandlInst(FIXType.FIX21_HANDL_INST,"A");
//        assertEquals( "A", tag21HandlInst.getDataValue());
//        assertNotEquals( "11", tag21HandlInst.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0021Test()");
    }
}