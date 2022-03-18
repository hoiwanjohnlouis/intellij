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

class Tag15CurrencyTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0015Test() {
        FIXType fix15Currency = FIXType.FIX15_CURRENCY;
        assertEquals( "CURRENCY", fix15Currency.getName());
        assertEquals( 15, fix15Currency.getNumber());
        assertEquals( "Currency", fix15Currency.getDescription());
        assertNotEquals( "CURRENCY CURRENCY", fix15Currency.getName());
        assertNotEquals( 111, fix15Currency.getNumber());
        assertNotEquals( "123 Currency", fix15Currency.getDescription());
    }
    @Test
    void Tag0015Test() {
        Tag15Currency tag15Currency = new Tag15Currency("USD");
        assertEquals( "USD", tag15Currency.getDataValue());
        assertNotEquals( "EURO", tag15Currency.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0015Test()");
    }
}