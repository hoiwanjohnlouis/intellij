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
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  961
 *  HostCrossID
 *  String
 *  <p>
 *  Host assigned entity ID that can be used to reference all components of a cross;
 *  sides + strategy + legs.
 *  <p>
 *  Used as the primary key with which to refer to the Cross Order for cancellation and replace.
 *  <p>
 *  The HostCrossID will also be used to link together components of the Cross Order.
 *  <p>
 *  i.e. each individual Execution Report associated with the order will carry
 *  HostCrossID in order to tie back to the original cross order.
 */
class Tag961StrHostCrossIDTest {
    @Test
    void FIX0961Test() {
        FIX50 fixData = FIX50.FIX961_HOST_CROSS_ID;
        assertEquals( "961", fixData.getID());
        assertEquals( "HOST_CROSS_ID", fixData.getName());
        assertEquals( "HostCrossID", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0961Test() {
        Tag961StrHostCrossID tagData;

    }
}