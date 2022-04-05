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
        assertEquals("", enumType.getName());
        assertEquals("N,SERVER_SENDS_QUOTE_DELETE,N - Server must send an explicit delete for bids or offers falling outside the requested MarketDepth of the request", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum547MDImplicitDelete.CLIENT_DELETES_QUOTE;
        assertEquals("Y", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("[Y,CLIENT_DELETES_QUOTE,Y - Client has responsibility for implicitly deleting bids or offers falling outside the MarketDepth of the request", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}