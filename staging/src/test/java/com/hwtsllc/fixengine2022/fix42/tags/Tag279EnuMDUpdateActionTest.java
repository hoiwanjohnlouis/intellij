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
import com.hwtsllc.fixengine2022.fix42.enums.Enum279MDUpdateAction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag279EnuMDUpdateActionTest {
    @Test
    void FIX0279Test() {
        FIX42 fixData = FIX42.FIX279_ENU_MD_UPDATE_ACTION;
        assertEquals( "279", fixData.getID());
        assertEquals( "MD_UPDATE_ACTION", fixData.getName());
        assertEquals( "MDUpdateAction", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  279
     *  MDUpdateAction
     *
     *      0-4 msg types
     *      NEW( "0", "NEW", "0 - New" ),
     *      CHANGE( "1", "CHANGE", "1 - Change" ),
     *      DELETE( "2", "DELETE", "2 - Delete" ),
     *      DELETE_THRU( "3", "DELETE_THRU", "3 - Delete Thru" ),
     *      DELETE_FROM( "4", "DELETE_FROM", "4 - Delete From" ),
     */
    @Test
    void Tag0279Test() {
        Log279EnuMDUpdateAction tagData;

        /**
         * 0-4 msg types
         */
        tagData = new Log279EnuMDUpdateAction(Enum279MDUpdateAction.NEW);
        assertEquals( Enum279MDUpdateAction.NEW.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log279EnuMDUpdateAction(Enum279MDUpdateAction.CHANGE);
        assertEquals( Enum279MDUpdateAction.CHANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log279EnuMDUpdateAction(Enum279MDUpdateAction.DELETE);
        assertEquals( Enum279MDUpdateAction.DELETE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log279EnuMDUpdateAction(Enum279MDUpdateAction.DELETE_THRU);
        assertEquals( Enum279MDUpdateAction.DELETE_THRU.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log279EnuMDUpdateAction(Enum279MDUpdateAction.DELETE_FROM);
        assertEquals( Enum279MDUpdateAction.DELETE_FROM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}