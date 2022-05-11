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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1021MDBookType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1021
 *  MDBookType
 *  int
 *  <p>
 *  Describes the type of book for which the feed is intended.
 *  <p>
 *  Used when multiple feeds are provided over the same connection
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Top of Book
 *  <p>    2 - Price Depth
 *  <p>    3 - Order Depth
 */
class Tag1021EnuMDBookTypeTest {
    @Test
    void FIX1021Test() {
        FIX50 fixData = FIX50.FIX1021_ENU_MD_BOOK_TYPE;
        assertEquals( "1021", fixData.getID());
        assertEquals( "MD_BOOK_TYPE", fixData.getName());
        assertEquals( "MDBookType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1021Test() {
        Tag1021EnuMDBookType tagData;

        tagData = new Tag1021EnuMDBookType( Enum1021MDBookType.TOP_OF_BOOK );
        assertEquals( Enum1021MDBookType.TOP_OF_BOOK.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1021EnuMDBookType( Enum1021MDBookType.PRICE_DEPTH );
        assertEquals( Enum1021MDBookType.PRICE_DEPTH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1021EnuMDBookType( Enum1021MDBookType.ORDER_DEPTH );
        assertEquals( Enum1021MDBookType.ORDER_DEPTH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}