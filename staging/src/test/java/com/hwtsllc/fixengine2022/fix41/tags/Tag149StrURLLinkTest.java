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
 *  149
 *  URLLink
 *  String
 *  <p>
 *  A URI (Uniform Resource Identifier) or URL (Uniform Resource Locator)
 *  link to additional information (i.e. http://www.XYZ.com/research.html)
 *  <p>
 *  See "Appendix 6-B FIX Fields Based Upon Other Standards"
 */
class Tag149StrURLLinkTest {
    @Test
    void FIX0149Test() {
        FIX41 fixData = FIX41.FIX149_STR_URL_LINK;
        assertEquals( "149", fixData.toFIXIDString());
        assertEquals( "URL_LINK", fixData.toFIXNameString());
        assertEquals( "URLLink", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0149Test() {
        Tag149StrURLLink tagData;

        tagData = new Tag149StrURLLink(new MyStringType(Tag149StrURLLink.TESTA_STR_URL_LINK));
        assertEquals( Tag149StrURLLink.TESTA_STR_URL_LINK, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag149StrURLLink(new MyStringType(Tag149StrURLLink.TESTB_STR_URL_LINK));
        assertEquals( Tag149StrURLLink.TESTB_STR_URL_LINK, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}