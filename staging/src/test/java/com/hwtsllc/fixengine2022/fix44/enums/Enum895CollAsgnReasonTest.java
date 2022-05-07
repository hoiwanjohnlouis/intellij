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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

/**
 *  895
 *  CollAsgnReason
 *  int
 *  Reason for Collateral Assignment
 *  Valid values:
 *      0 - Initial
 *      1 - Scheduled
 *      2 - Time Warning
 *      3 - Margin Deficiency
 *      4 - Margin Excess
 *      5 - Forward Collateral Demand
 *      6 - Event of default
 *      7 - Adverse tax event
 */
class Enum895CollAsgnReasonTest {
    @Test
    void EnumTest() {
        Enum895CollAsgnReason enumType;

        enumType = Enum895CollAsgnReason.INITIAL;
        assertEquals( "0", enumType.getID() );
        assertEquals( "INITIAL", enumType.getName() );
        assertEquals( "0 - Initial", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum895CollAsgnReason.SCHEDULED;
        assertEquals( "1", enumType.getID() );
        assertEquals( "SCHEDULED", enumType.getName() );
        assertEquals( "1 - Scheduled", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum895CollAsgnReason.TIME_WARNING;
        assertEquals( "2", enumType.getID() );
        assertEquals( "TIME_WARNING", enumType.getName() );
        assertEquals( "2 - Time Warning", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum895CollAsgnReason.MARGIN_DEFICIENCY;
        assertEquals( "3", enumType.getID() );
        assertEquals( "MARGIN_DEFICIENCY", enumType.getName() );
        assertEquals( "3 - Margin Deficiency", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum895CollAsgnReason.MARGIN_EXCESS;
        assertEquals( "4", enumType.getID() );
        assertEquals( "MARGIN_EXCESS", enumType.getName() );
        assertEquals( "4 - Margin Excess", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum895CollAsgnReason.FORWARD_COLLATERAL_DEMAND;
        assertEquals( "5", enumType.getID() );
        assertEquals( "FORWARD_COLLATERAL_DEMAND", enumType.getName() );
        assertEquals( "5 - Forward Collateral Demand", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum895CollAsgnReason.EVENT_OF_DEFAULT;
        assertEquals( "6", enumType.getID() );
        assertEquals( "EVENT_OF_DEFAULT", enumType.getName() );
        assertEquals( "6 - Event of default", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum895CollAsgnReason.ADVERSE_TAX_EVENT;
        assertEquals( "7", enumType.getID() );
        assertEquals( "ADVERSE_TAX_EVENT", enumType.getName() );
        assertEquals( "7 - Adverse tax event", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}