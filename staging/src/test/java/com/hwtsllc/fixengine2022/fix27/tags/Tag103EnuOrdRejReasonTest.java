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

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix27.enums.Enum103OrdRejReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag103EnuOrdRejReasonTest {

    @Test
    void FIX0103Test() {
        FIX27 fixData = FIX27.FIX103_ENU_ORD_REJ_REASON;
        assertEquals( "ORD_REJ_REASON", fixData.getName());
        assertEquals( "103", fixData.getID());
        assertEquals( "OrdRejReason",  fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0103Test() {
        Tag103EnuOrdRejReason tagData;



        /**
         * 1-15, 18, 99 OrdRejReason types
         */


        /**
         *  1-15, OrdRejReason types
         */
        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.BROKER_OR_EXCHANGE);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.UNKNOWN_SYMBOL);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.EXCHANGE_CLOSED);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.ORDER_EXCEEDS_LIMIT);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.TOO_LATE_TO_ENTER);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.UNKNOWN_ORDER);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.DUPLICATE_ORDER);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.DUPLICATE_VERBAL_ORDER);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.STALE_ORDER);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.TRADE_ALONG_REQUIRED);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.INVALID_INVESTOR_ID);
        assertEquals( "10", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.UNSUPPORTED_ORDER_CHARACTERISTIC);
        assertEquals( "11", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.SURVEILLANCE_OPTION);
        assertEquals( "12", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.INCORRECT_QUANTITY);
        assertEquals( "13", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.INCORRECT_ALLOCATED_QUANTITY);
        assertEquals( "14", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.UNKNOWN_ACCOUNT);
        assertEquals( "15", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  18, OrdRejReason types
         */
        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.INVALID_PRICE_INCREMENT);
        assertEquals( "18", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  99, OrdRejReason types
         */
        tagData = new Tag103EnuOrdRejReason(Enum103OrdRejReason.OTHER);
        assertEquals( "99", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}