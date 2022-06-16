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
 *  861
 *  ReportedPx
 *  Price
 *  <p></p>
 *  Reported price
 *  (used to differentiate from AvgPx on a confirmation
 *  of a marked-up or marked-down principal trade)
 */
class Tag861PrcReportedPxTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX861_PRC_REPORTED_PX;
        assertEquals( "861", fixData.toFIXIDString());
        assertEquals( "REPORTED_PX", fixData.toFIXNameString());
        assertEquals( "ReportedPx", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0861Test() {
        Tag861PrcReportedPx tagData;
        double oneElement;

        oneElement = Tag861PrcReportedPx.TESTA_PRC_REPORTED_PX;
        tagData = new Tag861PrcReportedPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "861", tagData.toFIXIDString());
        assertEquals( "REPORTED_PX", tagData.toFIXNameString());
        assertEquals( "ReportedPx", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag861PrcReportedPx.TESTB_PRC_REPORTED_PX;
        tagData = new Tag861PrcReportedPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag861PrcReportedPx tagData;
        double oneElement;

        oneElement = Tag861PrcReportedPx.TESTA_PRC_REPORTED_PX;
        tagData = new Tag861PrcReportedPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag861PrcReportedPx.TESTB_PRC_REPORTED_PX;
        tagData = new Tag861PrcReportedPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag861PrcReportedPx tagData;
        double oneElement;

        oneElement = Tag861PrcReportedPx.TESTB_PRC_REPORTED_PX;
        tagData = new Tag861PrcReportedPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag861PrcReportedPx tagData;
        double oneElement;

        oneElement = Tag861PrcReportedPx.TESTB_PRC_REPORTED_PX;
        tagData = new Tag861PrcReportedPx( new MyPriceType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag861PrcReportedPx tagData;
        double oneElement;

        oneElement = Tag861PrcReportedPx.TESTB_PRC_REPORTED_PX;
        tagData = new Tag861PrcReportedPx( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag861PrcReportedPx tagData;
        double oneElement;

        oneElement = Tag861PrcReportedPx.TESTA_PRC_REPORTED_PX;
        tagData = new Tag861PrcReportedPx( new MyPriceType( oneElement ) );
        assertEquals( "Tag861PrcReportedPx\n" +
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