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
import com.hwtsllc.fixengine2022.fix27.enums.Enum39OrdStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag39EnuOrdStatusTest {

    @Test
    void FIX0039Test() {
        FIX27 fixData = FIX27.FIX39_ENU_ORD_STATUS;
        assertEquals( "ORD_STATUS", fixData.getName());
        assertEquals( "39", fixData.getID());
        assertEquals( "OrdStatus", fixData.getDescription());
        assertNotEquals( FIX27.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIX27.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX27.JUNK_ID, fixData.getID());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0039Test() {
        Tag39EnuOrdStatus tagData;

        /*
         * 0-9 Order Status msg
         */
        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.NEW);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.PARTIALLY_FILLED);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.FILLED);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.DONE_FOR_DAY);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.CANCELED);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.REPLACED);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.PENDING_CANCEL);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.STOPPED);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.REJECTED);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.SUSPENDED);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         * A-E Order Status msg
         */
        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.PENDING_NEW);
        assertEquals( "A", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.CALCULATED);
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.EXPIRED);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.ACCEPTED_FOR_BIDDING);
        assertEquals( "D", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag39EnuOrdStatus(Enum39OrdStatus.PENDING_REPLACE);
        assertEquals( "E", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}