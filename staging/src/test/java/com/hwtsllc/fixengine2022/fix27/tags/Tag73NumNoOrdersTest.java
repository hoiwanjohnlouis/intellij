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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag73NumNoOrdersTest {

    @Test
    void FIX0073Test() {
        FIX27 fixData = FIX27.FIX73_NUM_NO_ORDERS;
        assertEquals( "NO_ORDERS", fixData.getName());
        assertEquals( "73", fixData.getID());
        assertEquals( "NoOrders", fixData.getDescription());
        assertNotEquals( FIX27.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIX27.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX27.JUNK_ID, fixData.getID());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0073Test() {
        Tag73NumNoOrders tagData;

        tagData = new Tag73NumNoOrders(new MyNumInGroupType(24601));
        assertEquals( 24601, tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
}