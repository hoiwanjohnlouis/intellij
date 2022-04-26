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
import com.hwtsllc.fixengine2022.fix44.enums.Enum798AllocAccountType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag798EnuAllocAccountTypeTest {
    @Test
    void FIX0798Test() {
        FIX44 fixData = FIX44.FIX798_ENU_ALLOC_ACCOUNT_TYPE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  798 (same as 581, 798)
     *  AllocAccountType
     *  Type of account associated with a confirmation or other trade-level message
     *  Valid values:
     *      1 - Account is carried on customer side of books
     *      2 - Account is carried on non-customer side of books
     *      3 - House trader
     *      4 - Floor trader
     *      6 - Account is carried on non-customer side of books and is cross margined
     *      7 - Account is house trader and is cross margined
     *      8 - Joint back office account (JBO)
     */
    @Test
    void Tag0798Test() {
        Tag798EnuAllocAccountType tagData;

        /*
         *  1-4, types
         */
        tagData = Enum798AllocAccountType.CUSTOMER_BOOK;
        tagData = Enum798AllocAccountType.NON_CUSTOMER_BOOK;
        tagData = Enum798AllocAccountType.HOUSE_TRADER;
        tagData = Enum798AllocAccountType.FLOOR_TRADER;



        /*
         *  6-8, types
         */
        tagData = Enum798AllocAccountType.NON_CUSTOMER_CROSSED_MARGIN_BOOK;
        tagData = Enum798AllocAccountType.HOUSE_TRADER_CROSSED_MARGIN_BOOK;
        tagData = Enum798AllocAccountType.JOINT_BACK_OFFICE;
    }
}