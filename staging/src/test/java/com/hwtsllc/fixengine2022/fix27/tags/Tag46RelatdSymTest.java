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

@Deprecated
class Tag46RelatdSymTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0046Test() {
        FIXType fix46RelatdSym = FIXType.FIX46_RELATD_SYM;
        assertEquals( "RELATD_SYM", fix46RelatdSym.getName());
        assertEquals( "46", fix46RelatdSym.getID());
        assertEquals( "RelatdSym (No longer used)", fix46RelatdSym.getDescription());
        assertNotEquals( "RELATD_SYM RELATD_SYM", fix46RelatdSym.getName());
        assertNotEquals( "3123", fix46RelatdSym.getID());
        assertNotEquals( "RelatdSym (No longer used) RelatdSym (No longer used)", fix46RelatdSym.getDescription());
    }
    @Test
    void Tag0046Test() {
        Tag46RelatdSym tagData;
        //= new Tag46RelatdSym();
//        assertEquals( "N", tag46RelatdSym.getDataValue());
//        assertNotEquals( "A11", tag46RelatdSym.getDataValue());
        logger.info("Successful Tag0046Test()");
    }
}