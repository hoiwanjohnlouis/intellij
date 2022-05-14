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
import com.hwtsllc.fixengine2022.fix44.enums.Enum774ConfirmRejReason;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  774
 *  ConfirmRejReason
 *  Identifies the reason for rejecting a Confirmation.
 *  Valid values:
 *      1 - Mismatched account
 *      2 - Missing settlement instructions
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
 */
public class Tag774EnuConfirmRejReason extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum774ConfirmRejReason dataValue;

    public final static Enum774ConfirmRejReason TESTA_ENU_CONFIRM_REJ_REASON
            = Enum774ConfirmRejReason.MISMATCHED_ACCOUNT;
    public final static Enum774ConfirmRejReason TESTB_ENU_CONFIRM_REJ_REASON
            = Enum774ConfirmRejReason.OTHER;

    public Tag774EnuConfirmRejReason(Enum774ConfirmRejReason dataValue) {
        setFixType(FIX44.FIX774_ENU_CONFIRM_REJ_REASON);
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
        Tag774EnuConfirmRejReason tagData;

        tagData = new Tag774EnuConfirmRejReason(TESTA_ENU_CONFIRM_REJ_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag774EnuConfirmRejReason(TESTB_ENU_CONFIRM_REJ_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
