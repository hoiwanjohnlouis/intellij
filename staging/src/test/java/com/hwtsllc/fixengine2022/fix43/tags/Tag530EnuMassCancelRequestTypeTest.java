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
import com.hwtsllc.fixengine2022.fix43.enums.Enum530MassCancelRequestType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  530
 *  MassCancelRequestType
 *  char
 *  <p></p>
 *  Specifies scope of Order Mass Cancel Request.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Cancel orders for a security
 *  <p>    2 - Cancel orders for an underlying security
 *  <p>    3 - Cancel orders for a Product
 *  <p>    4 - Cancel orders for a CFICode
 *  <p>    5 - Cancel orders for a SecurityType
 *  <p></p>
 *  <p>    6 - Cancel orders for a trading session
 *  <p>    7 - Cancel all orders
 */
class Tag530EnuMassCancelRequestTypeTest {
    @Test
    void FIX0530Test() {
        FIX43 fixData = FIX43.FIX530_ENU_MASS_CANCEL_REQUEST_TYPE;
        assertEquals( "530", fixData.toFIXIDString());
        assertEquals( "MASS_CANCEL_REQUEST_TYPE", fixData.toFIXNameString());
        assertEquals( "MassCancelRequestType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0530Test() {
        Tag530EnuMassCancelRequestType tagData;

        /*
         *  1-7 types
         */
        tagData = new Tag530EnuMassCancelRequestType( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_SECURITY );
        assertEquals( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_SECURITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag530EnuMassCancelRequestType( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_UNDERLYING );
        assertEquals( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_UNDERLYING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag530EnuMassCancelRequestType( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_PRODUCT );
        assertEquals( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_PRODUCT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag530EnuMassCancelRequestType( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_CFICODE );
        assertEquals( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_CFICODE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag530EnuMassCancelRequestType( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_SECURITYTYPE );
        assertEquals( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_SECURITYTYPE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag530EnuMassCancelRequestType( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_SESSION );
        assertEquals( Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_SESSION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag530EnuMassCancelRequestType( Enum530MassCancelRequestType.CANCEL_ALL_ORDERS );
        assertEquals( Enum530MassCancelRequestType.CANCEL_ALL_ORDERS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}