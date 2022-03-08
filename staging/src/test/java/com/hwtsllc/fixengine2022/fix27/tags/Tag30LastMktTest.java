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
import com.hwtsllc.fixengine2022.fix27.tags.Tag30LastMkt;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag30LastMktTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0030Test() {
        FIXType fix30LastMkt = FIXType.FIX30_LAST_MKT;
        assertEquals( "LAST_MKT", fix30LastMkt.getFIXName());
        assertEquals( 30, fix30LastMkt.getFIXNumber());
        assertEquals( "LastMkt", fix30LastMkt.getFIXDescription());
        assertNotEquals( "LAST_MKT LAST_MKT", fix30LastMkt.getFIXName());
        assertNotEquals( 2020, fix30LastMkt.getFIXNumber());
        assertNotEquals( "123 LastMkt", fix30LastMkt.getFIXDescription());
    }
    @Test
    void Tag0030Test() {
        Tag30LastMkt tag30LastMkt;
        //= new Tag30LastMkt();
//        assertEquals( "N", tag30LastMkt.getDataValue());
//        assertNotEquals( "A11", tag30LastMkt.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0030Test()");
    }
}