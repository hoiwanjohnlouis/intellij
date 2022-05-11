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
import com.hwtsllc.fixengine2022.datatypes.MyEnumTimeUnit;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  997 (same as 997, 1000, 1001)
 *  TimeUnit
 *  String
 *  <p>
 *  Unit of time associated with the contract.
 *  <p>
 *  NOTE: Additional values may be used by mutual agreement of the counterparties
 *  <p></p>
 *  1000
 *  UnderlyingTimeUnit
 *  String
 *  <p>
 *  Same as TimeUnit (997).
 *  <p></p>
 *  1001
 *  LegTimeUnit
 *  String
 *  <p>
 *  Same as TimeUnit (997).
 *  <p></p>
 *  Valid values:
 *  <p>    H - Hour
 *  <p>    Min - Minute
 *  <p>    S - Second
 *  <p></p>
 *  <p>    D - Day
 *  <p>    Wk - Week
 *  <p>    Mo - Month
 *  <p>    Yr - Year
 */
class Tag1000EnuUnderlyingTimeUnitTest {
    @Test
    void FIX1000Test() {
        FIX50 fixData = FIX50.FIX1000_ENU_UNDERLYING_TIME_UNIT;
        assertEquals( "UNDERLYING_TIME_UNIT", fixData.getName());
        assertEquals( "1000", fixData.getID());
        assertEquals( "UnderlyingTimeUnit", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1000Test() {
        Tag1000EnuUnderlyingTimeUnit tagData;

        tagData = new Tag1000EnuUnderlyingTimeUnit( MyEnumTimeUnit.HH );
        assertEquals( MyEnumTimeUnit.HH.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1000EnuUnderlyingTimeUnit( MyEnumTimeUnit.MM );
        assertEquals( MyEnumTimeUnit.MM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1000EnuUnderlyingTimeUnit( MyEnumTimeUnit.SS );
        assertEquals( MyEnumTimeUnit.SS.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1000EnuUnderlyingTimeUnit( MyEnumTimeUnit.DD );
        assertEquals( MyEnumTimeUnit.DD.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1000EnuUnderlyingTimeUnit( MyEnumTimeUnit.WK );
        assertEquals( MyEnumTimeUnit.WK.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1000EnuUnderlyingTimeUnit( MyEnumTimeUnit.MO );
        assertEquals( MyEnumTimeUnit.MO.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1000EnuUnderlyingTimeUnit( MyEnumTimeUnit.YR );
        assertEquals( MyEnumTimeUnit.YR.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}