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
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  153
 *  AllocAvgPx
 *  Price
 *  <p>
 *  AvgPx (6) for a specific AllocAccount (79)
 *  <p>
 *  For Fixed Income this is always expressed as "percent of par" price type.
 */
class Tag153PrcAllocAvgPxTest {
    @Test
    void FIX0153Test() {
        FIX41 fixData = FIX41.FIX153_PRC_ALLOC_AVG_PX;
        assertEquals( "153", fixData.toEnumIDString());
        assertEquals( "ALLOC_AVG_PX", fixData.toEnumNameString());
        assertEquals( "AllocAvgPx", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0153Test() {
        Tag153PrcAllocAvgPx tagData;

        tagData = new Tag153PrcAllocAvgPx(new MyPriceType(Tag153PrcAllocAvgPx.TESTA_PRC_ALLOC_AVG_PX));
        assertEquals( Tag153PrcAllocAvgPx.TESTA_PRC_ALLOC_AVG_PX, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag153PrcAllocAvgPx(new MyPriceType(Tag153PrcAllocAvgPx.TESTB_PRC_ALLOC_AVG_PX));
        assertEquals( Tag153PrcAllocAvgPx.TESTB_PRC_ALLOC_AVG_PX, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag153PrcAllocAvgPx tagData;

        tagData = new Tag153PrcAllocAvgPx(new MyPriceType(Tag153PrcAllocAvgPx.TESTB_PRC_ALLOC_AVG_PX));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag153PrcAllocAvgPx tagData;

        tagData = new Tag153PrcAllocAvgPx(new MyPriceType(Tag153PrcAllocAvgPx.TESTB_PRC_ALLOC_AVG_PX));
        assertEquals( Tag153PrcAllocAvgPx.TESTB_PRC_ALLOC_AVG_PX, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag153PrcAllocAvgPx tagData;

        tagData = new Tag153PrcAllocAvgPx(new MyPriceType(Tag153PrcAllocAvgPx.TESTB_PRC_ALLOC_AVG_PX));
        assertEquals( tagData.toEnumIDString() + "=" + Tag153PrcAllocAvgPx.TESTB_PRC_ALLOC_AVG_PX,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag153PrcAllocAvgPx tagData;

        tagData = new Tag153PrcAllocAvgPx(new MyPriceType(Tag153PrcAllocAvgPx.TESTB_PRC_ALLOC_AVG_PX));
        assertEquals( String.valueOf(Tag153PrcAllocAvgPx.TESTB_PRC_ALLOC_AVG_PX),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag153PrcAllocAvgPx tagData;

        tagData = new Tag153PrcAllocAvgPx(new MyPriceType(Tag153PrcAllocAvgPx.TESTA_PRC_ALLOC_AVG_PX));
        assertEquals( "Tag153PrcAllocAvgPx\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag153PrcAllocAvgPx.TESTA_PRC_ALLOC_AVG_PX + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag153PrcAllocAvgPx.TESTA_PRC_ALLOC_AVG_PX + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}