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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  147
 *  Subject
 *  String
 *  <p>
 *  The subject of an Email message
 */
class Tag147StrSubjectTest {
    @Test
    void FIX0147Test() {
        FIX41 fixData = FIX41.FIX147_STR_SUBJECT;
        assertEquals( "147", fixData.getID());
        assertEquals( "SUBJECT", fixData.getName());
        assertEquals( "Subject", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0147Test() {
        Tag147StrSubject tagData;

        tagData = new Tag147StrSubject(new MyStringType(Tag147StrSubject.TESTA_STR_SUBJECT));
        assertEquals( Tag147StrSubject.TESTA_STR_SUBJECT, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag147StrSubject(new MyStringType(Tag147StrSubject.TESTB_STR_SUBJECT));
        assertEquals( Tag147StrSubject.TESTB_STR_SUBJECT, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}