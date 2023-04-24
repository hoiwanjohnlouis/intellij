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

package com.hwtsllc.fixengine.tags.fix44.enums;

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
        assertEquals( "0", enumType.toFIXIDString() );
        assertEquals( "INITIAL", enumType.toFIXNameString() );
        assertEquals( "0 - Initial", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum895CollAsgnReason.SCHEDULED;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "SCHEDULED", enumType.toFIXNameString() );
        assertEquals( "1 - Scheduled", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum895CollAsgnReason.TIME_WARNING;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "TIME_WARNING", enumType.toFIXNameString() );
        assertEquals( "2 - Time Warning", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum895CollAsgnReason.MARGIN_DEFICIENCY;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "MARGIN_DEFICIENCY", enumType.toFIXNameString() );
        assertEquals( "3 - Margin Deficiency", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum895CollAsgnReason.MARGIN_EXCESS;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "MARGIN_EXCESS", enumType.toFIXNameString() );
        assertEquals( "4 - Margin Excess", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum895CollAsgnReason.FORWARD_COLLATERAL_DEMAND;
        assertEquals( "5", enumType.toFIXIDString() );
        assertEquals( "FORWARD_COLLATERAL_DEMAND", enumType.toFIXNameString() );
        assertEquals( "5 - Forward Collateral Demand", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum895CollAsgnReason.EVENT_OF_DEFAULT;
        assertEquals( "6", enumType.toFIXIDString() );
        assertEquals( "EVENT_OF_DEFAULT", enumType.toFIXNameString() );
        assertEquals( "6 - Event of default", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum895CollAsgnReason.ADVERSE_TAX_EVENT;
        assertEquals( "7", enumType.toFIXIDString() );
        assertEquals( "ADVERSE_TAX_EVENT", enumType.toFIXNameString() );
        assertEquals( "7 - Adverse tax event", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}