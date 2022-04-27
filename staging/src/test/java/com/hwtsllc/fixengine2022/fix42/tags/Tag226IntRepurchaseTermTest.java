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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Deprecated
class Tag226IntRepurchaseTermTest {
    @Test
    void FIX0226Test() {
        FIX42 fixData = FIX42.FIX226_INT_REPURCHASE_TERM;
        assertEquals( "226", fixData.getID());
        assertEquals( "REPURCHASE_TERM", fixData.getName());
        assertEquals( "RepurchaseTerm", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0226Test() {
        Tag226IntRepurchaseTerm tagData;

        tagData = new Tag226IntRepurchaseTerm(new MyIntType(
                Tag226IntRepurchaseTerm.TESTA_INT_REPURCHASE_TERM));
        assertEquals( Tag226IntRepurchaseTerm.TESTA_INT_REPURCHASE_TERM,
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag226IntRepurchaseTerm(new MyIntType(
                Tag226IntRepurchaseTerm.TESTB_INT_REPURCHASE_TERM));
        assertEquals( Tag226IntRepurchaseTerm.TESTB_INT_REPURCHASE_TERM,
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
}