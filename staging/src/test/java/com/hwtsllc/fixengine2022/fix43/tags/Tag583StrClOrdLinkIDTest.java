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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  583
 *  ClOrdLinkID
 *  String
 *  <p>
 *  Permits order originators to tie together groups of orders in which trades resulting
 *  from orders are associated for a specific purpose.
 *  <p>
 *  For example the calculation of average execution price for a customer or to
 *  associate lists submitted to a broker as waves of a larger program trade.
 */
class Tag583StrClOrdLinkIDTest {
    @Test
    void FIX0583Test() {
        FIX43 fixData = FIX43.FIX583_STR_CL_ORD_LINK_ID;
        assertEquals( "583", fixData.toEnumIDString());
        assertEquals( "CL_ORD_LINK_ID", fixData.toEnumNameString());
        assertEquals( "ClOrdLinkID", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0583Test() {
        Tag583StrClOrdLinkID tagData;
        String oneElement;

        oneElement = Tag583StrClOrdLinkID.TESTA_STR_CL_ORD_LINK_ID;
        tagData = new Tag583StrClOrdLinkID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag583StrClOrdLinkID.TESTB_STR_CL_ORD_LINK_ID;
        tagData = new Tag583StrClOrdLinkID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag583StrClOrdLinkID tagData;
        String oneElement;

        oneElement = Tag583StrClOrdLinkID.TESTA_STR_CL_ORD_LINK_ID;
        tagData = new Tag583StrClOrdLinkID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag583StrClOrdLinkID.TESTB_STR_CL_ORD_LINK_ID;
        tagData = new Tag583StrClOrdLinkID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag583StrClOrdLinkID tagData;
        String oneElement;

        oneElement = Tag583StrClOrdLinkID.TESTB_STR_CL_ORD_LINK_ID;
        tagData = new Tag583StrClOrdLinkID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag583StrClOrdLinkID tagData;
        String oneElement;

        oneElement = Tag583StrClOrdLinkID.TESTB_STR_CL_ORD_LINK_ID;
        tagData = new Tag583StrClOrdLinkID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag583StrClOrdLinkID tagData;
        String oneElement;

        oneElement = Tag583StrClOrdLinkID.TESTB_STR_CL_ORD_LINK_ID;
        tagData = new Tag583StrClOrdLinkID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag583StrClOrdLinkID tagData;
        String oneElement;

        oneElement = Tag583StrClOrdLinkID.TESTA_STR_CL_ORD_LINK_ID;
        tagData = new Tag583StrClOrdLinkID( new MyStringType( oneElement ) );
        assertEquals( "Tag583StrClOrdLinkID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}