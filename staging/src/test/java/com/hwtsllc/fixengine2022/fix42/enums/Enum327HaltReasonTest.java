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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
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

        /**
         * D, E, I, M, P, and X msg types
         */
        enumType = Enum327HaltReason.NEWS_DISSEMINATION;
        assertEquals( "D", enumType.getID());
        assertEquals( "NEWS_DISSEMINATION", enumType.getName());
        assertEquals( "D - News Dissemination", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum327HaltReason.ORDER_INFLUX;
        assertEquals( "E", enumType.getID());
        assertEquals( "ORDER_INFLUX", enumType.getName());
        assertEquals( "E - Order Influx", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum327HaltReason.ORDER_IMBALANCE;
        assertEquals( "I", enumType.getID());
        assertEquals( "ORDER_IMBALANCE", enumType.getName());
        assertEquals( "I - Order Imbalance", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum327HaltReason.ADDITIONAL_INFORMATION;
        assertEquals( "M", enumType.getID());
        assertEquals( "ADDITIONAL_INFORMATION", enumType.getName());
        assertEquals( "M - Additional Information", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum327HaltReason.NEW_PENDING;
        assertEquals( "P", enumType.getID());
        assertEquals( "NEW_PENDING", enumType.getName());
        assertEquals( "P - New Pending", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum327HaltReason.EQUIPMENT_CHANGE_OVER;
        assertEquals( "X", enumType.getID());
        assertEquals( "EQUIPMENT_CHANGE_OVER", enumType.getName());
        assertEquals( "X - Equipment Changeover", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}