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
import com.hwtsllc.fixengine2022.fix44.enums.Enum935NetworkRequestType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  935
 *  NetworkRequestType
 *  int
 *  Indicates the type and level of details required for a Network Status Request Message Boolean logic applies
 *  e.g. If you want to subscribe for changes to certain id’s then UserRequestType = 0 (8+2), Snapshot for certain ID’s = 9 (8+1)
 *  Valid values:
 *      1 - Snapshot
 *      2 - Subscribe
 *      4 - Stop Subscribing
 *      8 - Level of Detail, then NoCompID's becomes required
 */
class Tag935EnuNetworkRequestTypeTest {
    @Test
    void FIX0935Test() {
        FIX44 fixData = FIX44.FIX935_ENU_NETWORK_REQUEST_TYPE;
        assertEquals( "935", fixData.getID());
        assertEquals( "NETWORK_REQUEST_TYPE", fixData.getName());
        assertEquals( "NetworkRequestType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0935Test() {
        Tag935EnuNetworkRequestType tagData;

        tagData = new Tag935EnuNetworkRequestType( Enum935NetworkRequestType.SNAPSHOT );
        assertEquals( Enum935NetworkRequestType.SNAPSHOT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag935EnuNetworkRequestType( Enum935NetworkRequestType.SUBSCRIBE );
        assertEquals( Enum935NetworkRequestType.SUBSCRIBE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag935EnuNetworkRequestType( Enum935NetworkRequestType.STOP_SUBSCRIBING );
        assertEquals( Enum935NetworkRequestType.STOP_SUBSCRIBING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag935EnuNetworkRequestType( Enum935NetworkRequestType.LEVEL_OF_DETAIL );
        assertEquals( Enum935NetworkRequestType.LEVEL_OF_DETAIL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}