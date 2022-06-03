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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum638PriorityIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  638
 *  PriorityIndicator
 *  int
 *  <p></p>
 *  Indicates if a Cancel/Replace has caused an order to lose book priority.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Priority unchanged
 *  <p>    1 - Lost Priority as result of order change
 */
class Tag638EnuPriorityIndicatorTest {
    @Test
    void FIX0638Test() {
        FIX43 fixData = FIX43.FIX638_ENU_PRIORITY_INDICATOR;
        assertEquals( "638", fixData.toFIXIDString());
        assertEquals( "PRIORITY_INDICATOR", fixData.toFIXNameString());
        assertEquals( "PriorityIndicator", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0638Test() {
        Tag638EnuPriorityIndicator tagData;

        /*
         *  0-1 types
         */
        tagData = new Tag638EnuPriorityIndicator( Enum638PriorityIndicator.PRIORITY_UNCHANGED );
        assertEquals( Enum638PriorityIndicator.PRIORITY_UNCHANGED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag638EnuPriorityIndicator( Enum638PriorityIndicator.LOST_PRIORITY );
        assertEquals( Enum638PriorityIndicator.LOST_PRIORITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}