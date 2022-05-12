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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  146
 *  NoRelatedSym
 *  NumInGroup
 *  <p>
 *  Specifies the number of repeating symbols specified.
 */
class Tag146NumNoRelatedSymTest {
    @Test
    void FIX0146Test() {
        FIX41 fixData = FIX41.FIX146_NUM_NO_RELATED_SYM;
        assertEquals( "146", fixData.getID());
        assertEquals( "NO_RELATED_SYM", fixData.getName());
        assertEquals( "NoRelatedSym", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0146Test() {
        Log146NumNoRelatedSym tagData;

        tagData = new Log146NumNoRelatedSym(new MyNumInGroupType(Log146NumNoRelatedSym.TESTA_NUM_NO_RELATED_SYM));
        assertEquals( Log146NumNoRelatedSym.TESTA_NUM_NO_RELATED_SYM, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());

        tagData = new Log146NumNoRelatedSym(new MyNumInGroupType(Log146NumNoRelatedSym.TESTB_NUM_NO_RELATED_SYM));
        assertEquals( Log146NumNoRelatedSym.TESTB_NUM_NO_RELATED_SYM, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
}