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
 *  206
 *  OptAttribute
 *  char
 *  <p>
 *  Can be used for SecurityType (167) =OPT to identify a particular security.
 *  <p></p>
 *  Valid values vary by SecurityExchange:
 *  <p>    *** REPLACED values - See "Replaced Features and Supported Approach" ***
 *  <p></p>
 *      For Exchange: MONEP (Paris)
 *  <p>    L = Long (a.k.a. "American")
 *  <p>    S = Short (a.k.a. "European")
 *  <p></p>
 *      For Exchanges: DTB (Frankfurt), HKSE (Hong Kong), and SOFFEX (Zurich)
 *  <p>    0-9 = single digit "version" number assigned by exchange following capital adjustments
 *               (0=current, 1=prior, 2=prior to , etc).
 */
class Tag206StrOptAttributeTest {
    @Test
    void FIX0206Test() {
        FIX41 fixData = FIX41.FIX206_STR_OPT_ATTRIBUTE;
        assertEquals( "206", fixData.getID());
        assertEquals( "OPT_ATTRIBUTE", fixData.getName());
        assertEquals( "OptAttribute", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0206Test() {
        Tag206StrOptAttribute tagData;

        tagData = new Tag206StrOptAttribute(new MyStringType(Tag206StrOptAttribute.TESTA_STR_OPT_ATTRIBUTE));
        assertEquals( Tag206StrOptAttribute.TESTA_STR_OPT_ATTRIBUTE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag206StrOptAttribute(new MyStringType(Tag206StrOptAttribute.TESTB_STR_OPT_ATTRIBUTE));
        assertEquals( Tag206StrOptAttribute.TESTB_STR_OPT_ATTRIBUTE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}