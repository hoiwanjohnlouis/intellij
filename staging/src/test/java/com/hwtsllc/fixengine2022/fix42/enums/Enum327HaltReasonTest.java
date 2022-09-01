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
class Enum327HaltReasonTest {
    @Test
    void Enum0327Test() {
        Enum327HaltReason enumType;

        /*
         * D, E, I, M, P, and X msg types
         */
        enumType = Enum327HaltReason.NEWS_DISSEMINATION;
        assertEquals( "D", enumType.toEnumIDString());
        assertEquals( "NEWS_DISSEMINATION", enumType.toEnumNameString());
        assertEquals( "D - News Dissemination", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum327HaltReason.ORDER_INFLUX;
        assertEquals( "E", enumType.toEnumIDString());
        assertEquals( "ORDER_INFLUX", enumType.toEnumNameString());
        assertEquals( "E - Order Influx", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum327HaltReason.ORDER_IMBALANCE;
        assertEquals( "I", enumType.toEnumIDString());
        assertEquals( "ORDER_IMBALANCE", enumType.toEnumNameString());
        assertEquals( "I - Order Imbalance", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum327HaltReason.ADDITIONAL_INFORMATION;
        assertEquals( "M", enumType.toEnumIDString());
        assertEquals( "ADDITIONAL_INFORMATION", enumType.toEnumNameString());
        assertEquals( "M - Additional Information", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum327HaltReason.NEW_PENDING;
        assertEquals( "P", enumType.toEnumIDString());
        assertEquals( "NEW_PENDING", enumType.toEnumNameString());
        assertEquals( "P - New Pending", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum327HaltReason.EQUIPMENT_CHANGE_OVER;
        assertEquals( "X", enumType.toEnumIDString());
        assertEquals( "EQUIPMENT_CHANGE_OVER", enumType.toEnumNameString());
        assertEquals( "X - Equipment Changeover", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}