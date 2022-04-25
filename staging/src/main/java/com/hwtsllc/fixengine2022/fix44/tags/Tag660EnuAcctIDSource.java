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
import com.hwtsllc.fixengine2022.fix44.enums.Enum660AcctIDSource;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  660 (same as 660, 661)
 *  Used to identify the source of the Account (1) code.
 *  This is especially useful if the account is a new account that the Respondent may not have setup yet in their system.
 *  AcctIDSource
 *  Valid values:
 *      1 - BIC
 *     	2 - SID Code
 *      3 - TFM (GSPTA)
 *     	4 - OMGEO (Alert ID)
 *     	5 - DTCC Code
 *     	99 - Other (custom or proprietary)
 */
public class Tag660EnuAcctIDSource extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum660AcctIDSource dataValue;

    public final static Enum660AcctIDSource TESTA_ENU_ACCT_ID_SOURCE
            = Enum660AcctIDSource.BIC;
    public final static Enum660AcctIDSource TESTB_ENU_ACCT_ID_SOURCE
            = Enum660AcctIDSource.OMGEO;

    public Tag660EnuAcctIDSource(Enum660AcctIDSource dataValue) {
        setFixType(FIX44.FIX660_ENU_ACCT_ID_SOURCE);
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
        Tag660EnuAcctIDSource tagData;

        tagData = new Tag660EnuAcctIDSource(TESTA_ENU_ACCT_ID_SOURCE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag660EnuAcctIDSource(TESTB_ENU_ACCT_ID_SOURCE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
