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

class Tag401EnuSideValueIndTest {
    @Test
    void FIX0401Test() {
        FIX42 fixData = FIX42.FIX401_ENU_SIDE_VALUE_IND;
        assertEquals( "401", fixData.getID());
        assertEquals( "SIDE_VALUE_IND", fixData.getName());
        assertEquals( "SideValueInd", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag401
     *  Enu
     *  SideValueInd
     *
     *      1-2 msg types
     *      SIDE_VALUE_1( "1", "SIDE_VALUE_1", "1 - Side Value 1" ),
     *      SIDE_VALUE_2( "2", "SIDE_VALUE_2", "2 - Side Value 2" ),
     */
    @Test
    void Tag0401Test() {
        Log401EnuSideValueInd tagData;

        /**
         * 1-2 msg types
         */
        tagData = new Log401EnuSideValueInd(Enum401SideValueInd.SIDE_VALUE_1);
        assertEquals( Enum401SideValueInd.SIDE_VALUE_1.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log401EnuSideValueInd(Enum401SideValueInd.SIDE_VALUE_2);
        assertEquals( Enum401SideValueInd.SIDE_VALUE_2.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}