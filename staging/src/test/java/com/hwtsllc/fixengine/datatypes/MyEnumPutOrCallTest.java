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

package com.hwtsllc.fixengine.datatypes;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  201 (same as 201, 315)
 *  PutOrCall
 *  int
 *  <p>
 *  Deprecated in FIX.4.2 Indicates whether an Option is for a put or call
 *  <p></p>
 *  315
 *  UnderlyingPutOrCall
 *  int
 *  <p>
 *  Deprecated in FIX.4.2 Underlying security's PutOrCall. See PutOrCall field for description
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Put
 *  <p>    1 - Call
 */
class MyEnumPutOrCallTest {
    @Test
    void Enum0201Test() {
        MyEnumPutOrCall enumType;

        /*
         * 0-1 msg types
         */
        enumType = MyEnumPutOrCall.PUT;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("PUT", enumType.toFIXNameString());
        assertEquals("0 - Put", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPutOrCall.CALL;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("CALL", enumType.toFIXNameString());
        assertEquals("1 - Call", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}