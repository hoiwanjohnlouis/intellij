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
import com.hwtsllc.fixengine2022.fix43.enums.Enum531MassCancelResponse;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  531
 *  MassCancelResponse
 *  char
 *  <p></p>
 *  Specifies the action taken by counterparty order handling system
 *  as a result of the Order Mass Cancel Request
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Cancel Request Rejected - See MassCancelRejectReason (532)
 *  <p>    1 - Cancel orders for a security
 *  <p>    2 - Cancel orders for an Underlying Security
 *  <p>    3 - Cancel orders for a Product
 *  <p>    4 - Cancel orders for a CFICode
 *  <p></p>
 *  <p>    5 - Cancel orders for a SecurityType
 *  <p>    6 - Cancel orders for a trading session
 *  <p>    7 - Cancel All Orders
 */
class Tag531EnuMassCancelResponseTest {
    @Test
    void FIX0531Test() {
        FIX43 fixData = FIX43.FIX531_ENU_MASS_CANCEL_RESPONSE;
        assertEquals( "531", fixData.toEnumIDString());
        assertEquals( "MASS_CANCEL_RESPONSE", fixData.toEnumNameString());
        assertEquals( "MassCancelResponse", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0531Test() {
        Tag531EnuMassCancelResponse tagData;

        /*
         *  0-7 types
         */
        tagData = new Tag531EnuMassCancelResponse( Enum531MassCancelResponse.CANCEL_REQUEST_REJECTED );
        assertEquals( Enum531MassCancelResponse.CANCEL_REQUEST_REJECTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag531EnuMassCancelResponse( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_SECURITY );
        assertEquals( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_SECURITY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag531EnuMassCancelResponse( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_UNDERLYING );
        assertEquals( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_UNDERLYING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag531EnuMassCancelResponse( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_PRODUCT );
        assertEquals( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_PRODUCT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag531EnuMassCancelResponse( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_CFICODE );
        assertEquals( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_CFICODE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag531EnuMassCancelResponse( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_SECURITYTYPE );
        assertEquals( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_SECURITYTYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag531EnuMassCancelResponse( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_SESSION );
        assertEquals( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_SESSION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag531EnuMassCancelResponse( Enum531MassCancelResponse.CANCEL_ALL_ORDERS );
        assertEquals( Enum531MassCancelResponse.CANCEL_ALL_ORDERS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag531EnuMassCancelResponse tagData;

        // loop around the ENUM and process
        for ( Enum531MassCancelResponse oneEnum : Enum531MassCancelResponse.values()) {
            tagData = new Tag531EnuMassCancelResponse(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag531EnuMassCancelResponse tagData;

        // loop around the ENUM and process
        for (Enum531MassCancelResponse oneEnum : Enum531MassCancelResponse.values()) {
            tagData = new Tag531EnuMassCancelResponse(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag531EnuMassCancelResponse tagData;

        // loop around the ENUM and process
        for (Enum531MassCancelResponse oneEnum : Enum531MassCancelResponse.values()) {
            tagData = new Tag531EnuMassCancelResponse(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag531EnuMassCancelResponse tagData;

        // loop around the ENUM and process
        for (Enum531MassCancelResponse oneEnum : Enum531MassCancelResponse.values()) {
            tagData = new Tag531EnuMassCancelResponse(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag531EnuMassCancelResponse tagData;

        // loop around the ENUM and process
        for (Enum531MassCancelResponse oneEnum : Enum531MassCancelResponse.values()) {
            tagData = new Tag531EnuMassCancelResponse(oneEnum);
            assertEquals( "Tag531EnuMassCancelResponse\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}