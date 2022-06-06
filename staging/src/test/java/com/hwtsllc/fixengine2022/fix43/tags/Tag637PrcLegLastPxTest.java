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
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  637
 *  LegLastPx
 *  Price
 *  <p>
 *  Execution price assigned to a leg of a multileg instrument.
 *  <p>
 *  See LastPx (31) field for description and values
 */
class Tag637PrcLegLastPxTest {
    @Test
    void FIX0637Test() {
        FIX43 fixData = FIX43.FIX637_PRC_LEG_LAST_PX;
        assertEquals( "637", fixData.toFIXIDString());
        assertEquals( "LEG_LAST_PX", fixData.toFIXNameString());
        assertEquals( "LegLastPx", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0637Test() {
        Tag637PrcLegLastPx tagData;
        double oneElement;

        oneElement = Tag637PrcLegLastPx.TESTA_PRC_LEG_LAST_PX;
        tagData = new Tag637PrcLegLastPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag637PrcLegLastPx.TESTB_PRC_LEG_LAST_PX;
        tagData = new Tag637PrcLegLastPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag637PrcLegLastPx tagData;
        double oneElement;

        oneElement = Tag637PrcLegLastPx.TESTA_PRC_LEG_LAST_PX;
        tagData = new Tag637PrcLegLastPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag637PrcLegLastPx.TESTB_PRC_LEG_LAST_PX;
        tagData = new Tag637PrcLegLastPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag637PrcLegLastPx tagData;
        double oneElement;

        oneElement = Tag637PrcLegLastPx.TESTB_PRC_LEG_LAST_PX;
        tagData = new Tag637PrcLegLastPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag637PrcLegLastPx tagData;
        double oneElement;

        oneElement = Tag637PrcLegLastPx.TESTB_PRC_LEG_LAST_PX;
        tagData = new Tag637PrcLegLastPx( new MyPriceType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag637PrcLegLastPx tagData;
        double oneElement;

        oneElement = Tag637PrcLegLastPx.TESTB_PRC_LEG_LAST_PX;
        tagData = new Tag637PrcLegLastPx( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag637PrcLegLastPx tagData;
        double oneElement;

        oneElement = Tag637PrcLegLastPx.TESTA_PRC_LEG_LAST_PX;
        tagData = new Tag637PrcLegLastPx( new MyPriceType( oneElement ) );
        assertEquals( "Tag637PrcLegLastPx\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}