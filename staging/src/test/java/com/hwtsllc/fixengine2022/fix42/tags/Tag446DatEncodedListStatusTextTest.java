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
import com.hwtsllc.fixengine2022.datatypes.MyDataType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag446DatEncodedListStatusTextTest {
    @Test
    void FIX0446Test() {
        FIX42 fixData = FIX42.FIX446_DAT_LIST_STATUS_ENCODED_TEXT;
        assertEquals( "446", fixData.getID());
        assertEquals( "LIST_STATUS_ENCODED_TEXT", fixData.getName());
        assertEquals( "ListStatusEncodedText", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0446Test() {
        Tag446DatEncodedListStatusText tagData;

        tagData = new Tag446DatEncodedListStatusText(
                new MyDataType(Tag446DatEncodedListStatusText.TESTA_DAT_LIST_STATUS_ENCODED_TEXT));
        assertEquals( Tag446DatEncodedListStatusText.TESTA_DAT_LIST_STATUS_ENCODED_TEXT, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag446DatEncodedListStatusText(
                new MyDataType(Tag446DatEncodedListStatusText.TESTB_DAT_LIST_STATUS_ENCODED_TEXT));
        assertEquals( Tag446DatEncodedListStatusText.TESTB_DAT_LIST_STATUS_ENCODED_TEXT, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue() );
    }
}
