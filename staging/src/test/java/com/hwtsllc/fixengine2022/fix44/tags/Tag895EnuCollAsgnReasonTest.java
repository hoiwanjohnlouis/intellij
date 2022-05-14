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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum895CollAsgnReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Tag895EnuCollAsgnReasonTest {
    @Test
    void FIX0895Test() {
        FIX44 fixData = FIX44.FIX895_ENU_COLL_ASGN_REASON;
        assertEquals( "895", fixData.getID());
        assertEquals( "COLL_ASGN_REASON", fixData.getName());
        assertEquals( "CollAsgnReason", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0895Test() {
        Tag895EnuCollAsgnReason tagData;

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.INITIAL );
        assertEquals( Enum895CollAsgnReason.INITIAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.SCHEDULED );
        assertEquals( Enum895CollAsgnReason.SCHEDULED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.TIME_WARNING );
        assertEquals( Enum895CollAsgnReason.TIME_WARNING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.MARGIN_DEFICIENCY );
        assertEquals( Enum895CollAsgnReason.MARGIN_DEFICIENCY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.MARGIN_EXCESS );
        assertEquals( Enum895CollAsgnReason.MARGIN_EXCESS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.FORWARD_COLLATERAL_DEMAND );
        assertEquals( Enum895CollAsgnReason.FORWARD_COLLATERAL_DEMAND.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.EVENT_OF_DEFAULT );
        assertEquals( Enum895CollAsgnReason.EVENT_OF_DEFAULT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.ADVERSE_TAX_EVENT );
        assertEquals( Enum895CollAsgnReason.ADVERSE_TAX_EVENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}