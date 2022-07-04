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
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  389
 *  DiscretionOffsetValue
 *  float
 *  <p>
 *  Amount (signed) added to the "related to" price specified via DiscretionInst (388),
 *  in the context of DiscretionOffsetType (842)
 *  <p></p>
 *  (Prior to FIX 4.4 this field was of type PriceOffset)
 */
class Tag389FloDiscretionOffsetValueTest {
    @Test
    void FIX0389Test() {
        FIX42 fixData = FIX42.FIX389_FLO_DISCRETION_OFFSET_VALUE;
        assertEquals( "389", fixData.toEnumIDString());
        assertEquals( "DISCRETION_OFFSET_VALUE", fixData.toEnumNameString());
        assertEquals( "DiscretionOffsetValue", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0389Test() {
        Tag389FloDiscretionOffsetValue tagData;
        float oneElement;

        oneElement = Tag389FloDiscretionOffsetValue.TESTA_FLO_DISCRETION_OFFSET_VALUE;
        tagData = new Tag389FloDiscretionOffsetValue( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag389FloDiscretionOffsetValue.TESTB_FLO_DISCRETION_OFFSET_VALUE;
        tagData = new Tag389FloDiscretionOffsetValue( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag389FloDiscretionOffsetValue tagData;
        float oneElement;

        oneElement = Tag389FloDiscretionOffsetValue.TESTB_FLO_DISCRETION_OFFSET_VALUE;
        tagData = new Tag389FloDiscretionOffsetValue( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag389FloDiscretionOffsetValue tagData;
        float oneElement;

        oneElement = Tag389FloDiscretionOffsetValue.TESTB_FLO_DISCRETION_OFFSET_VALUE;
        tagData = new Tag389FloDiscretionOffsetValue( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag389FloDiscretionOffsetValue tagData;
        float oneElement;

        oneElement = Tag389FloDiscretionOffsetValue.TESTB_FLO_DISCRETION_OFFSET_VALUE;
        tagData = new Tag389FloDiscretionOffsetValue( new MyFloatType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag389FloDiscretionOffsetValue tagData;
        float oneElement;

        oneElement = Tag389FloDiscretionOffsetValue.TESTB_FLO_DISCRETION_OFFSET_VALUE;
        tagData = new Tag389FloDiscretionOffsetValue( new MyFloatType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag389FloDiscretionOffsetValue tagData;
        float oneElement;

        oneElement = Tag389FloDiscretionOffsetValue.TESTA_FLO_DISCRETION_OFFSET_VALUE;
        tagData = new Tag389FloDiscretionOffsetValue( new MyFloatType( oneElement ) );
        assertEquals( "Tag389FloDiscretionOffsetValue\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement +
                        "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}