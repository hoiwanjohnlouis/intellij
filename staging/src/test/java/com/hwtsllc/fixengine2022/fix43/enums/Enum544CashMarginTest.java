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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum544CashMarginTest {
    /**
     *  Information is the same for TAGS 544
     */
    @Test
    void Enum0544Test() {
        Enum544CashMargin enumType;

        /*
         *  1-3 types
         */
        enumType = Enum544CashMargin.CASH;
        assertEquals("1", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,CASH,1 - Cash", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum544CashMargin.MARGIN_OPEN;
        assertEquals("2", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,MARGIN_OPEN,2 - Margin Open", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum544CashMargin.MARGIN_CLOSE;
        assertEquals("3", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,MARGIN_CLOSE,3 - Margin Close", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}