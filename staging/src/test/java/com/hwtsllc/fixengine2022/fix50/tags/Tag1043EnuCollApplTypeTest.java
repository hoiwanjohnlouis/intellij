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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1043CollApplType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1043
 *  CollApplType
 *  int
 *  <p>
 *  conveys how the collateral should be/has been applied
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Specific Deposit
 *  <p>    1 - General
 */
class Tag1043EnuCollApplTypeTest {
    @Test
    void FIX1043Test() {
        FIX50 fixData = FIX50.FIX1043_ENU_COLL_APPL_TYPE;
        assertEquals( "1043", fixData.toFIXIDString());
        assertEquals( "COLL_APPL_TYPE", fixData.toFIXNameString());
        assertEquals( "CollApplType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1043Test() {
        Tag1043EnuCollApplType tagData;

        tagData = new Tag1043EnuCollApplType( Enum1043CollApplType.SPECIFIC_DEPOSIT );
        assertEquals( Enum1043CollApplType.SPECIFIC_DEPOSIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1043EnuCollApplType( Enum1043CollApplType.GENERAL );
        assertEquals( Enum1043CollApplType.GENERAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}