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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.enums.fix43.Enum530MassCancelRequestType;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag530EnuMassCancelRequestTypeTest {
    Tag530EnuMassCancelRequestType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum530MassCancelRequestType oneEnum : Enum530MassCancelRequestType.values()) {
            tagData = new Tag530EnuMassCancelRequestType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum530MassCancelRequestType oneEnum : Enum530MassCancelRequestType.values()) {
            tagData = new Tag530EnuMassCancelRequestType(oneEnum);
            assertEquals( "FIX530_ENU_MASS_CANCEL_REQUEST_TYPE", tagData.toFIXLabelString());
            assertEquals( "530", tagData.toFIXIDString());
            assertEquals( "MASS_CANCEL_REQUEST_TYPE", tagData.toFIXNameString());
            assertEquals( "MassCancelRequestType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum530MassCancelRequestType oneEnum : Enum530MassCancelRequestType.values()) {
            tagData = new Tag530EnuMassCancelRequestType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  530
         *  MassCancelRequestType
         *  char
         *  <p>    1 - Cancel orders for a security
         *  <p>    2 - Cancel orders for an underlying security
         *  <p>    3 - Cancel orders for a Product
         *  <p>    4 - Cancel orders for a CFICode
         *  <p>    5 - Cancel orders for a SecurityType
         */
        tagData = new Tag530EnuMassCancelRequestType( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_SECURITY );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag530EnuMassCancelRequestType( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_UNDERLYING );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag530EnuMassCancelRequestType( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_PRODUCT );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag530EnuMassCancelRequestType( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_CFICODE );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag530EnuMassCancelRequestType( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_SECURITYTYPE );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Cancel orders for a trading session
         *  <p>    7 - Cancel all orders
         */
        tagData = new Tag530EnuMassCancelRequestType( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_SESSION );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag530EnuMassCancelRequestType( Enum530MassCancelRequestType.CANCEL_ALL_ORDERS );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum530MassCancelRequestType oneEnum : Enum530MassCancelRequestType.values()) {
            tagData = new Tag530EnuMassCancelRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum530MassCancelRequestType oneEnum : Enum530MassCancelRequestType.values()) {
            tagData = new Tag530EnuMassCancelRequestType(oneEnum);
            assertEquals( "Tag530EnuMassCancelRequestType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}