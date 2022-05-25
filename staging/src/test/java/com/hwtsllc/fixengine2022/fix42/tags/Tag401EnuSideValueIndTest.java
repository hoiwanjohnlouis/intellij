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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum401SideValueInd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  401
 *  SideValueInd
 *  int
 *  <p>
 *  Code to identify which "SideValue" the value refers to.
 *  <p>
 *  SideValue1 and SideValue2 are used as opposed to Buy or Sell
 *  so that the basket can be quoted either way as Buy or Sell.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Side Value 1
 *  <p>    2 - Side Value 2
 */
class Tag401EnuSideValueIndTest {
    @Test
    void FIX0401Test() {
        FIX42 fixData = FIX42.FIX401_ENU_SIDE_VALUE_IND;
        assertEquals( "401", fixData.toFIXIDString());
        assertEquals( "SIDE_VALUE_IND", fixData.toFIXNameString());
        assertEquals( "SideValueInd", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0401Test() {
        Tag401EnuSideValueInd tagData;

        /*
         * 1-2 msg types
         */
        tagData = new Tag401EnuSideValueInd(Enum401SideValueInd.SIDE_VALUE_1);
        assertEquals( Enum401SideValueInd.SIDE_VALUE_1.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag401EnuSideValueInd(Enum401SideValueInd.SIDE_VALUE_2);
        assertEquals( Enum401SideValueInd.SIDE_VALUE_2.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}