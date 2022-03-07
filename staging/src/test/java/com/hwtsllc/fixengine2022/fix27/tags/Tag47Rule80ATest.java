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
import com.hwtsllc.fixengine2022.fix27.tags.Tag47Rule80A;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Deprecated
class Tag47Rule80ATest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0047Test() {
        FIXType fix47Rule80A = FIXType.FIX47_RULE_80_A;
        assertEquals( "RULE_80_A", fix47Rule80A.getFIXName());
        assertEquals( 47, fix47Rule80A.getFIXNumber());
        assertEquals( "Rule80A (no longer used)", fix47Rule80A.getFIXDescription());
        assertNotEquals( "RULE_80_A RULE_80_A", fix47Rule80A.getFIXName());
        assertNotEquals( 3123, fix47Rule80A.getFIXNumber());
        assertNotEquals( "Rule80A (no longer used) Rule80A (no longer used)", fix47Rule80A.getFIXDescription());
    }
    @Test
    void Tag0047Test() {
        Tag47Rule80A tag47Rule80A;
                // = new Tag47Rule80A(FIXType.FIX47_RULE_80_A,"N");
//        assertEquals( "N", tag47Rule80A.getDataValue());
//        assertNotEquals( "A11", tag47Rule80A.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0047Test()");
    }
}