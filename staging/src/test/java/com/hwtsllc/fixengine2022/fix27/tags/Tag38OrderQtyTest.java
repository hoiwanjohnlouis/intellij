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

class Tag38OrderQtyTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0038Test() {
        FIXType fix38OrderQty = FIXType.FIX38_ORDER_QTY;
        assertEquals( "ORDER_QTY", fix38OrderQty.getName());
        assertEquals( 38, fix38OrderQty.getNumber());
        assertEquals( "OrderQty", fix38OrderQty.getDescription());
        assertNotEquals( "ORDER_QTY ORDER_QTY", fix38OrderQty.getName());
        assertNotEquals( 312, fix38OrderQty.getNumber());
        assertNotEquals( "OrderQty OrderQty", fix38OrderQty.getDescription());
    }
    @Test
    void Tag0038Test() {
        Tag38OrderQty tag38OrderQty;
        //= new Tag38OrderQty();
//        assertEquals( "100", tag38OrderQty.getDataValue());
//        assertNotEquals( "11", tag38OrderQty.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0038Test()");
    }
}