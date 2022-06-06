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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  623
 *  LegRatioQty
 *  float
 *  <p>
 *  The ratio of quantity for this individual leg relative to the entire multileg security.
 */
class Tag623FloLegRatioQtyTest {
    @Test
    void FIX0623Test() {
        FIX43 fixData = FIX43.FIX623_FLO_LEG_RATIO_QTY;
        assertEquals( "623", fixData.toFIXIDString());
        assertEquals( "LEG_RATIO_QTY", fixData.toFIXNameString());
        assertEquals( "LegRatioQty", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0623Test() {
        Tag623FloLegRatioQty tagData;
        float oneElement;

        oneElement = Tag623FloLegRatioQty.TESTA_FLO_LEG_RATIO_QTY;
        tagData = new Tag623FloLegRatioQty( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag623FloLegRatioQty.TESTB_FLO_LEG_RATIO_QTY;
        tagData = new Tag623FloLegRatioQty( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag623FloLegRatioQty tagData;
        float oneElement;

        oneElement = Tag623FloLegRatioQty.TESTA_FLO_LEG_RATIO_QTY;
        tagData = new Tag623FloLegRatioQty( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag623FloLegRatioQty.TESTB_FLO_LEG_RATIO_QTY;
        tagData = new Tag623FloLegRatioQty( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag623FloLegRatioQty tagData;
        float oneElement;

        oneElement = Tag623FloLegRatioQty.TESTB_FLO_LEG_RATIO_QTY;
        tagData = new Tag623FloLegRatioQty( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag623FloLegRatioQty tagData;
        float oneElement;

        oneElement = Tag623FloLegRatioQty.TESTB_FLO_LEG_RATIO_QTY;
        tagData = new Tag623FloLegRatioQty( new MyFloatType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag623FloLegRatioQty tagData;
        float oneElement;

        oneElement = Tag623FloLegRatioQty.TESTB_FLO_LEG_RATIO_QTY;
        tagData = new Tag623FloLegRatioQty( new MyFloatType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag623FloLegRatioQty tagData;
        float oneElement;

        oneElement = Tag623FloLegRatioQty.TESTA_FLO_LEG_RATIO_QTY;
        tagData = new Tag623FloLegRatioQty( new MyFloatType( oneElement ) );
        assertEquals( "Tag623FloLegRatioQty\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement +
                        "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}