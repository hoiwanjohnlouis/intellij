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
import com.hwtsllc.fixengine2022.fix44.enums.Enum906CollAsgnRejectReason;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  906
 *  CollAsgnRejectReason
 *  int
 *  Collateral Assignment Reject Reason
 *  Valid values:
 *      0 - Unknown deal (order or trade)
 *      1 - Unknown or invalid instrument
 *      2 - Unauthorized transaction
 *      3 - Insufficient collateral
 *      4 - Invalid type of collateral
 *      5 - Excessive substitution
 *      99 - Other
 *
 *  or any value conforming to the data type Reserved100Plus
 */
public class Log906EnuCollAsgnRejectReason extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum906CollAsgnRejectReason dataValue;

    public final static Enum906CollAsgnRejectReason TESTA_ENU_COLL_ASGN_REJECT_REASON
            = Enum906CollAsgnRejectReason.INSUFFICIENT_COLLATERAL;
    public final static Enum906CollAsgnRejectReason TESTB_ENU_COLL_ASGN_REJECT_REASON
            = Enum906CollAsgnRejectReason.INVALID_INSTRUMENT;

    public Log906EnuCollAsgnRejectReason(Enum906CollAsgnRejectReason dataValue) {
        setFixType(FIX44.FIX906_ENU_COLL_ASGN_REJECT_REASON);
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
        Log906EnuCollAsgnRejectReason tagData;

        tagData = new Log906EnuCollAsgnRejectReason(TESTA_ENU_COLL_ASGN_REJECT_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log906EnuCollAsgnRejectReason(TESTB_ENU_COLL_ASGN_REJECT_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
