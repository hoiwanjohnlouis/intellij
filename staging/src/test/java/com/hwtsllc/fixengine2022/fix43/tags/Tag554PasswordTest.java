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
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag554PasswordTest {
    @Test
    void FIX0554Test() {
        FIX43 fixData = FIX43.FIX554_PASSWORD;
        assertEquals( "FIX554_PASSWORD", fixData.getEnumName());
        assertEquals( "554", fixData.getID());
        assertEquals( "PASSWORD", fixData.getName());
        assertEquals( "Password", fixData.getDescription());
        assertNotEquals( "Not My FIX554_PASSWORD", fixData.getEnumName());
        assertNotEquals( "9999", fixData.getID());
        assertNotEquals( "Not My PASSWORD", fixData.getName());
        assertNotEquals( "Not My Password", fixData.getDescription());
    }
    @Test
    void Tag0554Test() {
        Tag554Password tagData = new Tag554Password("JohnWick");
        assertEquals( "JohnWick", tagData.getDataValue());
        assertNotEquals( "goodbye JohnWick", tagData.getDataValue());
    }
}