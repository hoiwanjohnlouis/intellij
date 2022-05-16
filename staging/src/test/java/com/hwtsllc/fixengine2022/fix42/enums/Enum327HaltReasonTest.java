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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Enum327HaltReasonTest {
    @Test
    void Enum0327Test() {
        Enum327HaltReason enumType;

        /*
         * D, E, I, M, P, and X msg types
         */
        enumType = Enum327HaltReason.NEWS_DISSEMINATION;
        assertEquals( "D", enumType.toFIXIDString());
        assertEquals( "NEWS_DISSEMINATION", enumType.toFIXNameString());
        assertEquals( "D - News Dissemination", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum327HaltReason.ORDER_INFLUX;
        assertEquals( "E", enumType.toFIXIDString());
        assertEquals( "ORDER_INFLUX", enumType.toFIXNameString());
        assertEquals( "E - Order Influx", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum327HaltReason.ORDER_IMBALANCE;
        assertEquals( "I", enumType.toFIXIDString());
        assertEquals( "ORDER_IMBALANCE", enumType.toFIXNameString());
        assertEquals( "I - Order Imbalance", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum327HaltReason.ADDITIONAL_INFORMATION;
        assertEquals( "M", enumType.toFIXIDString());
        assertEquals( "ADDITIONAL_INFORMATION", enumType.toFIXNameString());
        assertEquals( "M - Additional Information", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum327HaltReason.NEW_PENDING;
        assertEquals( "P", enumType.toFIXIDString());
        assertEquals( "NEW_PENDING", enumType.toFIXNameString());
        assertEquals( "P - New Pending", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum327HaltReason.EQUIPMENT_CHANGE_OVER;
        assertEquals( "X", enumType.toFIXIDString());
        assertEquals( "EQUIPMENT_CHANGE_OVER", enumType.toFIXNameString());
        assertEquals( "X - Equipment Changeover", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}