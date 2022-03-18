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

import com.hwtsllc.fixengine2022.fix27.enums.Enum4AdvSide;
import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag4AdvSideTest {
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
    void FIX0004Test() {
        FIXType fix4AdvSide = FIXType.FIX4_ADV_SIDE;
        assertEquals( "ADV_SIDE", fix4AdvSide.getName());
        assertEquals( "4", fix4AdvSide.getID());
        assertEquals( "AdvSide", fix4AdvSide.getDescription());
        assertNotEquals( "ADV SIDE", fix4AdvSide.getName());
        assertNotEquals( "44", fix4AdvSide.getID());
        assertNotEquals( "Adv Side", fix4AdvSide.getDescription());
    }
    @Test
    void Tag0004Test() {
        Tag4AdvSide tag4AdvSide = new Tag4AdvSide(Enum4AdvSide.BUY);
        assertEquals( "B", tag4AdvSide.getDataValue());
        assertNotEquals( "abcdefghij", tag4AdvSide.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0004Test()");
    }
}