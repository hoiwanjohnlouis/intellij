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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1070MDQuoteType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1070
 *  MDQuoteType
 *  int
 *  <p>
 *  Identifies market data quote type.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Indicative
 *  <p>    1 - Tradeable
 *  <p>    2 - Restricted Tradeable
 *  <p>    3 - Counter
 *  <p>    4 - Indicative and Tradeable
 */
class Tag1070EnuMDQuoteTypeTest {
    @Test
    void FIX1070Test() {
        FIX50 fixData = FIX50.FIX1070_ENU_MD_QUOTE_TYPE;
        assertEquals( "1070", fixData.toFIXIDString());
        assertEquals( "MD_QUOTE_TYPE", fixData.toFIXNameString());
        assertEquals( "MDQuoteType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1070Test() {
        Tag1070EnuMDQuoteType tagData;

        tagData = new Tag1070EnuMDQuoteType( Enum1070MDQuoteType.INDICATIVE );
        assertEquals( Enum1070MDQuoteType.INDICATIVE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1070EnuMDQuoteType( Enum1070MDQuoteType.TRADEABLE );
        assertEquals( Enum1070MDQuoteType.TRADEABLE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1070EnuMDQuoteType( Enum1070MDQuoteType.RESTRICTED );
        assertEquals( Enum1070MDQuoteType.RESTRICTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1070EnuMDQuoteType( Enum1070MDQuoteType.COUNTER );
        assertEquals( Enum1070MDQuoteType.COUNTER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1070EnuMDQuoteType( Enum1070MDQuoteType.INDICATIVE_TRADEABLE );
        assertEquals( Enum1070MDQuoteType.INDICATIVE_TRADEABLE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}