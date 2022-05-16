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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1024MDOriginType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1024
 *  MDOriginType
 *  int
 *  <p>
 *  Used to describe the origin of an entry in the book
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Book
 *  <p>    1 - Off-Book
 *  <p>    2 - Cross
 */
class Tag1024EnuMDOriginTypeTest {
    @Test
    void FIX1024Test() {
        FIX50 fixData = FIX50.FIX1024_ENU_MD_ORIGIN_TYPE;
        assertEquals( "1024", fixData.toFIXIDString());
        assertEquals( "MD_ORIGIN_TYPE", fixData.toFIXNameString());
        assertEquals( "MDOriginType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1024Test() {
        Tag1024EnuMDOriginType tagData;

        tagData = new Tag1024EnuMDOriginType( Enum1024MDOriginType.BOOK );
        assertEquals( Enum1024MDOriginType.BOOK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1024EnuMDOriginType( Enum1024MDOriginType.OFF_BOOK );
        assertEquals( Enum1024MDOriginType.OFF_BOOK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1024EnuMDOriginType( Enum1024MDOriginType.CROSS );
        assertEquals( Enum1024MDOriginType.CROSS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}