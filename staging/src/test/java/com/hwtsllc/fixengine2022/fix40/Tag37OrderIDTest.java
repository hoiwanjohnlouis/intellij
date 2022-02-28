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

class Tag37OrderIDTest {
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
    void FIX0037Test() {
        FIXType fix37OrderID = FIXType.ORDER_ID;
        assertEquals( "ORDER_ID", fix37OrderID.getFIXName());
        assertEquals( 37, fix37OrderID.getFIXNumber());
        assertEquals( "OrderID", fix37OrderID.getFIXDescription());
        assertNotEquals( "ORDER_ID ORDER_ID", fix37OrderID.getFIXName());
        assertNotEquals( 312, fix37OrderID.getFIXNumber());
        assertNotEquals( "OrderID OrderID", fix37OrderID.getFIXDescription());
    }
    @Test
    void Tag0037Test() {
        TagType tag37OrderID = new TagType(FIXType.ORDER_ID,"24601");
        assertEquals( "24601", tag37OrderID.getDataValue());
        assertNotEquals( "11", tag37OrderID.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0037Test()");
    }
}