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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  860
 *  AvgParPx
 *  Price
 *  <p></p>
 *  Used to express average price as percent of par
 *  (used where AvgPx field is expressed in some other way)
 */
class Tag860PrcAvgParPxTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX860_PRC_AVG_PAR_PX;
        assertEquals( "860", fixData.toFIXIDString());
        assertEquals( "AVG_PAR_PX", fixData.toFIXNameString());
        assertEquals( "AvgParPx", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0860Test() {
        Tag860PrcAvgParPx tagData;
        double oneElement;

        oneElement = Tag860PrcAvgParPx.TESTA_PRC_AVG_PAR_PX;
        tagData = new Tag860PrcAvgParPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "860", tagData.toFIXIDString());
        assertEquals( "AVG_PAR_PX", tagData.toFIXNameString());
        assertEquals( "AvgParPx", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag860PrcAvgParPx.TESTB_PRC_AVG_PAR_PX;
        tagData = new Tag860PrcAvgParPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag860PrcAvgParPx tagData;
        double oneElement;

        oneElement = Tag860PrcAvgParPx.TESTA_PRC_AVG_PAR_PX;
        tagData = new Tag860PrcAvgParPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag860PrcAvgParPx.TESTB_PRC_AVG_PAR_PX;
        tagData = new Tag860PrcAvgParPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag860PrcAvgParPx tagData;
        double oneElement;

        oneElement = Tag860PrcAvgParPx.TESTB_PRC_AVG_PAR_PX;
        tagData = new Tag860PrcAvgParPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag860PrcAvgParPx tagData;
        double oneElement;

        oneElement = Tag860PrcAvgParPx.TESTB_PRC_AVG_PAR_PX;
        tagData = new Tag860PrcAvgParPx( new MyPriceType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag860PrcAvgParPx tagData;
        double oneElement;

        oneElement = Tag860PrcAvgParPx.TESTB_PRC_AVG_PAR_PX;
        tagData = new Tag860PrcAvgParPx( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag860PrcAvgParPx tagData;
        double oneElement;

        oneElement = Tag860PrcAvgParPx.TESTA_PRC_AVG_PAR_PX;
        tagData = new Tag860PrcAvgParPx( new MyPriceType( oneElement ) );
        assertEquals( "Tag860PrcAvgParPx\n" +
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