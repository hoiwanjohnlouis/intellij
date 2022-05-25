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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  213
 *  XmlData
 *  data
 *  <p>
 *  Actual XML data stream (e.g. FIXML).
 *  <p>
 *  See approriate XML reference (e.g. FIXML).
 *  <p></p>
 *  Note: may contain embedded SOH characters.
 */
class Tag213DatXmlDataTest {
    @Test
    void FIX0213Test() {
        FIX42 fixData = FIX42.FIX213_DAT_XML_DATA;
        assertEquals( "213", fixData.toFIXIDString());
        assertEquals( "XML_DATA", fixData.toFIXNameString());
        assertEquals( "XmlData", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0213Test() {
        Tag213DatXmlData tagData;

        tagData = new Tag213DatXmlData(new MyDataType(Tag213DatXmlData.TESTA_DAT_XML_DATA));
        assertEquals( Tag213DatXmlData.TESTA_DAT_XML_DATA, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag213DatXmlData(new MyDataType(Tag213DatXmlData.TESTB_DAT_XML_DATA));
        assertEquals( Tag213DatXmlData.TESTB_DAT_XML_DATA, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue() );
    }
}