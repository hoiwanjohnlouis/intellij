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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix27.enums.Enum59TimeInForce;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  59
 *  TimeInForce
 *  char
 *  Specifies how long the order remains in effect.
 *
 *  Absence of this field is interpreted as DAY.
 *
 *  NOTE not applicable to CIV Orders.
 *  (see Volume : "Glossary" for value definitions)
 *
 *  Valid values:
 *      0 - Day (or session)
 *      1 - Good Till Cancel (GTC)
 *      2 - At the Opening (OPG)
 *      3 - Immediate Or Cancel (IOC)
 *      4 - Fill Or Kill (FOK)
 *      5 - Good Till Crossing (GTX)
 *      6 - Good Till Date (GTD)
 *      7 - At the Close
 */
class Tag59EnuTimeInForceTest {
    @Test
    void FIX0059Test() {
        FIX27 fixData = FIX27.FIX59_ENU_TIME_IN_FORCE;
        assertEquals( "TIME_IN_FORCE", fixData.getName());
        assertEquals( "59", fixData.getID());
        assertEquals( "TimeInForce", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0059Test() {
        Tag59EnuTimeInForce tagData;

        /**
         * 0-7 TimeInForce types
         */
        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.DAY);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.GOOD_TILL_CANCEL);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.AT_THE_OPENING);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.IMMEDIATE_OR_CANCEL);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.FILL_OR_KILL);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.GOOD_TILL_CROSSING);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.GOOD_TILL_DATE);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.AT_THE_CLOSE);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}