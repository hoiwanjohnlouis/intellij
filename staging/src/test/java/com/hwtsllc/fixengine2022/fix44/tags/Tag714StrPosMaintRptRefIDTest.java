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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  714
 *  PosMaintRptRefID
 *  String
 *  <p></p>
 *  Reference to a PosMaintRptID (721) from a previous Position Maintenance Report
 *  that is being replaced or canceled.
 */
class Tag714StrPosMaintRptRefIDTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX714_STR_POS_MAINT_RPT_REF_ID;
        assertEquals( "714", fixData.toFIXIDString());
        assertEquals( "POS_MAINT_RPT_REF_ID", fixData.toFIXNameString());
        assertEquals( "PosMaintRptRefID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0714Test() {
        Tag714StrPosMaintRptRefID tagData;
        String oneElement;

        oneElement = Tag714StrPosMaintRptRefID.TESTA_STR_POS_MAINT_RPT_REF_ID;
        tagData = new Tag714StrPosMaintRptRefID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "714", tagData.toFIXIDString());
        assertEquals( "POS_MAINT_RPT_REF_ID", tagData.toFIXNameString());
        assertEquals( "PosMaintRptRefID", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag714StrPosMaintRptRefID.TESTB_STR_POS_MAINT_RPT_REF_ID;
        tagData = new Tag714StrPosMaintRptRefID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag714StrPosMaintRptRefID tagData;
        String oneElement;

        oneElement = Tag714StrPosMaintRptRefID.TESTA_STR_POS_MAINT_RPT_REF_ID;
        tagData = new Tag714StrPosMaintRptRefID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag714StrPosMaintRptRefID.TESTB_STR_POS_MAINT_RPT_REF_ID;
        tagData = new Tag714StrPosMaintRptRefID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag714StrPosMaintRptRefID tagData;
        String oneElement;

        oneElement = Tag714StrPosMaintRptRefID.TESTB_STR_POS_MAINT_RPT_REF_ID;
        tagData = new Tag714StrPosMaintRptRefID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag714StrPosMaintRptRefID tagData;
        String oneElement;

        oneElement = Tag714StrPosMaintRptRefID.TESTB_STR_POS_MAINT_RPT_REF_ID;
        tagData = new Tag714StrPosMaintRptRefID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag714StrPosMaintRptRefID tagData;
        String oneElement;

        oneElement = Tag714StrPosMaintRptRefID.TESTB_STR_POS_MAINT_RPT_REF_ID;
        tagData = new Tag714StrPosMaintRptRefID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag714StrPosMaintRptRefID tagData;
        String oneElement;

        oneElement = Tag714StrPosMaintRptRefID.TESTA_STR_POS_MAINT_RPT_REF_ID;
        tagData = new Tag714StrPosMaintRptRefID( new MyStringType( oneElement ) );
        assertEquals( "Tag714StrPosMaintRptRefID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}