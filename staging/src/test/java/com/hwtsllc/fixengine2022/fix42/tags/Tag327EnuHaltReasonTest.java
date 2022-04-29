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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum327HaltReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag327EnuHaltReasonTest {
    @Test
    void FIX0327Test() {
        FIX42 fixData = FIX42.FIX327_ENU_HALT_REASON;
        assertEquals( "327", fixData.getID());
        assertEquals( "HALT_REASON", fixData.getName());
        assertEquals( "HaltReason", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag327
     *  Enu
     *  HaltReason
     *
     *      D, E, I, M, P, and X msg types
     *      NEWS_DISSEMINATION( "D", "NEWS_DISSEMINATION", "D - News Dissemination" ),
     *      ORDER_INFLUX( "E", "ORDER_INFLUX", "E - Order Influx" ),
     *      ORDER_IMBALANCE( "I", "ORDER_IMBALANCE", "I - Order Imbalance" ),
     *      ADDITIONAL_INFORMATION( "M", "ADDITIONAL_INFORMATION", "M - Additional Information" ),
     *      NEW_PENDING( "P", "NEW_PENDING", "P - New Pending" ),
     *      EQUIPMENT_CHANGE_OVER( "X", "EQUIPMENT_CHANGE_OVER", "X - Equipment Changeover" ),
     */
    @Test
    void Tag0327Test() {
        Tag327EnuHaltReason tagData;

        /**
         * D, E, I, M, P, and X msg types
         */
        tagData = new Tag327EnuHaltReason(Enum327HaltReason.NEWS_DISSEMINATION);
        assertEquals( Enum327HaltReason.NEWS_DISSEMINATION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag327EnuHaltReason(Enum327HaltReason.ORDER_INFLUX);
        assertEquals( Enum327HaltReason.ORDER_INFLUX.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag327EnuHaltReason(Enum327HaltReason.ORDER_IMBALANCE);
        assertEquals( Enum327HaltReason.ORDER_IMBALANCE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag327EnuHaltReason(Enum327HaltReason.ADDITIONAL_INFORMATION);
        assertEquals( Enum327HaltReason.ADDITIONAL_INFORMATION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag327EnuHaltReason(Enum327HaltReason.NEW_PENDING);
        assertEquals( Enum327HaltReason.NEW_PENDING.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag327EnuHaltReason(Enum327HaltReason.EQUIPMENT_CHANGE_OVER);
        assertEquals( Enum327HaltReason.EQUIPMENT_CHANGE_OVER.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}