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
import com.hwtsllc.fixengine2022.fix27.enums.Enum40OrdType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag40EtOrdTypeTest {
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0040Test() {
        FIXType fixData = FIXType.FIX40_ET_ORD_TYPE;
        assertEquals( "ORD_TYPE", fixData.getName());
        assertEquals( "40", fixData.getID());
        assertEquals( "OrdType", fixData.getDescription());
        assertNotEquals( FIXType.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIXType.JUNK_NAME, fixData.getName());
        assertNotEquals( FIXType.JUNK_ID, fixData.getID());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0040Test() {
        Tag40EtOrdType tagData;

        /*
         * 1-9 Order Type msg
         */
        tagData = new Tag40EtOrdType(Enum40OrdType.MARKET);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.LIMIT);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.STOP_OR_STOP_LOSS);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.STOP_LIMIT);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.MARKET_ON_CLOSE);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.WITH_OR_WITHOUT);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.LIMIT_OR_BETTER);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.LIMIT_WITH_OR_WITHOUT);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.ON_BASIS);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());

        /*
         * A-Q Order Type msg
         */
        tagData = new Tag40EtOrdType(Enum40OrdType.ON_CLOSE);
        assertEquals( "A", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.LIMIT_ON_CLOSE);
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.FOREX_MARKET);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.PREVIOUSLY_QUOTED);
        assertEquals( "D", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.PREVIOUSLY_INDICATED);
        assertEquals( "E", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.FOREX_LIMIT);
        assertEquals( "F", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.FOREX_SWAP);
        assertEquals( "G", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.FOREX_PREVIOUSLY_QUOTED);
        assertEquals( "H", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.FUNARI);
        assertEquals( "I", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.MARKET_IF_TOUCHED);
        assertEquals( "J", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.MARKET_WITH_LEFT_OVER_AS_LIMIT);
        assertEquals( "K", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.PREVIOUS_FUND_VALUATION_POINT);
        assertEquals( "L", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.NEXT_FUND_VALUATION_POINT);
        assertEquals( "M", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.PEGGED);
        assertEquals( "P", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag40EtOrdType(Enum40OrdType.COUNTER_ORDER_SELECTION);
        assertEquals( "Q", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());

        logger.info("Successful Tag0040Test()");
    }
}