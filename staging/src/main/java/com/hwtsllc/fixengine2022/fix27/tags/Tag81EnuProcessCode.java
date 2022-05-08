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
import com.hwtsllc.fixengine2022.fix27.enums.Enum81ProcessCode;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  81
 *  ProcessCode
 *  char
 *  Processing code for sub-account.
 *  Absence of this field in AllocAccount (79), AllocPrice (366),
 *  AllocQty (80), ProcessCode instance indicates regular trade.
 *  Valid values:
 *      0 - Regular
 *      1 - Soft Dollar
 *      2 - Step-In
 *      3 - Step-Out
 *      4 - Soft-dollar Step-In
 *      5 - Soft-dollar Step-Out
 *      6 - Plan Sponsor
 */
public class Tag81EnuProcessCode extends FIX27Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum81ProcessCode dataValue;

    public final static Enum81ProcessCode TESTA_ENU_PROCESS_CODE = Enum81ProcessCode.REGULAR;
    public final static Enum81ProcessCode TESTB_ENU_PROCESS_CODE = Enum81ProcessCode.PLAN_SPONSOR;

    public Tag81EnuProcessCode(Enum81ProcessCode dataValue) {
        setFixType(FIX27.FIX81_ENU_PROCESS_CODE);
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
        Tag81EnuProcessCode tagData;

        tagData = new Tag81EnuProcessCode(TESTA_ENU_PROCESS_CODE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag81EnuProcessCode(TESTB_ENU_PROCESS_CODE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}