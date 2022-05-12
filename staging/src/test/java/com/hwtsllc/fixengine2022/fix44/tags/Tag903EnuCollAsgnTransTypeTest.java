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
import com.hwtsllc.fixengine2022.fix44.enums.Enum903CollAsgnTransType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  903
 *  CollAsgnTransType
 *  int
 *  Collateral Assignment Transaction Type
 *  Valid values:
 *      0 - New
 *      1 - Replace
 *      2 - Cancel
 *      3 - Release
 *      4 - Reverse
 */
class Tag903EnuCollAsgnTransTypeTest {
    @Test
    void FIX0903Test() {
        FIX44 fixData = FIX44.FIX903_ENU_COLL_ASGN_TRANS_TYPE;
        assertEquals( "903", fixData.getID());
        assertEquals( "COLL_ASGN_TRANS_TYPE", fixData.getName());
        assertEquals( "CollAsgnTransType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0903Test() {
        Log903EnuCollAsgnTransType tagData;

        tagData = new Log903EnuCollAsgnTransType( Enum903CollAsgnTransType.NEW );
        assertEquals( Enum903CollAsgnTransType.NEW.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log903EnuCollAsgnTransType( Enum903CollAsgnTransType.REPLACE );
        assertEquals( Enum903CollAsgnTransType.REPLACE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log903EnuCollAsgnTransType( Enum903CollAsgnTransType.CANCEL );
        assertEquals( Enum903CollAsgnTransType.CANCEL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log903EnuCollAsgnTransType( Enum903CollAsgnTransType.RELEASE );
        assertEquals( Enum903CollAsgnTransType.RELEASE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log903EnuCollAsgnTransType( Enum903CollAsgnTransType.REVERSE );
        assertEquals( Enum903CollAsgnTransType.REVERSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}