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

import com.hwtsllc.fixengine2022.datatypes.MyEnumOrderSource;
import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1032 (same as 1032, 1034,)
 *  OrderHandlingInstSource
 *  int
 *  <p>
 *  Identifies the class or source of the “OrderHandlingInst” values.
 *  <p>
 *  Scope of this will apply to both CustOrderHandlingInst and DeskOrderHandlingInst fields.
 *  <p>
 *  Required if CustOrderHandlingInst and/or DeskOrderHandlingInst is specified.
 *  <p></p>
 *  1034
 *  DeskTypeSource
 *  int
 *  <p></p>
 *  Valid values:
 *  <p>    1 - NASD OATS
 */
class Tag1034EnuDeskTypeSourceTest {
    @Test
    void FIX1034Test() {
        FIX50 fixData = FIX50.FIX1034_ENU_DESK_TYPE_SOURCE;
        assertEquals( "1034", fixData.getID());
        assertEquals( "DESK_TYPE_SOURCE", fixData.getName());
        assertEquals( "DeskTypeSource", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1034Test() {
        Tag1034EnuDeskTypeSource tagData;

        tagData = new Tag1034EnuDeskTypeSource( MyEnumOrderSource.NASD_OATS );
        assertEquals( MyEnumOrderSource.NASD_OATS.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}