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

class Tag25IOIQltyIndTest {
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
    void FIX0025Test() {
        FIXType fix25IOIQltyInd = FIXType.IOI_QLTY_IND;
        assertEquals( "IOI_QLTY_IND", fix25IOIQltyInd.getFIXName());
        assertEquals( 25, fix25IOIQltyInd.getFIXNumber());
        assertEquals( "IOIQltyInd", fix25IOIQltyInd.getFIXDescription());
        assertNotEquals( "IOI_QLTY_IND IOI_QLTY_IND", fix25IOIQltyInd.getFIXName());
        assertNotEquals( 2525, fix25IOIQltyInd.getFIXNumber());
        assertNotEquals( "123 IOIQltyInd", fix25IOIQltyInd.getFIXDescription());
    }
    @Test
    void Tag0025Test() {
        TagType tag25IOIQltyInd = new TagType(FIXType.IOI_QLTY_IND,"A");
        assertEquals( "A", tag25IOIQltyInd.getDataValue());
        assertNotEquals( "11", tag25IOIQltyInd.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0025Test()");
    }
}