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

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum591PreallocMethodTest {
    /**
     *  Information is the same for TAGS 591
     */
    @Test
    void Enum0591Test() {
        Enum591PreallocMethod enumType;

        /*
         *  0-1 types
         */
        enumType = Enum591PreallocMethod.PRO_RATA;
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum591PreallocMethod.DO_NOT_PRO_RATA;
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}