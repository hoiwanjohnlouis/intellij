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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  315 (same as 201, 315)
 *  UnderlyingPutOrCall
 *
 *      PUT( "0", "PUT", "0 - Put" ),
 *      CALL( "1", "CALL", "1 - Call" ),
 */
class Enum315PutOrCallTest {
    @Test
    void Enum0315Test() {
        Enum315PutOrCall enumType;

        /**
         *  PUT( "0", "PUT", "0 - Put" ),
         *  CALL( "1", "CALL", "1 - Call" ),
         */
        enumType = Enum315PutOrCall.PUT;
        assertEquals( "0", enumType.getID());
        assertEquals( "PUT", enumType.getName());
        assertEquals( "0 - Put", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum315PutOrCall.CALL;
        assertEquals( "1", enumType.getID());
        assertEquals( "CALL", enumType.getName());
        assertEquals( "1 - Call", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}