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

class Tag598LegLocaleOfIssueTest {
    @Test
    void FIX0598Test() {
        FIX43 fixData = FIX43.FIX598_LEG_LOCALE_OF_ISSUE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX43.JUNK_ID, fixData.getID());
        assertNotEquals( FIX43.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0598Test() {
        Tag598LegLocaleOfIssue tagData;

    }
}