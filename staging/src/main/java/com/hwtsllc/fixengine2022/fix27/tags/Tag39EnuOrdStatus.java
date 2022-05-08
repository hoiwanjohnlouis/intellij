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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum39OrdStatus;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  39
 *  OrdStatus
 *  char
 *  Identifies current status of order.
 *
 *  *** SOME VALUES HAVE BEEN REPLACED ***
 *  *** See Replaced Features and Supported Approach ***
 *      (see Volume : "Glossary" for value definitions)
 *
 *  Valid values:
 *      0 - New
 *      1 - Partially filled
 *      2 - Filled
 *      3 - Done for day
 *      4 - Canceled
 *
 *      5 - Replaced (No longer used)
 *      6 - Pending Cancel (i.e. result of Order Cancel Request)
 *      7 - Stopped
 *      8 - Rejected
 *      9 - Suspended
 *
 *      A - Pending New
 *      B - Calculated
 *      C - Expired
 *      D - Accepted for Bidding
 *      E - Pending Replace (i.e. result of Order Cancel/Replace Request)
 */
public class Tag39EnuOrdStatus extends FIX27Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum39OrdStatus dataValue;

    public final static Enum39OrdStatus TESTA_ENU_ORDER_STATUS = Enum39OrdStatus.NEW; // fake data
    public final static Enum39OrdStatus TESTB_ENU_ORDER_STATUS = Enum39OrdStatus.ACCEPTED_FOR_BIDDING;

    public Tag39EnuOrdStatus(Enum39OrdStatus dataValue) {
        setFixType(FIX27.FIX39_ENU_ORD_STATUS);
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
        Tag39EnuOrdStatus tagData;

        tagData = new Tag39EnuOrdStatus(TESTA_ENU_ORDER_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag39EnuOrdStatus(TESTB_ENU_ORDER_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
