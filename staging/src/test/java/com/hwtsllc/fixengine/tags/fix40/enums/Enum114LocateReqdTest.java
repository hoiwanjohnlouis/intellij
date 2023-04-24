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

package com.hwtsllc.fixengine.tags.fix40.enums;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  114
 *  LocateReqd
 *  Boolean
 *  <p>
 *  Indicates whether the broker is to locate the stock in conjunction with a short sell order.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Indicates the broker is not required to locate
 *  <p>    Y - Indicates the broker is responsible for locating the stock
 */
class Enum114LocateReqdTest {
    @Test
    void Enum0114Test() {
        Enum114LocateReqd enumType;

        enumType = Enum114LocateReqd.NO;
        assertEquals("N",enumType.toFIXIDString());
        assertEquals("NO", enumType.toFIXNameString());
        assertEquals("N - Indicates the broker is not required to locate", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum114LocateReqd.YES;
        assertEquals("Y", enumType.toFIXIDString());
        assertEquals("YES", enumType.toFIXNameString());
        assertEquals("Y - Indicates the broker is responsible for locating the stock", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}