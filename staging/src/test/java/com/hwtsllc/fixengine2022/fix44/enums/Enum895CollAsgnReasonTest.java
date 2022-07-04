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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  895
 *  CollAsgnReason
 *  int
 *  <p></p>
 *  Reason for Collateral Assignment
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Initial
 *  <p>    1 - Scheduled
 *  <p>    2 - Time Warning
 *  <p>    3 - Margin Deficiency
 *  <p>    4 - Margin Excess
 *  <p></p>
 *  <p>    5 - Forward Collateral Demand
 *  <p>    6 - Event of default
 *  <p>    7 - Adverse tax event
 */
class Enum895CollAsgnReasonTest {
    @Test
    void EnumTest() {
        Enum895CollAsgnReason enumType;

        enumType = Enum895CollAsgnReason.INITIAL;
        assertEquals( "0", enumType.toEnumIDString() );
        assertEquals( "INITIAL", enumType.toEnumNameString() );
        assertEquals( "0 - Initial", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum895CollAsgnReason.SCHEDULED;
        assertEquals( "1", enumType.toEnumIDString() );
        assertEquals( "SCHEDULED", enumType.toEnumNameString() );
        assertEquals( "1 - Scheduled", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum895CollAsgnReason.TIME_WARNING;
        assertEquals( "2", enumType.toEnumIDString() );
        assertEquals( "TIME_WARNING", enumType.toEnumNameString() );
        assertEquals( "2 - Time Warning", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum895CollAsgnReason.MARGIN_DEFICIENCY;
        assertEquals( "3", enumType.toEnumIDString() );
        assertEquals( "MARGIN_DEFICIENCY", enumType.toEnumNameString() );
        assertEquals( "3 - Margin Deficiency", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum895CollAsgnReason.MARGIN_EXCESS;
        assertEquals( "4", enumType.toEnumIDString() );
        assertEquals( "MARGIN_EXCESS", enumType.toEnumNameString() );
        assertEquals( "4 - Margin Excess", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum895CollAsgnReason.FORWARD_COLLATERAL_DEMAND;
        assertEquals( "5", enumType.toEnumIDString() );
        assertEquals( "FORWARD_COLLATERAL_DEMAND", enumType.toEnumNameString() );
        assertEquals( "5 - Forward Collateral Demand", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum895CollAsgnReason.EVENT_OF_DEFAULT;
        assertEquals( "6", enumType.toEnumIDString() );
        assertEquals( "EVENT_OF_DEFAULT", enumType.toEnumNameString() );
        assertEquals( "6 - Event of default", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum895CollAsgnReason.ADVERSE_TAX_EVENT;
        assertEquals( "7", enumType.toEnumIDString() );
        assertEquals( "ADVERSE_TAX_EVENT", enumType.toEnumNameString() );
        assertEquals( "7 - Adverse tax event", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}