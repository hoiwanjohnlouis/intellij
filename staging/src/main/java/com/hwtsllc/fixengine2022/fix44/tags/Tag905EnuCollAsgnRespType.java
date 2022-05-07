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
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum905CollAsgnRespType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  905
 *  CollAsgnRespType
 *  int
 *  Collateral Assignment Response Type
 *  Valid values:
 *      0 - Received
 *      1 - Accepted
 *      2 - Declined
 *      3 - Rejected
 */
public class Tag905EnuCollAsgnRespType extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum905CollAsgnRespType dataValue;

    public final static Enum905CollAsgnRespType TESTA_ENU_COLL_ASGN_RESP_TYPE
            = Enum905CollAsgnRespType.ACCEPTED;
    public final static Enum905CollAsgnRespType TESTB_ENU_COLL_ASGN_RESP_TYPE
            = Enum905CollAsgnRespType.REJECTED;

    public Tag905EnuCollAsgnRespType(Enum905CollAsgnRespType dataValue) {
        setFixType(FIX44.FIX905_ENU_COLL_ASGN_RESP_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
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
        Tag905EnuCollAsgnRespType tagData;

        tagData = new Tag905EnuCollAsgnRespType(TESTA_ENU_COLL_ASGN_RESP_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag905EnuCollAsgnRespType(TESTB_ENU_COLL_ASGN_RESP_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
