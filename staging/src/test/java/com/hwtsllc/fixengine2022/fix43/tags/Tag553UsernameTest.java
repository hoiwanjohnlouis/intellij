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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag553UsernameTest {
    @Test
    void FIX0553Test() {
        FIXType fixData = FIXType.FIX553_USERNAME;
        assertEquals( "FIX553_USERNAME", fixData.getEnumName());
        assertEquals( "553", fixData.getID());
        assertEquals( "USERNAME", fixData.getName());
        assertEquals( "Username", fixData.getDescription());
        assertNotEquals( "Not My FIX553_USERNAME", fixData.getEnumName());
        assertNotEquals( "9999", fixData.getID());
        assertNotEquals( "Not My USERNAME", fixData.getName());
        assertNotEquals( "Not My Username", fixData.getDescription());
    }
    @Test
    void Tag0553Test() {
        Tag553Username tagData = new Tag553Username("JohnWick");
        assertEquals( "JohnWick", tagData.getDataValue());
        assertNotEquals( "goodbye JohnWick", tagData.getDataValue());
    }

}