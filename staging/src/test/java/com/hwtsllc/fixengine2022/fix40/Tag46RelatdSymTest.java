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
class Tag46RelatdSymTest {
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
    void FIX0046Test() {
        FIXType fix46RelatdSym = FIXType.RELATD_SYM;
        assertEquals( "RELATD_SYM", fix46RelatdSym.getFIXName());
        assertEquals( 46, fix46RelatdSym.getFIXNumber());
        assertEquals( "RelatdSym (No longer used)", fix46RelatdSym.getFIXDescription());
        assertNotEquals( "RELATD_SYM RELATD_SYM", fix46RelatdSym.getFIXName());
        assertNotEquals( 3123, fix46RelatdSym.getFIXNumber());
        assertNotEquals( "RelatdSym (No longer used) RelatdSym (No longer used)", fix46RelatdSym.getFIXDescription());
    }
    @Test
    void Tag0046Test() {
        TagType tag46RelatdSym = new TagType(FIXType.RELATD_SYM,"N");
        assertEquals( "N", tag46RelatdSym.getDataValue());
        assertNotEquals( "A11", tag46RelatdSym.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0046Test()");
    }
}