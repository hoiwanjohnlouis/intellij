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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum906CollAsgnRejectReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  906
 *  CollAsgnRejectReason
 *  int
 *  <p></p>
 *  Collateral Assignment Reject Reason
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Unknown deal (order or trade)
 *  <p>    1 - Unknown or invalid instrument
 *  <p>    2 - Unauthorized transaction
 *  <p>    3 - Insufficient collateral
 *  <p>    4 - Invalid type of collateral
 *  <p></p>
 *  <p>    5 - Excessive substitution
 *  <p></p>
 *  <p>    99 - Other
 *  <p></p>
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Tag906EnuCollAsgnRejectReasonTest {
    @Test
    void FIX0906Test() {
        FIX44 fixData = FIX44.FIX906_ENU_COLL_ASGN_REJECT_REASON;
        assertEquals( "906", fixData.toFIXIDString());
        assertEquals( "COLL_ASGN_REJECT_REASON", fixData.toFIXNameString());
        assertEquals( "CollAsgnRejectReason", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0906Test() {
        Tag906EnuCollAsgnRejectReason tagData;

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.UNKNOWN_DEAL );
        assertEquals( Enum906CollAsgnRejectReason.UNKNOWN_DEAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.INVALID_INSTRUMENT );
        assertEquals( Enum906CollAsgnRejectReason.INVALID_INSTRUMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.UNAUTHORIZED_TRANSACTION );
        assertEquals( Enum906CollAsgnRejectReason.UNAUTHORIZED_TRANSACTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.INSUFFICIENT_COLLATERAL );
        assertEquals( Enum906CollAsgnRejectReason.INSUFFICIENT_COLLATERAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.INVALID_COLLATERAL );
        assertEquals( Enum906CollAsgnRejectReason.INVALID_COLLATERAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.EXCESSIVE_SUBSTITUTION );
        assertEquals( Enum906CollAsgnRejectReason.EXCESSIVE_SUBSTITUTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.OTHER );
        assertEquals( Enum906CollAsgnRejectReason.OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}