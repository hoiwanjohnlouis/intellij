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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum547MDImplicitDeleteTest {
    /**
     *  Information is the same for TAGS 547
     */
    @Test
    void Enum0547Test() {
        Enum547MDImplicitDelete enumType;

        /*
         *  N, and Y types
         */
        enumType = Enum547MDImplicitDelete.SERVER_SENDS_QUOTE_DELETE;
        assertEquals("N", enumType.getID());
        assertEquals("SERVER_SENDS_QUOTE_DELETE", enumType.getName());
        assertEquals("N - Server must send an explicit delete for bids or offers falling outside the requested MarketDepth of the request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum547MDImplicitDelete.CLIENT_DELETES_QUOTE;
        assertEquals("Y", enumType.getID());
        assertEquals("CLIENT_DELETES_QUOTE", enumType.getName());
        assertEquals("Y - Client has responsibility for implicitly deleting bids or offers falling outside the MarketDepth of the request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}