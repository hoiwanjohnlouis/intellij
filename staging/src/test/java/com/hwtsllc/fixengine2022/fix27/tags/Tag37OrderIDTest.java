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

class Tag37OrderIDTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0037Test() {
        FIXType fix37OrderID = FIXType.FIX37_ORDER_ID;
        assertEquals( "ORDER_ID", fix37OrderID.getName());
        assertEquals( "37", fix37OrderID.getID());
        assertEquals( "OrderID", fix37OrderID.getDescription());
        assertNotEquals( "ORDER_ID ORDER_ID", fix37OrderID.getName());
        assertNotEquals( "312", fix37OrderID.getID());
        assertNotEquals( "OrderID OrderID", fix37OrderID.getDescription());
    }
    @Test
    void Tag0037Test() {
        Tag37OrderID tagData = new Tag37OrderID("ORD-24601");
        assertEquals( "ORD-24601", tagData.getDataValue());
        assertNotEquals( "112233", tagData.getDataValue());
        logger.info("Successful Tag0037Test()");
    }
}