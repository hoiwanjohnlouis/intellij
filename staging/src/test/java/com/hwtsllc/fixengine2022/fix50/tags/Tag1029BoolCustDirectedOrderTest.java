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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.fix50.enums.Bool1029CustDirectedOrder;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1029
 *  CustDirectedOrder
 *  Boolean
 *  <p>
 *  Indicates if the customer directed this order to a specific execution venue (Y) or not (N).
 *  <p>
 *  A default of N –
 *  <p>
 *  customer didn’t direct this order – should be used in the case
 *  where the information is both missing and essential.
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - Customer directed this order to a specific execution venue" ),
 *  <p> NO( "N", "NO", "N - Execution venue not specified" ),
 */
class Tag1029BoolCustDirectedOrderTest {
    @Test
    void FIX1029Test() {
        FIX50 fixData = FIX50.FIX1029_BOOL_CUST_DIRECTED_ORDER;
        assertEquals( "1029", fixData.getID());
        assertEquals( "CUST_DIRECTED_ORDER", fixData.getName());
        assertEquals( "CustDirectedOrder", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1029Test() {
        Tag1029BoolCustDirectedOrder tagData;

        tagData = new Tag1029BoolCustDirectedOrder( Bool1029CustDirectedOrder.NO );
        assertEquals( Bool1029CustDirectedOrder.NO.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1029BoolCustDirectedOrder( Bool1029CustDirectedOrder.YES );
        assertEquals( Bool1029CustDirectedOrder.YES.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}