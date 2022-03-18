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
        assertEquals( "RULE_80_A", fix47Rule80A.getName());
        assertEquals( "47", fix47Rule80A.getID());
        assertEquals( "Rule80A (no longer used)", fix47Rule80A.getDescription());
        assertNotEquals( "RULE_80_A RULE_80_A", fix47Rule80A.getName());
        assertNotEquals( "3123", fix47Rule80A.getID());
        assertNotEquals( "Rule80A (no longer used) Rule80A (no longer used)", fix47Rule80A.getDescription());
    }
    @Test
    void Tag0047Test() {
        Tag47Rule80A tagData;
                // = new Tag47Rule80A(FIXType.FIX47_RULE_80_A,"N");
//        assertEquals( "N", tag47Rule80A.getDataValue());
//        assertNotEquals( "A11", tag47Rule80A.getDataValue());
        logger.info("Successful Tag0047Test()");
    }
}