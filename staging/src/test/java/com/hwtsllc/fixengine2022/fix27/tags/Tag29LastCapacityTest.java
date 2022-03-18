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

class Tag29LastCapacityTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0029Test() {
        FIXType fix29LastCapacity = FIXType.FIX29_LAST_CAPACITY;
        assertEquals( "LAST_CAPACITY", fix29LastCapacity.getName());
        assertEquals( "29", fix29LastCapacity.getID());
        assertEquals( "LastCapacity", fix29LastCapacity.getDescription());
        assertNotEquals( "LAST_CAPACITY LAST_CAPACITY", fix29LastCapacity.getName());
        assertNotEquals( "2020", fix29LastCapacity.getID());
        assertNotEquals( "123 LastCapacity", fix29LastCapacity.getDescription());
    }
    @Test
    void Tag0029Test() {
        Tag29LastCapacity tag29LastCapacity;
        logger.info(WHERE_AM_I + ":Successful Tag0029Test()");
    }
}