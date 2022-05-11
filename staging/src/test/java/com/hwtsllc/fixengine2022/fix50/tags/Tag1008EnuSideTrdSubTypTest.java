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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1008SideTrdSubTyp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1008
 *  SideTrdSubTyp
 *  int
 *  <p>
 *  Used on a multi-sided trade to specify the type of trade for a given side
 *  <p></p>
 *  Valid values:
 *  <p>    0 - CMTA
 *  <p>    1 - Internal Transfer
 *  <p>    2 - External Transfer
 *  <p>    3 - Reject for Submitting Trade
 *  <p>    4 - Advisory for Contra Side
 *  <p></p>
 *  <p>    5 - Offset due to an allocation
 *  <p>    6 - Onset due to an allocation
 *  <p>    7 - Differential Spread
 *  <p>    8 - Implied Spread leg executed against an outright
 *  <p>    9 - Transaction from Exercise
 *  <p></p>
 *  <p>    10 - Transaction from Assignment
 */
class Tag1008EnuSideTrdSubTypTest {
    @Test
    void FIX1008Test() {
        FIX50 fixData = FIX50.FIX1008_ENU_SIDE_TRD_SUB_TYP;
        assertEquals( "1008", fixData.getID());
        assertEquals( "SIDE_TRD_SUB_TYP", fixData.getName());
        assertEquals( "SideTrdSubTyp", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1008Test() {
        Tag1008EnuSideTrdSubTyp tagData;

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.CMTA );
        assertEquals( Enum1008SideTrdSubTyp.CMTA.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.INTERNAL_TRANSFER );
        assertEquals( Enum1008SideTrdSubTyp.INTERNAL_TRANSFER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.EXTERNAL_TRANSFER );
        assertEquals( Enum1008SideTrdSubTyp.EXTERNAL_TRANSFER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.REJECT_SUBMISSION );
        assertEquals( Enum1008SideTrdSubTyp.REJECT_SUBMISSION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.ADVISORY_FOR_CONTRA );
        assertEquals( Enum1008SideTrdSubTyp.ADVISORY_FOR_CONTRA.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.OFFSET_DUE_TO_ALLOCATION );
        assertEquals( Enum1008SideTrdSubTyp.OFFSET_DUE_TO_ALLOCATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.ONSET_DUE_TO_ALLOCATION );
        assertEquals( Enum1008SideTrdSubTyp.ONSET_DUE_TO_ALLOCATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.DIFFERENTIAL_SPREAD );
        assertEquals( Enum1008SideTrdSubTyp.DIFFERENTIAL_SPREAD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.IMPLIED_SPREAD_LEG );
        assertEquals( Enum1008SideTrdSubTyp.IMPLIED_SPREAD_LEG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.TRANSACTION_FROM_EXERCISE );
        assertEquals( Enum1008SideTrdSubTyp.TRANSACTION_FROM_EXERCISE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.TRANSACTION_FROM_ASSIGNMENT );
        assertEquals( Enum1008SideTrdSubTyp.TRANSACTION_FROM_ASSIGNMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}