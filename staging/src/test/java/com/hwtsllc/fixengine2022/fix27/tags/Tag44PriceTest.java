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

class Tag44PriceTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0044Test() {
        FIXType fix44Price = FIXType.FIX44_PRICE;
        assertEquals( "PRICE", fix44Price.getName());
        assertEquals( 44, fix44Price.getNumber());
        assertEquals( "Price", fix44Price.getDescription());
        assertNotEquals( "PRICE PRICE", fix44Price.getName());
        assertNotEquals( 3123, fix44Price.getNumber());
        assertNotEquals( "Price Price", fix44Price.getDescription());
    }
    @Test
    void Tag0044Test() {
        Tag44Price tag44Price;
//        assertEquals( "10.43", tag44Price.getDataValue());
//        assertNotEquals( "11.01", tag44Price.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0044Test()");
    }
}