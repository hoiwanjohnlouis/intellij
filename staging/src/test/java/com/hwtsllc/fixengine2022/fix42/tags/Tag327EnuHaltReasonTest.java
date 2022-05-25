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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum327HaltReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  327
 *  Enu
 *  HaltReason
 *  char
 *  <p>
 *  Denotes the reason for the Opening Delay or Trading Halt.
 *  <p></p>
 *  Valid values:
 *  <p>    D, E, I, M, P, and X msg types
 *  <p>    "D - News Dissemination"
 *  <p>    "E - Order Influx"
 *  <p>    "I - Order Imbalance"
 *  <p>    "M - Additional Information"
 *  <p>    "P - New Pending"
 *  <p></p>
 *  <p>    "X - Equipment Changeover"
 */
class Tag327EnuHaltReasonTest {
    @Test
    void FIX0327Test() {
        FIX42 fixData = FIX42.FIX327_ENU_HALT_REASON;
        assertEquals( "327", fixData.toFIXIDString());
        assertEquals( "HALT_REASON", fixData.toFIXNameString());
        assertEquals( "HaltReason", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0327Test() {
        Tag327EnuHaltReason tagData;

        /*
         * D, E, I, M, P, and X msg types
         */
        tagData = new Tag327EnuHaltReason(Enum327HaltReason.NEWS_DISSEMINATION);
        assertEquals( Enum327HaltReason.NEWS_DISSEMINATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag327EnuHaltReason(Enum327HaltReason.ORDER_INFLUX);
        assertEquals( Enum327HaltReason.ORDER_INFLUX.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag327EnuHaltReason(Enum327HaltReason.ORDER_IMBALANCE);
        assertEquals( Enum327HaltReason.ORDER_IMBALANCE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag327EnuHaltReason(Enum327HaltReason.ADDITIONAL_INFORMATION);
        assertEquals( Enum327HaltReason.ADDITIONAL_INFORMATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag327EnuHaltReason(Enum327HaltReason.NEW_PENDING);
        assertEquals( Enum327HaltReason.NEW_PENDING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag327EnuHaltReason(Enum327HaltReason.EQUIPMENT_CHANGE_OVER);
        assertEquals( Enum327HaltReason.EQUIPMENT_CHANGE_OVER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}