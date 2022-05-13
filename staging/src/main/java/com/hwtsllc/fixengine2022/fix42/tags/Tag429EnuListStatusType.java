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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.fix42.enums.Enum429ListStatusType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  Tag429
 *  Enu
 *  ListStatusType
 *
 *      1-6 msg types
 *      ACK( "1", "ACK", "1 - Ack" ),
 *      RESPONSE( "2", "RESPONSE", "2 - Response" ),
 *      TIMED( "3", "TIMED", "3 - Timed" ),
 *      EXEC_STARTED( "4", "EXEC_STARTED", "4 - Exec Started" ),
 *      ALL_DONE( "5", "ALL_DONE", "5 - All Done" ),
 *      ALERT( "6", "ALERT", "6 - Alert" ),
 */
public class Tag429EnuListStatusType extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final Enum429ListStatusType dataValue;

    public final static Enum429ListStatusType TESTA_ENU_LIST_STATUS_TYPE = Enum429ListStatusType.EXEC_STARTED;
    public final static Enum429ListStatusType TESTB_ENU_LIST_STATUS_TYPE = Enum429ListStatusType.ALL_DONE;

    public Tag429EnuListStatusType(Enum429ListStatusType dataValue) {
        setFixType(FIX42.FIX429_ENU_LIST_STATUS_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag429EnuListStatusType tagData;

        tagData = new Tag429EnuListStatusType(TESTA_ENU_LIST_STATUS_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag429EnuListStatusType(TESTB_ENU_LIST_STATUS_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
